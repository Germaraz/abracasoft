/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import pantallas.VentanaPrincipal;

/**
 *
 * @author ema_s
 */
public class Logs {

    public String user;
    FileWriter logs; //nuestro archivo log

    public Logs() {
    }

    public void crearLog(String Operacion) throws IOException {
        //Pregunta el archivo existe, caso contrario crea uno con el nombre log.txt
        if (new File("log.txt").exists() == false) {
            logs = new FileWriter(new File("log.txt"), false);
        }
        logs = new FileWriter(new File("log.txt"), true);
        Calendar fechaActual = Calendar.getInstance(); //Para poder utilizar el paquete calendar     
        //Empieza a escribir en el archivo
        logs.write("[" + (String.valueOf(fechaActual.get(Calendar.DAY_OF_MONTH))
                + "/" + String.valueOf(fechaActual.get(Calendar.MONTH) + 1)
                + "/" + String.valueOf(fechaActual.get(Calendar.YEAR))
                + " - " + String.valueOf(fechaActual.get(Calendar.HOUR_OF_DAY))
                + ":" + String.valueOf(fechaActual.get(Calendar.MINUTE))
                + ":" + String.valueOf(fechaActual.get(Calendar.SECOND))) + "]"
                + " [LOG] " + "El usuario " + user + " ha " + Operacion + "\r\n");
        logs.close(); //Se cierra el archivo
    }
}
