package reportes;
import java.sql.SQLException;
import java.util.HashMap;

import org.apache.log4j.BasicConfigurator;
import conexion.Conexion;

public class ListadoClientes {
	
    
	public ListadoClientes(String ni) {
		super();
		this.idLocalidad = ni;
	}

	private  static String idLocalidad;

        public static void main(String[] args) throws SQLException  {
		    
  	     BasicConfigurator.configure();        
  	 // Creamos un objeto de la clase conexion
  	      
  	     Reportes2 reporte= new Reportes2();
  	        try {
  	             // llamamos al metodo get conection que nos devuelve un Objeto connection
  	             
  	                 HashMap<String, Object> mp= new HashMap<String, Object>();
  	           mp.put("localidad",ListadoClientes.idLocalidad); // pasamos el parametro definido en IREPORT
  	                 // Lo exporta a pdf y lo muestra en la pantalla
  	             Conexion.getInstancia().conectar();
  	             
  	             reporte.jasperReport(ListadoClientes.class.getResourceAsStream("Listado de clientes.jasper"), mp, Conexion.getInstancia().getConexion());
  	    Conexion.getInstancia().desconectar();
  	  
  	   
  	   // Lamamos el metodo para conectarnos a la base de datos       
  	    
  	        } catch (Exception ex) {
  	            System.out.print(ex.toString());
  	        }finally{
  	             try {
  	                 Conexion.getInstancia().desconectar();
  	            } catch (Exception e) {

  	                System.out.print(e.toString());
  	            }
  	        }
  	    
	   }
}
  