/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Movimiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorMovimiento extends PoolDeConexiones {

    public GestorMovimiento() throws Exception {
        this.pedirConexion();
    }

    public int altaMovimiento(Movimiento movimiento) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO movimiento (DESCMOVIMIENTO, MONTOMOVIMIENTO, FECHAMOVIMIENTO, caja_IDCAJA) VALUES (?,?,CURDATE(),?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, movimiento.getDescripcionMovimiento());
            pst.setDouble(2, movimiento.getMontoMovimiento());
            pst.setInt(3, movimiento.getCaja().getIdCaja());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaMovimiento(Movimiento movimiento) throws Exception {
        int resultado = 0;
        String sql = "UPDATE movimiento SET FECHABAJA = ? WHERE movimiento.IDMOVIMIENTO = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(movimiento.getFechaBajaMovimiento().getTime()));
            pst.setInt(2, movimiento.getIdMovimiento());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public ArrayList<Movimiento> listarMovimientosPorCaja(int idCaja) throws Exception {
        ArrayList<Movimiento> movimientos = new ArrayList<>();
        String sql = "SELECT * FROM movimiento WHERE movimiento.FECHABAJA IS NULL "
                + "AND movimiento.caja_IDCAJA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCaja);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Movimiento mov = new Movimiento();
                mov.setIdMovimiento(resultado.getInt("IDMOVIMIENTO"));
                mov.setDescripcionMovimiento(resultado.getString("DESCMOVIMIENTO"));
                mov.setMontoMovimiento(resultado.getDouble("MONTOMOVIMIENTO"));
                mov.setFechaMovimiento(resultado.getDate("FECHAMOVIMIENTO"));
                movimientos.add(mov);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return movimientos;
    }
}
