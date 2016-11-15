/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Promocion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ema_s
 */
public class GestorPromocion extends PoolDeConexiones {

    public GestorPromocion() throws Exception {
        this.pedirConexion();
    }

    public Promocion obtenerPromocion(int idPromocion) throws Exception {
        Promocion promocion = new Promocion();
        String sql = "SELECT * FROM promocion WHERE promocion.FECHABAJA IS NULL AND promocion.IDPROMOCION = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idPromocion);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                promocion.setIdPromocion(idPromocion);
                promocion.setDescripPromo(resultado.getString("DESCRIPCIONPROMO"));
                promocion.setFechaVencimientoPromo(resultado.getDate("FECHAVENCIMIENTO"));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return promocion;
    }

}
