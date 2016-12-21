/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Cliente;
import entidades.Localidad;
import entidades.Provincia;
import gestores.Logs;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author German
 */
public class AltaCliente extends javax.swing.JFrame {

    String nombreUsuario;

    /**
     * Creates new form AltaCliente
     */
    public AltaCliente() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        this.cargarProvincias();
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

        jLabel1 = new javax.swing.JLabel();
        ClienteNombrejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ClienteDireccionjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ClienteEmailjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CodPostjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ClienteTelefonojTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ClienteDNIjTextField = new javax.swing.JTextField();
        CancelarjButton = new javax.swing.JButton();
        GuardarjButton = new javax.swing.JButton();
        ClienteApellidojTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ClienteIDjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ProvinciasjComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        LocalidadesjComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        SexojComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        FecNacjDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar nuevo cliente");
        setResizable(false);

        jLabel1.setText("Nombre");

        jLabel2.setText("Dirección");

        jLabel3.setText("Email");

        jLabel4.setText("Código postal");

        CodPostjTextField.setEditable(false);

        jLabel5.setText("Telefono");

        ClienteTelefonojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClienteTelefonojTextFieldKeyTyped(evt);
            }
        });

        jLabel6.setText("DNI");

        ClienteDNIjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClienteDNIjTextFieldKeyTyped(evt);
            }
        });

        CancelarjButton.setText("Cancelar");
        CancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarjButtonActionPerformed(evt);
            }
        });

        GuardarjButton.setText("Guardar");
        GuardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Apellido");

        ClienteIDjTextField.setVisible(false);
        ClienteIDjTextField.setEditable(false);

        jLabel7.setText("Provincia");

        ProvinciasjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProvinciasjComboBoxItemStateChanged(evt);
            }
        });

        jLabel10.setText("Localidad");

        LocalidadesjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LocalidadesjComboBoxItemStateChanged(evt);
            }
        });

        jLabel9.setText("Sexo");

        SexojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel11.setText("Fecha de nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ClienteIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarjButton)
                        .addGap(18, 18, 18)
                        .addComponent(CancelarjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClienteTelefonojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(ClienteEmailjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(ClienteDireccionjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(CodPostjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(LocalidadesjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(ProvinciasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ClienteApellidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FecNacjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ClienteNombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClienteDNIjTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(SexojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ClienteDNIjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ClienteNombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ClienteApellidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FecNacjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(SexojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ProvinciasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(LocalidadesjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodPostjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClienteDireccionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClienteEmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(ClienteTelefonojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarjButton)
                    .addComponent(GuardarjButton)
                    .addComponent(ClienteIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarjButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelarjButtonActionPerformed

    private void ClienteDNIjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClienteDNIjTextFieldKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_ClienteDNIjTextFieldKeyTyped

    private void ClienteTelefonojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClienteTelefonojTextFieldKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_ClienteTelefonojTextFieldKeyTyped

    private void ProvinciasjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProvinciasjComboBoxItemStateChanged
        // TODO add your handling code here:
        this.cargarLocalidad();
    }//GEN-LAST:event_ProvinciasjComboBoxItemStateChanged

    private void GuardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarjButtonActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Guardar cliente?");
            if (respuesta == JOptionPane.YES_OPTION) {
                guardarOActualizarCliente();
                this.dispose();
            }
        }
    }//GEN-LAST:event_GuardarjButtonActionPerformed

    private void LocalidadesjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LocalidadesjComboBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                Localidad localidad = new Localidad().obtenerLocalidad(LocalidadesjComboBox.getSelectedItem().toString());
                CodPostjTextField.setText(Integer.toString(localidad.getCodigoPosta()));
            } catch (Exception ex) {
                Logger.getLogger(AltaProveedor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_LocalidadesjComboBoxItemStateChanged

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
            java.util.logging.Logger.getLogger(AltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarjButton;
    protected javax.swing.JTextField ClienteApellidojTextField;
    protected javax.swing.JTextField ClienteDNIjTextField;
    protected javax.swing.JTextField ClienteDireccionjTextField;
    protected javax.swing.JTextField ClienteEmailjTextField;
    protected javax.swing.JTextField ClienteIDjTextField;
    protected javax.swing.JTextField ClienteNombrejTextField;
    protected javax.swing.JTextField ClienteTelefonojTextField;
    protected javax.swing.JTextField CodPostjTextField;
    protected com.toedter.calendar.JDateChooser FecNacjDateChooser;
    private javax.swing.JButton GuardarjButton;
    protected javax.swing.JComboBox<String> LocalidadesjComboBox;
    protected javax.swing.JComboBox<String> ProvinciasjComboBox;
    protected javax.swing.JComboBox<String> SexojComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void cargarProvincias() {
        ArrayList<Provincia> provincias = new ArrayList<>();
        try {
            provincias = new Provincia().listarProvincias();
            if (!provincias.isEmpty()) {
                for (int i = 0; i < provincias.size(); i++) {
                    ProvinciasjComboBox.addItem(provincias.get(i).getNombreProvincia());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al cargar las provincias");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void cargarLocalidad() {
        ArrayList<Localidad> localidades;
        int idprovincia;
        try {
            if (ProvinciasjComboBox.getItemCount() != 0) {
                if (ProvinciasjComboBox.getSelectedIndex() == 0) {
                    idprovincia = 1;
                } else {
                    idprovincia = ProvinciasjComboBox.getSelectedIndex();
                }
                localidades = new Localidad().listarLocalidades(idprovincia);
                if (!localidades.isEmpty()) {
                    LocalidadesjComboBox.removeAllItems();
                    for (int i = 0; i < localidades.size(); i++) {
                        LocalidadesjComboBox.addItem(localidades.get(i).getNombreLocalidad());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No existen localidades para la provincia seleccionada");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private boolean validar() {
        boolean valido = true;
        if (ClienteDNIjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el dni del cliente");
            ClienteDNIjTextField.requestFocus();
            valido = false;
        } else if (ClienteDNIjTextField.getText().length() > 11) {
            JOptionPane.showMessageDialog(null, "DNI incorrecto");
            ClienteDNIjTextField.requestFocus();
            valido = false;
        } else if (ClienteNombrejTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del cliente");
            ClienteNombrejTextField.requestFocus();
            valido = false;
        } else if (ClienteApellidojTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el apellido del cliente");
            ClienteApellidojTextField.requestFocus();
            valido = false;
        } else if (FecNacjDateChooser.getDateFormatString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de nacimiento");
            FecNacjDateChooser.requestFocus();
            valido = false;
        } else if (ClienteDireccionjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una dirección");
            ClienteDireccionjTextField.requestFocus();
            valido = false;
        } else if (ClienteTelefonojTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un telefono");
            ClienteTelefonojTextField.requestFocus();
            valido = false;
        } else if (ClienteTelefonojTextField.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "Telefono invalido");
            ClienteTelefonojTextField.requestFocus();
            valido = false;
        }
        return valido;
    }

    public void guardarOActualizarCliente() {
        try {
            Logs log = new Logs();
            log.user = nombreUsuario;
            log.crearLog("creado/actualizado un cliente");
        } catch (IOException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        int resultado = 0;
        try {
            Cliente cliente = new Cliente();
            cliente.setDniCliente(Integer.parseInt(ClienteDNIjTextField.getText()));
            cliente.setNombreCliente(ClienteNombrejTextField.getText());
            cliente.setApellidoCliente(ClienteApellidojTextField.getText());
            cliente.setFechaNacimiento(FecNacjDateChooser.getDate());
            cliente.setSexo(SexojComboBox.getSelectedItem().toString());
            cliente.setLocalidad(new Localidad().obtenerLocalidad(LocalidadesjComboBox.getSelectedItem().toString()));
            cliente.setDireccionCliente(ClienteDireccionjTextField.getText());
            cliente.setMailCliente(ClienteEmailjTextField.getText());
            cliente.setTelefonoCliente(Long.parseLong(ClienteTelefonojTextField.getText()));
            if (ClienteIDjTextField.getText().isEmpty()) {
                resultado = cliente.altaCliente(cliente);
            } else {
                cliente.setIdCliente(Integer.parseInt(ClienteIDjTextField.getText()));
                resultado = cliente.modificarCliente(cliente);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        if (resultado != 0) {
            JOptionPane.showMessageDialog(null, "Cliente cargado correctamente");
           
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al cargar el cliente");
        }
    }
}
