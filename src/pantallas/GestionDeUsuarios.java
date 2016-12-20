/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Usuario;
import gestores.Logs;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ema_s
 */
public class GestionDeUsuarios extends javax.swing.JFrame {

    private TableRowSorter trsFiltro;
    String nombreUsuario;

    /**
     * Creates new form GestionDeUsuarios
     */
    public GestionDeUsuarios() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        cargarTablaUsuarios();
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
        comboFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NuevoUsuariojButton = new javax.swing.JButton();
        DarDeBajajButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BuscarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de usuarios - OSG");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Nombre y Apellido" }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Nombre y Apellido", "Rol", "Email", "Fecha de alta", "¿Baja?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(5).setResizable(false);
            tablaUsuarios.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setText("Buscar por:");

        NuevoUsuariojButton.setText("Nuevo usuario");
        NuevoUsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoUsuariojButtonActionPerformed(evt);
            }
        });

        DarDeBajajButton.setText("Dar de baja usuario/s seleccionado/s");
        DarDeBajajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarDeBajajButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Editar usuario");

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BuscarjButton.setText("Buscar");
        BuscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarjButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NuevoUsuariojButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DarDeBajajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BuscarjButton))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevoUsuariojButton)
                    .addComponent(DarDeBajajButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        // TODO add your handling code here:
        txtFiltro.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablaUsuarios.getModel());
        tablaUsuarios.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void NuevoUsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoUsuariojButtonActionPerformed
        // TODO add your handling code here:
        AltaDeUsuario altaUsu = new AltaDeUsuario();
        altaUsu.nombreUsuario = nombreUsuario;
        altaUsu.setTitle("Nuevo Usuario");
        altaUsu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NuevoUsuariojButtonActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            JTable table = (JTable) evt.getSource();
            int row = table.getSelectedRow();
            int idUsuarioSeleccionado = (int) table.getValueAt(row, 0);
            try {
                Usuario usuario = new Usuario().obtenerUsuario(idUsuarioSeleccionado);
                AltaDeUsuario modUsuario = new AltaDeUsuario();
                modUsuario.UsuarioIDjTextField.setText(Integer.toString(usuario.getIdUsuario()));
                modUsuario.ApellidojTextField.setText(usuario.getApellido());
                modUsuario.NombrejTextField.setText(usuario.getNombre());
                modUsuario.NombreDeUsuariojTextField.setText(usuario.getNombreUsuario());
                modUsuario.EmailjTextField.setText(usuario.getEmail());
                modUsuario.ContraseniajPasswordField.setText(usuario.getPassUsuario());
                modUsuario.RContraseniajPasswordField.setText(usuario.getPassUsuario());
                modUsuario.TipoDeUsuariojComboBox.setSelectedIndex(usuario.getRol().getIdRol() - 1);
                modUsuario.ContraseniajPasswordField.setEnabled(false);
                modUsuario.RContraseniajPasswordField.setEnabled(false);
                modUsuario.setTitle("Modificar Usuario");
                modUsuario.setVisible(true);
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void DarDeBajajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarDeBajajButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabla = (DefaultTableModel) tablaUsuarios.getModel();
        int usuarios = 0;
        int banderas = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            Boolean darDeBaja = (Boolean) tabla.getValueAt(i, 6);
            if (darDeBaja != null) {
                usuarios++;
                Usuario usuario = new Usuario();
                usuario.setIdUsuario((int) tabla.getValueAt(i, 0));
                usuario.setFechaBajaUsuario(new Date());
                try {
                    if (usuario.bajaUsuario(usuario) != 0) {
                        banderas++;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        if (banderas == usuarios) {
            JOptionPane.showMessageDialog(null, "Se han dado de baja " + banderas + " usuarios");
            this.dispose();
            new GestionDeUsuarios().setVisible(true);
        }
        try {
            Logs log = new Logs();
            log.user = nombreUsuario;
            log.crearLog("ha dado de baja" + banderas + "usuario/s");
        } catch (IOException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DarDeBajajButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        imprimir();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BuscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarjButtonActionPerformed
        // TODO add your handling code here:
        cargarTablaUsuarios();
    }//GEN-LAST:event_BuscarjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarjButton;
    private javax.swing.JButton DarDeBajajButton;
    private javax.swing.JButton NuevoUsuariojButton;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
private void filtro() {
        int columnaABuscar = 0;
        if ("Usuario".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
        if ("Nombre y Apellido".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar));
    }

    private void cargarTablaUsuarios() {
        DefaultTableModel tablaUsuario = (DefaultTableModel) tablaUsuarios.getModel();
        Object[] columnas = new Object[6];
        try {
            ArrayList<Usuario> usuarios = new Usuario().obtenerUsuarios();
            if (!usuarios.isEmpty()) {
                for (int i = 0; i < usuarios.size(); i++) {
                    columnas[0] = usuarios.get(i).getIdUsuario();
                    columnas[1] = usuarios.get(i).getNombreUsuario();
                    columnas[2] = usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellido();
                    columnas[3] = usuarios.get(i).getRol().getRol();
                    columnas[4] = usuarios.get(i).getEmail();
                    columnas[5] = new SimpleDateFormat("dd-MM-yyyy").format(usuarios.get(i).getFechaCreacion());
                    tablaUsuario.addRow(columnas);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al cargar los usuarios");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void imprimir() {
        MessageFormat headerFormat = new MessageFormat("LISTADO DE USUARIO \n"
                + "CANTIDAD DE USUARIOS: " + tablaUsuarios.getRowCount() + "\n");
        MessageFormat footerFormat = new MessageFormat("");
        try {
            tablaUsuarios.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
        } catch (PrinterException ex) {
            Logger.getLogger(GestionDeCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
