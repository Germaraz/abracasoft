/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import entidades.Cliente;
import entidades.Localidad;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ema_s
 */
public class GestorCliente extends PoolDeConexiones {

    public GestorCliente() throws Exception {
        this.pedirConexion();
    }

    public int altaCliente(Cliente cliente) throws Exception {
        int resultado = 0;
        String sql = "INSERT INTO cliente (DNI_CLIENTE, SEXO_CLIENTE, NOMBRE_CLIENTE, APELLIDO_CLIENTE, "
                + "FECHANACIMIENTO_CLIENTE, DIRECCION_CLIENTE, MAIL_CLIENTE, TELEFONO_CLIENTE, localidad_IDLOCALIDAD)"
                + " VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, cliente.getDniCliente());
            pst.setString(2, cliente.getSexo());
            pst.setString(3, cliente.getNombreCliente());
            pst.setString(4, cliente.getApellidoCliente());
            pst.setDate(5, (Date) cliente.getFechaNacimiento());
            pst.setString(6, cliente.getDireccionCliente());
            pst.setString(7, cliente.getMailCliente());
            pst.setLong(8, cliente.getTelefonoCliente());
            pst.setInt(9, cliente.getLocalidad().getIdLocalidad());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int modificarCliente(Cliente cliente) throws Exception {
        int resultado = 0;
        String sql = "UPDATE cliente SET DNI_CLIENTE = ?, SEXO_CLIENTE = ? , NOMBRE_CLIENTE = ?, APELLIDO_CLIENTE = ?, "
                + "FECHANACIMIENTO_CLIENTE = ?, DIRECCION_CLIENTE = ?, MAIL_CLIENTE = ?, TELEFONO_CLIENTE = ?, localidad_IDLOCALIDAD = ? "
                + "WHERE IDCLIENTE = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, cliente.getDniCliente());
            pst.setString(2, cliente.getSexo());
            pst.setString(3, cliente.getNombreCliente());
            pst.setString(4, cliente.getApellidoCliente());
            pst.setDate(5, (Date) cliente.getFechaNacimiento());
            pst.setString(6, cliente.getDireccionCliente());
            pst.setString(7, cliente.getMailCliente());
            pst.setLong(8, cliente.getTelefonoCliente());
            pst.setInt(9, cliente.getLocalidad().getIdLocalidad());
            pst.setInt(10, cliente.getIdCliente());
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public int darDeBajaCliente(Cliente cliente) throws Exception {
        int resultado = 0;
        String sql = "UPDATE cliente SET FECHABAJA = ? WHERE IDCLIENTE = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setDate(1, new Date(cliente.getFechaBajaCliente().getTime()));
            pst.setInt(2, cliente.getIdCliente());
            resultado = pst.executeUpdate();
            conexion.commit();
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return resultado;
    }

    public ArrayList<Cliente> listarClientes() throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE FECHABAJA IS NULL";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultado.getInt("IDCLIENTE"));
                cliente.setDniCliente(resultado.getInt("DNI_CLIENTE"));
                cliente.setSexo(resultado.getString("SEXO_CLIENTE"));
                cliente.setFechaNacimiento(resultado.getDate("FECHANACIMIENTO_CLIENTE"));
                cliente.setApellidoCliente(resultado.getString("APELLIDO_CLIENTE"));
                cliente.setNombreCliente(resultado.getString("NOMBRE_CLIENTE"));
                cliente.setMailCliente(resultado.getString("EMAIL_CLIENTE"));
                cliente.setTelefonoCliente(resultado.getLong("TELEFONO_CLIENTE"));
                cliente.setDireccionCliente(resultado.getString("DIRECCION_CLIENTE"));
                cliente.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return clientes;
    }

    public Cliente obtenerClientePorDoc(int dni) throws Exception {
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM cliente WHERE cliente.FECHABAJA IS NULL AND cliente.DNI_CLIENTE = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, dni);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                cliente.setIdCliente(resultado.getInt("IDCLIENTE"));
                cliente.setDniCliente(dni);
                cliente.setSexo(resultado.getString("SEXO_CLIENTE"));
                cliente.setFechaNacimiento(resultado.getDate("FECHANACIMIENTO_CLIENTE"));
                cliente.setApellidoCliente(resultado.getString("APELLIDO_CLIENTE"));
                cliente.setNombreCliente(resultado.getString("NOMBRE_CLIENTE"));
                cliente.setMailCliente(resultado.getString("EMAIL_CLIENTE"));
                cliente.setTelefonoCliente(resultado.getLong("TELEFONO_CLIENTE"));
                cliente.setDireccionCliente(resultado.getString("DIRECCION_CLIENTE"));
                cliente.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return cliente;
    }

    public Cliente obtenerCliente(String apellidoNombre) throws Exception {
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM cliente WHERE cliente.FECHABAJA IS NULL "
                + "AND TRIM(CONCAT(cliente.APELLIDO_CLIENTE, cliente.NOMBRE_CLIENTE)) LIKE '?%'";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setString(1, apellidoNombre.trim());
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                cliente.setIdCliente(resultado.getInt("IDCLIENTE"));
                cliente.setDniCliente(resultado.getInt("DNI_CLIENTE"));
                cliente.setSexo(resultado.getString("SEXO_CLIENTE"));
                cliente.setFechaNacimiento(resultado.getDate("FECHANACIMIENTO_CLIENTE"));
                cliente.setApellidoCliente(resultado.getString("APELLIDO_CLIENTE"));
                cliente.setNombreCliente(resultado.getString("NOMBRE_CLIENTE"));
                cliente.setMailCliente(resultado.getString("EMAIL_CLIENTE"));
                cliente.setTelefonoCliente(resultado.getLong("TELEFONO_CLIENTE"));
                cliente.setDireccionCliente(resultado.getString("DIRECCION_CLIENTE"));
                cliente.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return cliente;
    }

    public Cliente obtenerClientePorId(int idCliente) throws Exception {
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM cliente WHERE cliente.FECHABAJA IS NULL AND cliente.IDCLIENTE = ?";
        try {
            conexion.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            PreparedStatement pst = conexion.prepareStatement(sql);
            pst.setInt(1, idCliente);
            ResultSet resultado = pst.executeQuery();
            conexion.commit();
            while (resultado.next()) {
                cliente.setIdCliente(idCliente);
                cliente.setDniCliente(resultado.getInt("DNI_CLIENTE"));
                cliente.setSexo(resultado.getString("SEXO_CLIENTE"));
                cliente.setFechaNacimiento(resultado.getDate("FECHANACIMIENTO_CLIENTE"));
                cliente.setApellidoCliente(resultado.getString("APELLIDO_CLIENTE"));
                cliente.setNombreCliente(resultado.getString("NOMBRE_CLIENTE"));
                cliente.setMailCliente(resultado.getString("EMAIL_CLIENTE"));
                cliente.setTelefonoCliente(resultado.getLong("TELEFONO_CLIENTE"));
                cliente.setDireccionCliente(resultado.getString("DIRECCION_CLIENTE"));
                cliente.setLocalidad(new Localidad().obtenerLocalidad(resultado.getInt("localidad_IDLOCALIDAD")));
            }
        } catch (Exception e) {
            conexion.rollback();
            throw new Exception(e.getMessage());
        }
        return cliente;
    }
}
