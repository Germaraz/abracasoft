/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Ema
 */
public class AbraBackUp {

    private int BUFFER = 10485760;
    //para guardar en memmoria
    private StringBuffer temp = null;
    //para guardar el archivo SQL
    private FileWriter fichero = null;
    private PrintWriter pw = null;

    public boolean CrearBackup(String host, String port, String user, String password, String db, String directorio_backup) {
        boolean ok = false;
        try {
            //sentencia para crear el BackUp, en mi computadora tuve que poner la ruta completa donde se encuentra
            //instalado el archivo "mysqldump", el ejemplo de donde lo extraje solo decía "mysqldump".
            Process run = Runtime.getRuntime().exec(
                 "C:\\Archivos de programa\\MySQL\\MySQL Server 5.0\\bin\\mysqldump --host=" + host + " --port=" + port
                    + " --user=" + user + " --password=" + password
                    + " --compact --complete-insert --extended-insert --skip-quote-names"
                    + " --skip-comments --skip-triggers " + db);
            //se guarda en memoria el backup
            InputStream in = run.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            temp = new StringBuffer();
            int count;
            char[] cbuf = new char[BUFFER];
            while ((count = br.read(cbuf, 0, BUFFER)) != -1) {
                temp.append(cbuf, 0, count);
            }
            br.close();
            in.close();
            // se crea y escribe el archivo SQL
            fichero = new FileWriter(directorio_backup);
            pw = new PrintWriter(fichero);
            pw.println(temp.toString());
            ok = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return ok;
    }
}
