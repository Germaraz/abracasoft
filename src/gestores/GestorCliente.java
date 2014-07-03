/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestores;

import entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class GestorCliente {
    public static boolean agregarCliente(String nombreCliente, String direccionCliente, int codigoPostalCliente, int telefonoCliente, int dniCuilCuit, String mailCliente){
        boolean estado = false;
        String sql = "INSERT INTO cliente (CODIGOPOSTAL, NOMCLIENTE, DIRCLIENTE, MAILCLIENTE, TELCLIENTE, DNICLIENTE) VALUES (?,?,?,?,?,?)";
        
        String nombre = nombreCliente;
        String direccion = direccionCliente;
            int codigoPostal = codigoPostalCliente;
            int telefono = telefonoCliente;
            int documento = dniCuilCuit;
        String mail = mailCliente;
        
        if (nombre.trim().length()!=0){
            try {
                PreparedStatement pst = Conexion.conectar().prepareStatement(sql);
                pst.setInt(1, codigoPostal);
                pst.setString(2, nombre);
                pst.setString(3, direccion);
                pst.setString(4, mail);
                pst.setInt(5, telefono);
                pst.setInt(6, documento);
                pst.executeUpdate(); //El executeUpdate devuelve 1 si anduvo, lo guardas en un campo auxiliar y lo retornas.
                estado = true;
            }catch (SQLException e) {
                System.out.println(e);
                System.out.println("Error al ejecutar el SQL en gestorCliente");
                estado = false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "El campo 'nombre' no puede estar vacio");
        }
        return estado;
    }
    
        public static ArrayList<Cliente> listarClientesDB() {//Método para que se listen los productos en la pantalla "MenuDeGestionDeProd"

        ArrayList<Cliente> listaCliente = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        try {
            PreparedStatement pst = Conexion.conectar().prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()) { //int dniCuilCuit, String mailCliente
                Cliente cliente = new Cliente(resultSet.getString("NOMCLIENTE"),
                        resultSet.getString("DIRCLIENTE"), resultSet.getInt("CODIGOPOSTAL"), 
                        resultSet.getInt("TELCLIENTE"),resultSet.getInt("DNICLIENTE"),
                        resultSet.getString("MAILCLIENTE"));

                listaCliente.add(cliente);

            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }

        return listaCliente;
    }
}
