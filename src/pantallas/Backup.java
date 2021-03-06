/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;
import gestores.Logs;
import gestores.OSGbackup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author German
 */
public class Backup extends javax.swing.JFrame {
    
    String nombreUsuario;
    /**
     * Creates new form Backup
     */
    public Backup() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CrearjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RestaurarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Backup - OSG");
        setResizable(false);

        CrearjButton.setText("Crear backup");
        CrearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearjButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))); // NOI18N

        RestaurarjButton.setText("Restaurar backup");
        RestaurarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CrearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(RestaurarjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearjButton)
                    .addComponent(RestaurarjButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearjButtonActionPerformed
    new OSGbackup().crear("root", "root", "osg");
    JOptionPane.showMessageDialog(null, "Backup creado correctamente en 'C:\\OSG\\backup\\'");
    try {
            Logs log = new Logs();
            log.user = nombreUsuario;
            log.crearLog("ha creador un backup");
        } catch (IOException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearjButtonActionPerformed

    private void RestaurarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurarjButtonActionPerformed
    //restore();
    restaurarBackUp();
    }//GEN-LAST:event_RestaurarjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backup().setVisible(true);
            }
        });
    }
    
    private String abrirArchivo() {
        String aux = "";
        String texto = "";
        try {
            /**
             * llamamos el metodo que permite cargar la ventana
             */
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(this);
            /**
             * abrimos el archivo seleccionado
             */
            File abre = file.getSelectedFile();

            /**
             * recorremos el archivo, lo leemos para plasmarlo en el area de texto
             */
            if (abre != null) {
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
                lee.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        return texto;//El texto se almacena en el JTextArea
    }
    
    
    private void restore() {
    try {
        JFileChooser selectorFichero = new JFileChooser();
        int seleccion = selectorFichero.showOpenDialog(RestaurarjButton);
        String fichero = selectorFichero.getSelectedFile().getPath().toString();
        Process p = Runtime
            .getRuntime()
            .exec("C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysql -u root -p root osg");

        OutputStream os = p.getOutputStream();
        FileInputStream fis = new FileInputStream(fichero);
        byte[] buffer = new byte[1000];

        int leido = fis.read(buffer);
        while (leido > 0) {
        os.write(buffer, 0, leido);
        leido = fis.read(buffer);
        }

        os.flush();
        os.close();
        fis.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    private void restaurarBackUp(){

        Process runtimeProcess = null;

        try {

            JFileChooser selectorFichero = new JFileChooser();
            int seleccion = selectorFichero.showOpenDialog(RestaurarjButton);

            if (seleccion == selectorFichero.APPROVE_OPTION) {
                //tomo string para ver como trae la direccion del fichero
                String fichero = selectorFichero.getSelectedFile().getPath().toString();
                System.out.println("Direccion del archivo: " + fichero);
                
                String patch = "\"C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysql.exe\"";
                String cad = patch + " --password=root --user=root osg" + " < " + fichero;
                System.out.println(cad);
                //runtimeProcess = Runtime.getRuntime().exec(cad);
                
                Process p = Runtime
                        .getRuntime()
                        .exec(cad);
                new HiloLector(p.getErrorStream()).start();
                
                OutputStream os = p.getOutputStream();
                FileInputStream fis = new FileInputStream(fichero);
                byte[] buffer = new byte[1000];

                int leido = fis.read(buffer);
                while (leido > 0) {
                    os.write(buffer, 0, leido);
                    leido = fis.read(buffer);
                }

                os.flush();
                os.close();
                fis.close();
                /**
                int proceso = runtimeProcess.waitFor();

                System.out.println(proceso);

                if (proceso == 0) {
                    System.out.println("Se logro restaurar");
                } else {
                    System.out.println("No se restauro");
                }
                * */
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            runtimeProcess.destroy();
        }
    }
        
        static class HiloLector extends Thread {

        private InputStream is;

        public HiloLector(InputStream is) {
            this.is = is;
        }

        @Override
        public void run() {
            try {
                byte[] buffer = new byte[1000];
                int leido = is.read(buffer);
                while (leido > 0) {
                    String texto = new String(buffer, 0, leido);
                    System.out.print(texto);
                    leido = is.read(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearjButton;
    private javax.swing.JButton RestaurarjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
    
}
