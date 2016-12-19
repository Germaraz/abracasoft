/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Factura;
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
public class AltaFactura extends javax.swing.JFrame {

    /**
     * Creates new form TipoPago
     */
    public AltaFactura() {
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
        IVAjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TiposDeFacturajTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        IDFacturajTextField = new javax.swing.JTextField();

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
        jLabel3.setText("Tipos de factura existentes");

        jLabel2.setText("Tipo de Factura");

        jButton2.setText("Eliminar tipo/s seleccionado/s");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("IVA (%)");

        IVAjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAjTextFieldActionPerformed(evt);
            }
        });

        TiposDeFacturajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "IVA (%)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        TiposDeFacturajTable.getTableHeader().setReorderingAllowed(false);
        TiposDeFacturajTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TiposDeFacturajTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TiposDeFacturajTable);
        if (TiposDeFacturajTable.getColumnModel().getColumnCount() > 0) {
            TiposDeFacturajTable.getColumnModel().getColumn(0).setMinWidth(50);
            TiposDeFacturajTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            TiposDeFacturajTable.getColumnModel().getColumn(0).setMaxWidth(50);
            TiposDeFacturajTable.getColumnModel().getColumn(1).setMinWidth(50);
            TiposDeFacturajTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            TiposDeFacturajTable.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        jButton3.setText("Guardar cambios a tipo editado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        IDFacturajTextField.setVisible(false);
        IDFacturajTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(IVAjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(NombreTipojTextField))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(IDFacturajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(39, 39, 39)
                                .addComponent(jButton2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDFacturajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTipojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IVAjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
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

    private void IVAjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IVAjTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Guardar Tipo de factura?");
            if (respuesta == JOptionPane.YES_OPTION) {
                guardarOActualizarTipoFactura();
                 this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int fila = TiposDeFacturajTable.getSelectedRow();
        if (fila != -1) {
            IDFacturajTextField.setText(TiposDeFacturajTable.getValueAt(fila, 0).toString());
            NombreTipojTextField.setText(TiposDeFacturajTable.getValueAt(fila, 1).toString());
            IVAjTextField.setText(TiposDeFacturajTable.getValueAt(fila, 2).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una fila de la tabla");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TiposDeFacturajTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiposDeFacturajTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila = TiposDeFacturajTable.getSelectedRow();
            if (fila != -1) {
                IDFacturajTextField.setText(TiposDeFacturajTable.getValueAt(fila, 0).toString());
                NombreTipojTextField.setText(TiposDeFacturajTable.getValueAt(fila, 1).toString());
                IVAjTextField.setText(TiposDeFacturajTable.getValueAt(fila, 2).toString());
            }
        }
    }//GEN-LAST:event_TiposDeFacturajTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        darDeBajaTipoDeFactura();
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
            java.util.logging.Logger.getLogger(AltaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaFactura tipo = new AltaFactura();
                tipo.agregarTiposDeFacturaATabla();
                tipo.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDFacturajTextField;
    private javax.swing.JTextField IVAjTextField;
    private javax.swing.JTextField NombreTipojTextField;
    private javax.swing.JTable TiposDeFacturajTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
        } else if (IVAjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el IVA correspondiente al tipo de factura. Si no tiene IVA ingrese 0");
            IVAjTextField.requestFocus();
            valido = false;
        }
        return valido;
    }

    private void agregarTiposDeFacturaATabla() {
        try {
            ArrayList<Factura> facturas = new Factura().listarFacturas();
            if (!facturas.isEmpty()) {
                limpiarTabla(TiposDeFacturajTable);
                DefaultTableModel tabla = (DefaultTableModel) TiposDeFacturajTable.getModel();
                Object[] columnas = new Object[2];
                for (int i = 0; i < facturas.size(); i++) {
                    columnas[0] = facturas.get(i).getIdFactura();
                    columnas[1] = facturas.get(i).getTipoFactura();
                    columnas[2] = facturas.get(i).getPorcIVA();
                    tabla.addRow(columnas);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(AltaFactura.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void guardarOActualizarTipoFactura() {
        int resultado;
        try {
            Factura factura = new Factura();
            factura.setTipoFactura(NombreTipojTextField.getText());
            factura.setPorcIVA(Integer.parseInt(IVAjTextField.getText()));
            if (IDFacturajTextField.getText().isEmpty()) {
                resultado = factura.altaFactura(factura);
            } else {
                resultado = factura.modificarFactura(factura);
            }
            if (resultado != 0) {
                JOptionPane.showMessageDialog(null, "Tipo de factura guardada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al tratar de guardar el tipo de factura");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void darDeBajaTipoDeFactura() {
        int resultado = 0;
        int[] filas = TiposDeFacturajTable.getSelectedRows();
        if (filas.length > 0) {
            for (int i = 0; i < filas.length; i++) {
                int idTipo = Integer.parseInt(TiposDeFacturajTable.getValueAt(filas[i], 0).toString());
                Factura factura = new Factura();
                factura.setIdFactura(idTipo);
                factura.setFechaBajaFactura(new Date());
                try {
                    if (factura.darDeBajaFactura(factura) != 0) {
                        resultado++;
                    }
                } catch (Exception ex) {
                    Logger.getLogger(AltaFactura.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            if (resultado == filas.length) {
                JOptionPane.showMessageDialog(null, "Se han dado de baja " + resultado + " tipos de factura");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una fila de la tabla para dar de baja");
        }
    }
}
