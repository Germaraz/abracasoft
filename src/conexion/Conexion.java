package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;

/*Creamos la clase */
public class Conexion {

    private Connection conexion; // Abstrae una conexion a la base de datos
    private String usuario = "root"; // usuario con permisos para												// datos
    private String password = "root"; // contraseña del usuario que se
    private String driver = "com.mysql.jdbc.Driver"; // Clase del Driver de
    private String beseDatos = "jdbc:mysql://localhost:3306/osg";// cadena de coneccion
    private static Conexion instancia;

    /**
     * Crea a new instancia de Conexion
     */
    public static Conexion getInstancia() {
        if (Conexion.instancia == null) {
            Conexion.instancia = new Conexion();
        }
        return instancia;
    }

    /**
     * Metodo que se encarga de conectar a la base de datos
     */
    public void conectar() throws Exception {
        // si la conecion es null nos conectamos
        if (this.getConexion() != null) {
            return;
        } else if (this.getConexion() == null) {

            try {
                Class.forName(this.getDriver()); // obtiene una istancia de la
                // clase Diver
                // establece la conexion con el Diver jconector y este a su vez
                // con la base de datos
                this.setConexion(DriverManager.getConnection(
                        this.getBeseDatos(), this.getUsuario(),
                        this.getPassword()));
                        System.out.println("C coneto");
            } catch (SQLException ex) {
                throw new Exception("ERROR AL CONECTARSE CON LA BASE DE DATOS");
            } catch (ClassNotFoundException ex) {
                throw new Exception("Clase no encontrada");
            }
        }

    }

    /**
     * desconecta de la base de datos
     */
    public void desconectar() throws Exception {
        if (this.getConexion() == null) {
            this.setConexion(null);
        }

    }

    public Conexion() {
    }

    /* Metodos getter y setter */
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBeseDatos() {
        return beseDatos;
    }

    public void setBeseDatos(String beseDatos) {
        this.beseDatos = beseDatos;
    }

    public static void main(String[] args) {
        Conexion con = new Conexion();
        try {
            con.conectar();
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
