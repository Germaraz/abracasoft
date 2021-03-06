/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.TipoPago;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author German
 */
public class AltaTipoPago extends javax.swing.JFrame {

    /**
     * Creates new form TipoPago
     */
    public AltaTipoPago() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
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
        NombreTipojTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BonifjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TiposDePagojTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        IDTipoPagojTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cuotajTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tipos de pago - OSG");
        setResizable(false);

        NombreTipojTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tipos de pago existentes");

        jLabel2.setText("Nombre");

        jButton2.setText("Eliminar tipo/s seleccionado/s");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Recargo (%)");

        BonifjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BonifjTextFieldActionPerformed(evt);
            }
        });

        TiposDePagojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Recargo (%)", "Cuotas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TiposDePagojTable.getTableHeader().setReorderingAllowed(false);
        TiposDePagojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TiposDePagojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TiposDePagojTable);
        if (TiposDePagojTable.getColumnModel().getColumnCount() > 0) {
            TiposDePagojTable.getColumnModel().getColumn(0).setMinWidth(50);
            TiposDePagojTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            TiposDePagojTable.getColumnModel().getColumn(0).setMaxWidth(50);
            TiposDePagojTable.getColumnModel().getColumn(1).setMinWidth(200);
            TiposDePagojTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            TiposDePagojTable.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jButton3.setText("Guardar cambios a tipo editado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        IDTipoPagojTextField.setVisible(false);
        IDTipoPagojTextField.setEditable(false);

        jLabel5.setText("Cuotas");

        cuotajTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuotajTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreTipojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BonifjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(cuotajTextField1, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(39, 39, 39)
                                .addComponent(jButton2))
                            .addComponent(jLabel3)
                            .addComponent(IDTipoPagojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDTipoPagojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTipojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BonifjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cuotajTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BonifjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BonifjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BonifjTextFieldActionPerformed

    private void cuotajTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuotajTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuotajTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Guardar Tipo de pago?");
            if (respuesta == JOptionPane.YES_OPTION) {
                guardarOActualizarTipoPago();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int fila = TiposDePagojTable.getSelectedRow();
        if (fila != -1) {
            IDTipoPagojTextField.setText(TiposDePagojTable.getValueAt(fila, 0).toString());
            NombreTipojTextField.setText(TiposDePagojTable.getValueAt(fila, 1).toString());
            BonifjTextField.setText(TiposDePagojTable.getValueAt(fila, 2).toString());
            cuotajTextField1.setText(TiposDePagojTable.getValueAt(fila, 3).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una fila de la tabla");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TiposDePagojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiposDePagojTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila = TiposDePagojTable.getSelectedRow();
            if (fila != -1) {
                IDTipoPagojTextField.setText(TiposDePagojTable.getValueAt(fila, 0).toString());
                NombreTipojTextField.setText(TiposDePagojTable.getValueAt(fila, 1).toString());
                BonifjTextField.setText(TiposDePagojTable.getValueAt(fila, 2).toString());
                cuotajTextField1.setText(TiposDePagojTable.getValueAt(fila, 3).toString());
            }
        }
    }//GEN-LAST:event_TiposDePagojTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        darDeBajaTipoDePago();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AltaTipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaTipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaTipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaTipoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaTipoPago tipo = new AltaTipoPago();
                tipo.agregarTiposDePagoATabla();
                tipo.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BonifjTextField;
    private javax.swing.JTextField IDTipoPagojTextField;
    private javax.swing.JTextField NombreTipojTextField;
    private javax.swing.JTable TiposDePagojTable;
    private javax.swing.JTextField cuotajTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla(JTable tabla) {
        int filas = tabla.getRowCount();
        if (filas > 0) {
            DefaultTableModel defaultTabla = (DefaultTableModel) tabla.getModel();
            for (int i = 0; filas > i; i++) {
                defaultTabla.removeRow(0);
            }
        }
    }
    
    private boolean validar() {
        boolean valido = true;
        if (NombreTipojTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de tipo de pago");
            NombreTipojTextField.requestFocus();
            valido = false;
        } else if (BonifjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la bonificación correspondiente al tipo de pago. Si no tiene bonificación ingrese 0");
            BonifjTextField.requestFocus();
            valido = false;
        }
        return valido;
    }
    
    private void agregarTiposDePagoATabla() {
        try {
            ArrayList<TipoPago> tipos = new TipoPago().listarTiposPagos();
            if (!tipos.isEmpty()) {
                limpiarTabla(TiposDePagojTable);
                DefaultTableModel tabla = (DefaultTableModel) TiposDePagojTable.getModel();
                Object[] columnas = new Object[2];
                for (int i = 0; i < tipos.size(); i++) {
                    columnas[0] = tipos.get(i).getIdTipoPago();
                    columnas[1] = tipos.get(i).getTipoPago();
                    columnas[2] = tipos.get(i).getBonificacion();
                    columnas[3] = tipos.get(i).getCuotas();
                    tabla.addRow(columnas);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(AltaTipoPago.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void guardarOActualizarTipoPago() {
        int resultado;
        try {
            TipoPago tipo = new TipoPago();
            tipo.setTipoPago(NombreTipojTextField.getText());
            tipo.setBonificacion(Integer.parseInt(BonifjTextField.getText()));
            tipo.setCuotas(Integer.parseInt(cuotajTextField1.getText()));
            if (IDTipoPagojTextField.getText().isEmpty()) {
                resultado = tipo.altaTipoPago(tipo);
            } else {
                resultado = tipo.modificarTipoPago(tipo);
            }
            if (resultado != 0) {
                JOptionPane.showMessageDialog(null, "Tipo de pago guardado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al tratar de guardar el tipo de pago");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void darDeBajaTipoDePago() {
        int resultado = 0;
        int[] filas = TiposDePagojTable.getSelectedRows();
        if (filas.length > 0) {
            for (int i = 0; i < filas.length; i++) {
                int idTipo = Integer.parseInt(TiposDePagojTable.getValueAt(filas[i], 0).toString());
                TipoPago tipo = new TipoPago();
                tipo.setIdTipoPago(idTipo);
                tipo.setFechaBajaTipoPago(new Date());
                try {
                    if (tipo.darDeBajaTipoPago(tipo) != 0) {
                        resultado++;
                    }
                } catch (Exception ex) {
                    Logger.getLogger(AltaTipoPago.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            if (resultado == filas.length) {
                JOptionPane.showMessageDialog(null, "Se han dado de baja " + resultado + " tipos de pago");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una fila de la tabla para dar de baja");
        }
    }
}
