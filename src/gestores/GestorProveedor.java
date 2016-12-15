/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Localidad;
import entidades.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorProveedor extends PoolDeConexiones {

    public GestorProveedor() throws Exception {
        this.pedirConexion();
    }

    public int altaProveedor(Proveedor proveedor) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO proveedor (CUIT, RAZONSOCIAL, NOMBREFANTASIA, DIRECCION_PROVEEDOR, TELEFONO_PROVEEDOR, "
                + "MAIL_PROVEEDOR, localidad_IDLOCALIDAD) VALUES (?,?,?,?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, proveedor.getCuit());
            pst.setString(2, proveedor.getRazonSocial());
            pst.setString(3, proveedor.getNombreFantasia());
            pst.setString(4, proveedor.getDireccionProveedor());
            pst.setInt(5, proveedor.getTelefonoProveedor());
            pst.setString(6, proveedor.getMailProveedor());
            pst.setInt(7, proveedor.getLocalidad().getIdLocalidad());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificarProveedor(Proveedor proveedor) throws Exception {
        int resultado = 0;
        String sql = "UPDATE proveedor SET CUIT = ?, RAZONSOCIAL = ?, NOMBREFANTASIA = ?, DIRECCION_PROVEEDOR = ?, "
                + "TELEFONO_PROVEEDOR = ?, MAIL_PROVEEDOR = ?, localidad_IDLOCALIDAD= ? WHERE IDPROVEEDOR = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, proveedor.getCuit());
            pst.setString(2, proveedor.getRazonSocial());
            pst.setString(3, proveedor.getNombreFantasia());
            pst.setString(4, proveedor.getDireccionProveedor());
            pst.setInt(5, proveedor.getTelefonoProveedor());
            pst.setString(6, proveedor.getMailProveedor());
            pst.setInt(7, proveedor.getLocalidad().getIdLocalidad());
            pst.setInt(8, proveedor.getIdProveedor());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaProveedor(Proveedor proveedor) throws Exception {
        int resultado = 0;
        String sql = "UPDATE proveedor SET FECHABAJA = ? WHERE IDPROVEEDOR = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(proveedor.getFechaBajaProveedor().getTime()));
            pst.setInt(2, proveedor.getIdProveedor());
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public Proveedor obtenerProveedor(int idProveedor) throws Exception {
        Proveedor proveedor = new Proveedor();
        String sql = "SELECT * FROM proveedor WHERE proveedor.FECHABAJA IS NULL AND proveedor.IDPROVEEDOR = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idProveedor);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                proveedor.setIdProveedor(idProveedor);
                proveedor.setCuit(resultado.getInt("CUIT"));
                proveedor.setRazonSocial(resultado.getString("RAZONSOCIAL"));
                proveedor.setNombreFantasia(resultado.getString("NOMBREFANTASIA"));
                proveedor.setDireccionProveedor(resultado.getString("DIRECCION_PROVEEDOR"));
                proveedor.setTelefonoProveedor(resultado.getInt("TELEFONO_PROVEEDOR"));
                proveedor.setMailProveedor(resultado.getString("MAIL_PROVEEDOR"));
                proveedor.setFechaAltaProveedor(resultado.getDate("FECHAALTA"));
                proveedor.setIdProveedor(resultado.getInt("IDPROVEEDOR"));
                proveedor.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return proveedor;
    }

    public Proveedor obtenerProveedor(String nombreFantasia) throws Exception {
        Proveedor proveedor = new Proveedor();
        String sql = "SELECT * FROM proveedor WHERE proveedor.FECHABAJA IS NULL AND proveedor.NOMBREFANTASIA = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, nombreFantasia);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                proveedor.setIdProveedor(resultado.getInt("IDPROVEEDOR"));
                proveedor.setCuit(resultado.getInt("CUIT"));
                proveedor.setRazonSocial(resultado.getString("RAZONSOCIAL"));
                proveedor.setNombreFantasia(resultado.getString("NOMBREFANTASIA"));
                proveedor.setDireccionProveedor(resultado.getString("DIRECCION_PROVEEDOR"));
                proveedor.setTelefonoProveedor(resultado.getInt("TELEFONO_PROVEEDOR"));
                proveedor.setMailProveedor(resultado.getString("MAIL_PROVEEDOR"));
                proveedor.setFechaAltaProveedor(resultado.getDate("FECHAALTA"));
                proveedor.setIdProveedor(resultado.getInt("IDPROVEEDOR"));
                proveedor.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return proveedor;
    }

    public ArrayList<Proveedor> obtenerProveedores() throws Exception {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        String sql = "SELECT * FROM proveedor WHERE proveedor.FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setCuit(resultado.getInt("CUIT"));
                proveedor.setRazonSocial(resultado.getString("RAZONSOCIAL"));
                proveedor.setNombreFantasia(resultado.getString("NOMBREFANTASIA"));
                proveedor.setDireccionProveedor(resultado.getString("DIRECCION_PROVEEDOR"));
                proveedor.setTelefonoProveedor(resultado.getInt("TELEFONO_PROVEEDOR"));
                proveedor.setMailProveedor(resultado.getString("MAIL_PROVEEDOR"));
                proveedor.setFechaAltaProveedor(resultado.getDate("FECHAALTA"));
                proveedor.setIdProveedor(resultado.getInt("IDPROVEEDOR"));
                proveedor.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
                proveedores.add(proveedor);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return proveedores;
    }

    public ArrayList<Proveedor> obtenerProveedoresPorRazonSocial(String razonSocial) throws Exception {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        String sql = "SELECT * FROM proveedor WHERE proveedor.FECHABAJA IS NULL "
                + "AND TRIM(proveedor.RAZONSOCIAL) LIKE '?%'";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, razonSocial.trim());
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setCuit(resultado.getInt("CUIT"));
                proveedor.setRazonSocial(resultado.getString("RAZONSOCIAL"));
                proveedor.setNombreFantasia(resultado.getString("NOMBREFANTASIA"));
                proveedor.setDireccionProveedor(resultado.getString("DIRECCION_PROVEEDOR"));
                proveedor.setTelefonoProveedor(resultado.getInt("TELEFONO_PROVEEDOR"));
                proveedor.setMailProveedor(resultado.getString("MAIL_PROVEEDOR"));
                proveedor.setFechaAltaProveedor(resultado.getDate("FECHAALTA"));
                proveedor.setIdProveedor(resultado.getInt("IDPROVEEDOR"));
                proveedor.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
                proveedores.add(proveedor);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return proveedores;
    }

    public ArrayList<Proveedor> obtenerProveedoresPorNombreFantasia(String nombreFantasia) throws Exception {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        String sql = "SELECT * FROM proveedor WHERE proveedor.FECHABAJA IS NULL "
                + "AND TRIM(proveedor.NOMBREFANTASIA) LIKE '?%'";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, nombreFantasia.trim());
            ResultSet resultado = pst.executeQuery();
            while (resultado.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setCuit(resultado.getInt("CUIT"));
                proveedor.setRazonSocial(resultado.getString("RAZONSOCIAL"));
                proveedor.setNombreFantasia(resultado.getString("NOMBREFANTASIA"));
                proveedor.setDireccionProveedor(resultado.getString("DIRECCION_PROVEEDOR"));
                proveedor.setTelefonoProveedor(resultado.getInt("TELEFONO_PROVEEDOR"));
                proveedor.setMailProveedor(resultado.getString("MAIL_PROVEEDOR"));
                proveedor.setFechaAltaProveedor(resultado.getDate("FECHAALTA"));
                proveedor.setIdProveedor(resultado.getInt("IDPROVEEDOR"));
                proveedor.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
                proveedores.add(proveedor);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return proveedores;
    }
}
