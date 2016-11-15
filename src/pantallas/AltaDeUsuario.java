/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Privilegio;
import entidades.Rol;
import entidades.Usuario;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ema
 */
public class AltaDeUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AltaDeUsuario
     */
    public AltaDeUsuario() {

        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        agregarRolesACombo();
        ApellidojTextField.requestFocus();
        UsuarioIDjTextField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuariojLabel = new javax.swing.JLabel();
        EmailjTextField = new javax.swing.JTextField();
        PassjLabel = new javax.swing.JLabel();
        RepitaPassjLabel = new javax.swing.JLabel();
        TipoUsuariojLabel = new javax.swing.JLabel();
        TipoDeUsuariojComboBox = new javax.swing.JComboBox();
        PrivilegiosjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrivilegiosjTable = new javax.swing.JTable();
        GuardarjButton = new javax.swing.JButton();
        SalirjButton = new javax.swing.JButton();
        Bayuda = new javax.swing.JButton();
        UsuariojLabel1 = new javax.swing.JLabel();
        NombrejTextField = new javax.swing.JTextField();
        UsuariojLabel2 = new javax.swing.JLabel();
        UsuariojLabel3 = new javax.swing.JLabel();
        ApellidojTextField = new javax.swing.JTextField();
        NombreDeUsuariojTextField = new javax.swing.JTextField();
        ContraseniajPasswordField = new javax.swing.JPasswordField();
        RContraseniajPasswordField = new javax.swing.JPasswordField();
        UsuarioIDjTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar un nuevo usuario");
        setExtendedState(AltaDeUsuario.MAXIMIZED_BOTH);
        setResizable(false);

        UsuariojLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsuariojLabel.setText("Apellido");

        EmailjTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        PassjLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PassjLabel.setText("Contraseña");

        RepitaPassjLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RepitaPassjLabel.setText("Repetir contraseña");

        TipoUsuariojLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TipoUsuariojLabel.setText("Tipo");

        TipoDeUsuariojComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoDeUsuariojComboBoxItemStateChanged(evt);
            }
        });
        TipoDeUsuariojComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDeUsuariojComboBoxActionPerformed(evt);
            }
        });

        PrivilegiosjLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PrivilegiosjLabel.setText("Privilegios:");

        PrivilegiosjTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrivilegiosjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Fecha de alta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PrivilegiosjTable);
        if (PrivilegiosjTable.getColumnModel().getColumnCount() > 0) {
            PrivilegiosjTable.getColumnModel().getColumn(0).setMinWidth(60);
            PrivilegiosjTable.getColumnModel().getColumn(0).setPreferredWidth(60);
            PrivilegiosjTable.getColumnModel().getColumn(0).setMaxWidth(60);
            PrivilegiosjTable.getColumnModel().getColumn(1).setMinWidth(467);
            PrivilegiosjTable.getColumnModel().getColumn(1).setPreferredWidth(467);
            PrivilegiosjTable.getColumnModel().getColumn(1).setMaxWidth(467);
            PrivilegiosjTable.getColumnModel().getColumn(2).setMinWidth(90);
            PrivilegiosjTable.getColumnModel().getColumn(2).setPreferredWidth(90);
            PrivilegiosjTable.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        GuardarjButton.setText("Guardar");
        GuardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjButtonActionPerformed(evt);
            }
        });

        SalirjButton.setText("Cancelar");
        SalirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirjButtonActionPerformed(evt);
            }
        });

        Bayuda.setText("Ayuda");

        UsuariojLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsuariojLabel1.setText("Nombre");

        NombrejTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        UsuariojLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsuariojLabel2.setText("Email");

        UsuariojLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsuariojLabel3.setText("Nombre de usuario");

        ApellidojTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        NombreDeUsuariojTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        ContraseniajPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseniajPasswordFieldActionPerformed(evt);
            }
        });

        UsuarioIDjTextField.setEditable(false);
        UsuarioIDjTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bayuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SalirjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(NombreDeUsuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuariojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsuariojLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApellidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ContraseniajPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PassjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addComponent(TipoUsuariojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoDeUsuariojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrivilegiosjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuariojLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsuariojLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(RContraseniajPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RepitaPassjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addComponent(UsuarioIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuariojLabel)
                    .addComponent(UsuariojLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuariojLabel2)
                    .addComponent(UsuariojLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreDeUsuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassjLabel)
                    .addComponent(RepitaPassjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraseniajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RContraseniajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoUsuariojLabel)
                    .addComponent(UsuarioIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TipoDeUsuariojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PrivilegiosjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bayuda)
                    .addComponent(SalirjButton)
                    .addComponent(GuardarjButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoDeUsuariojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoDeUsuariojComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            agregarPrivilegiosATabla();
        }
    }//GEN-LAST:event_TipoDeUsuariojComboBoxItemStateChanged

    private void GuardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarjButtonActionPerformed
        // TODO add your handling code here:
        int resultado = 0;
        Usuario usuario = new Usuario();
        try {
            if (validar()) {
                usuario.setApellido(ApellidojTextField.getText());
                usuario.setNombre(NombrejTextField.getText());
                usuario.setEmail(EmailjTextField.getText());
                usuario.setNombreUsuario(NombreDeUsuariojTextField.getText());
                usuario.setPassUsuario(new String(ContraseniajPasswordField.getPassword()));
                usuario.setRol(new Rol().obtenerRolPorNombre(TipoDeUsuariojComboBox.getSelectedItem().toString()));
                if (UsuarioIDjTextField.getText().isEmpty()) {
                    resultado = usuario.altaUsuario(usuario);
                } else {
                    usuario.setIdUsuario(Integer.parseInt(UsuarioIDjTextField.getText()));
                    resultado = usuario.modificarUsuario(usuario);
                }
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "Usuario guardado exitosamente");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario no pudo guardarse");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_GuardarjButtonActionPerformed

    private void SalirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirjButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SalirjButtonActionPerformed

    private void ContraseniajPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseniajPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseniajPasswordFieldActionPerformed

    private void TipoDeUsuariojComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDeUsuariojComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoDeUsuariojComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AltaDeUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaDeUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaDeUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaDeUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaDeUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidojTextField;
    private javax.swing.JButton Bayuda;
    private javax.swing.JPasswordField ContraseniajPasswordField;
    private javax.swing.JTextField EmailjTextField;
    private javax.swing.JButton GuardarjButton;
    private javax.swing.JTextField NombreDeUsuariojTextField;
    private javax.swing.JTextField NombrejTextField;
    private javax.swing.JLabel PassjLabel;
    private javax.swing.JLabel PrivilegiosjLabel;
    private javax.swing.JTable PrivilegiosjTable;
    private javax.swing.JPasswordField RContraseniajPasswordField;
    private javax.swing.JLabel RepitaPassjLabel;
    private javax.swing.JButton SalirjButton;
    private javax.swing.JComboBox TipoDeUsuariojComboBox;
    private javax.swing.JLabel TipoUsuariojLabel;
    private javax.swing.JTextField UsuarioIDjTextField;
    private javax.swing.JLabel UsuariojLabel;
    private javax.swing.JLabel UsuariojLabel1;
    private javax.swing.JLabel UsuariojLabel2;
    private javax.swing.JLabel UsuariojLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void agregarRolesACombo() {
        Rol rol = new Rol();
        try {
            ArrayList<Rol> roles = rol.obtenerRoles();
            if (!roles.isEmpty()) {
                for (int i = 0; i < roles.size(); i++) {
                    TipoDeUsuariojComboBox.addItem(roles.get(i).getRol());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al obtener los roles");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void agregarPrivilegiosATabla() {
        DefaultTableModel tabla = (DefaultTableModel) PrivilegiosjTable.getModel();
        int filas = tabla.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            tabla.removeRow(i);
        }
        try {
            Rol rol = new Rol().obtenerRolPorNombre(TipoDeUsuariojComboBox.getSelectedItem().toString());
            if (rol != null) {
                ArrayList<Privilegio> privilegios = new Privilegio().obtenerPrivilegios(rol);
                Object[] columnas = new Object[3];
                if (!privilegios.isEmpty()) {
                    for (int i = 0; i < privilegios.size(); i++) {
                        columnas[0] = privilegios.get(i).getIdPrivilegio();
                        columnas[1] = privilegios.get(i).getPrivilegio();
                        columnas[2] = new SimpleDateFormat("dd-MM-yyyy").format(privilegios.get(i).getFechaAltaPrivilegio());
                        tabla.addRow(columnas);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al tratar de cargar los privilegios para ese rol");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El rol seleccionado no existe o esta dado de baja");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private boolean validar() {
        boolean valido = true;
        if (ApellidojTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha ingresado su apellido");
            ApellidojTextField.requestFocus();
            valido = false;
        } else if (NombrejTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha ingresado su nombre");
            NombrejTextField.requestFocus();
            valido = false;
        } else if (EmailjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha ingresado su email");
            EmailjTextField.requestFocus();
            valido = false;
        } else if (NombreDeUsuariojTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha ingresado su nombre de usuario");
            NombreDeUsuariojTextField.requestFocus();
            valido = false;
        } else if (ContraseniajPasswordField.getPassword().length < 4 || ContraseniajPasswordField.getPassword().length > 12) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 4 y 12 caracteres");
            ContraseniajPasswordField.requestFocus();
            valido = false;
        } else if (!Arrays.equals(ContraseniajPasswordField.getPassword(), RContraseniajPasswordField.getPassword())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas tienen que ser iguales");
            RContraseniajPasswordField.requestFocus();
            valido = false;
        }
        return valido;
    }
}
