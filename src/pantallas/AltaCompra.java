/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Caja;
import entidades.Compra;
import entidades.Movimiento;
import entidades.Pago;
import entidades.Producto;
import entidades.Proveedor;
import entidades.TipoPago;
import entidades.Usuario;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author German
 */
public class AltaCompra extends javax.swing.JFrame {

    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Producto> productosPorCompra = new ArrayList<>();
    int idUsuario;
    private int idCaja;
    private int banderaNuevaFila = 0;

    public AltaCompra() {
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

        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        eliminarProductoTablajButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalleComprajTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigoBarrajTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cantidadjTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NuevoProvjButton = new javax.swing.JButton();
        agregarProdjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        GuardarjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        IVAjTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CUITjTextField = new javax.swing.JTextField();
        ProveedorjComboBox = new javax.swing.JComboBox<String>();
        CompraIDjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SubtotaljTextField = new javax.swing.JTextField();
        totaljTextField = new javax.swing.JTextField();

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva/Editar compra - OSG");
        setResizable(false);

        eliminarProductoTablajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eliminarProductoTablajButton.setText("Quitar producto seleccionado");
        eliminarProductoTablajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoTablajButtonActionPerformed(evt);
            }
        });

        detalleComprajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Precio Unitario", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detalleComprajTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(detalleComprajTable);
        if (detalleComprajTable.getColumnModel().getColumnCount() > 0) {
            detalleComprajTable.getColumnModel().getColumn(0).setMinWidth(200);
            detalleComprajTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            detalleComprajTable.getColumnModel().getColumn(1).setMinWidth(280);
            detalleComprajTable.getColumnModel().getColumn(1).setPreferredWidth(280);
            detalleComprajTable.getColumnModel().getColumn(2).setMinWidth(50);
            detalleComprajTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            detalleComprajTable.getColumnModel().getColumn(3).setMinWidth(80);
            detalleComprajTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            detalleComprajTable.getColumnModel().getColumn(4).setMinWidth(70);
            detalleComprajTable.getColumnModel().getColumn(4).setPreferredWidth(70);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Total");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Proveedor");

        codigoBarrajTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigoBarrajTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Codigo");

        cantidadjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cantidadjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadjTextField.setText("1");
        cantidadjTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cantidadjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadjTextFieldKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("x");

        NuevoProvjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NuevoProvjButton.setText("Nuevo proveedor");
        NuevoProvjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProvjButtonActionPerformed(evt);
            }
        });

        agregarProdjButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarProdjButton.setText("Agregar");
        agregarProdjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdjButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Producto");

        GuardarjButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GuardarjButton.setText("Guardar");
        GuardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjButtonActionPerformed(evt);
            }
        });

        IVAjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IVAjTextField.setText("0.00");
        IVAjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IVAjTextFieldKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CUIT");

        CUITjTextField.setEditable(false);

        ProveedorjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProveedorjComboBoxItemStateChanged(evt);
            }
        });

        CompraIDjTextField.setEditable(false);
        CompraIDjTextField.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("IVA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Subtotal");

        SubtotaljTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SubtotaljTextField.setText("0.00");

        totaljTextField.setEditable(false);
        totaljTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totaljTextField.setText("0.00");
        totaljTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totaljTextFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eliminarProductoTablajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SubtotaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IVAjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(totaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GuardarjButton)
                            .addComponent(CompraIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(codigoBarrajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregarProdjButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProveedorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CUITjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NuevoProvjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NuevoProvjButton)
                    .addComponent(jLabel9)
                    .addComponent(CUITjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProveedorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CompraIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoBarrajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cantidadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(agregarProdjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IVAjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(SubtotaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(totaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarProductoTablajButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GuardarjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadjTextFieldKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadjTextFieldKeyTyped

    private void eliminarProductoTablajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoTablajButtonActionPerformed
        eliminarItemProducto();
    }//GEN-LAST:event_eliminarProductoTablajButtonActionPerformed

    private void ProveedorjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProveedorjComboBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            try {
                Proveedor proveedor = new Proveedor().obtenerProveedor(ProveedorjComboBox.getSelectedItem().toString());
                CUITjTextField.setText(Long.toString(proveedor.getCuit()));
            } catch (Exception ex) {
                Logger.getLogger(AltaCompra.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_ProveedorjComboBoxItemStateChanged

    private void NuevoProvjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProvjButtonActionPerformed
        // TODO add your handling code here:
        new AltaProveedor().setVisible(true);
    }//GEN-LAST:event_NuevoProvjButtonActionPerformed

    private void agregarProdjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdjButtonActionPerformed
        // TODO add your handling code here:
        buscarProducto();
    }//GEN-LAST:event_agregarProdjButtonActionPerformed

    private void GuardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarjButtonActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Guardar compra?");
            if (respuesta == JOptionPane.YES_OPTION) {
                guardarOActualizarCompra();
                this.dispose();
            }
        }
    }//GEN-LAST:event_GuardarjButtonActionPerformed

    private void totaljTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totaljTextFieldMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            double IVA;
            double subtotal;
            if (!IVAjTextField.getText().isEmpty() && !SubtotaljTextField.getText().isEmpty()) {
                IVA = Double.parseDouble(IVAjTextField.getText());
                subtotal = Double.parseDouble(SubtotaljTextField.getText());
            } else {
                IVA = 0;
                subtotal = 0;
            }
            double total = subtotal + IVA;
            totaljTextField.setText(Double.toString(total));
        }
    }//GEN-LAST:event_totaljTextFieldMouseClicked

    private void IVAjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IVAjTextFieldKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_IVAjTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(AltaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField CUITjTextField;
    protected javax.swing.JTextField CompraIDjTextField;
    private javax.swing.JButton GuardarjButton;
    protected javax.swing.JTextField IVAjTextField;
    private javax.swing.JButton NuevoProvjButton;
    protected javax.swing.JComboBox<String> ProveedorjComboBox;
    protected javax.swing.JTextField SubtotaljTextField;
    private javax.swing.JButton agregarProdjButton;
    private javax.swing.JTextField cantidadjTextField;
    private javax.swing.JTextField codigoBarrajTextField;
    protected javax.swing.JTable detalleComprajTable;
    private javax.swing.JButton eliminarProductoTablajButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    protected javax.swing.JTextField totaljTextField;
    // End of variables declaration//GEN-END:variables

    protected boolean validarCajaAbierta() {
        boolean resultado = false;
        try {
            Caja caja = new Caja().obtenerCajaPorUsuario(idUsuario);
            if (caja != null) {
                this.idCaja = caja.getIdCaja();
                String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                Date fechaCajaApertura = caja.getFechaApertura();
                Date fechaCajaCierre = caja.getFechaCierre();
                if (fechaCajaCierre == null && fechaCajaApertura != null) {
                    if (fechaCajaApertura.toString().equals(fecha)) {
                        resultado = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Usted tiene una caja abierta pero no es del dia y no esta cerrada. Por favor comuniquese con el administrador");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tiene que abrir primero una caja para poder realizar una venta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro ninguna caja creada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }

    private boolean validar() {
        boolean valido = true;
        if (ProveedorjComboBox.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un proveedor");
            ProveedorjComboBox.requestFocus();
            valido = false;
        } else if (detalleComprajTable.getRowCount() == -1) {
            JOptionPane.showMessageDialog(null, "Debe cargar al menos 1 producto por compra");
            codigoBarrajTextField.requestFocus();
            valido = false;
        }
        return valido;
    }

    protected void buscarProveedor() {
        ArrayList<Proveedor> proveedores;
        try {
            proveedores = new Proveedor().obtenerProveedores();
            if (!proveedores.isEmpty()) {
                for (int i = 0; i < proveedores.size(); i++) {
                    ProveedorjComboBox.addItem(proveedores.get(i).getNombreFantasia());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Aun no tiene cargado ningun proveedor. Por favor cargue uno");
            }
            AutoCompleteDecorator.decorate(ProveedorjComboBox);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void buscarProducto() {
        try {
            if (!codigoBarrajTextField.getText().isEmpty()) {
                if (!cantidadjTextField.getText().isEmpty()) {
                    int cantidad = Integer.parseInt(cantidadjTextField.getText());
                    Producto producto = new Producto().obtenerProductoCodBarra(Long.parseLong(codigoBarrajTextField.getText()));
                    if (producto != null) {
                        DefaultTableModel tabla = (DefaultTableModel) detalleComprajTable.getModel();
                        Object[] columnas = new Object[5];
                        columnas[0] = producto.getCodigoBarra();
                        columnas[1] = producto.getDescripcionProducto();
                        columnas[2] = cantidad;
                        columnas[3] = producto.getPrecioUnitario();
                        columnas[4] = producto.getPrecioUnitario() * cantidad;
                        tabla.addRow(columnas);
                        this.banderaNuevaFila++;
                        producto.setStock(producto.getStock() + cantidad);
                        productos.add(producto);
                        actualizarTotales();
                        codigoBarrajTextField.setText("");
                        cantidadjTextField.setText("1");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el producto");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad no puede estar vacio");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Codigo de barra no puede estar vacio");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void cargarProductosPorCompra() {
        int filas = detalleComprajTable.getRowCount();
        for (int i = 0; i < filas; i++) {
            int cantidad = Integer.parseInt(detalleComprajTable.getValueAt(i, 2).toString());
            long codbarra = Long.parseLong(detalleComprajTable.getValueAt(i, 0).toString());
            for (int j = 0; j < cantidad; j++) {
                try {
                    Producto producto = new Producto().obtenerProductoCodBarra(codbarra);
                    this.productosPorCompra.add(producto);
                } catch (Exception ex) {
                    Logger.getLogger(AltaCompra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void actualizarTotales() {
        int filas = detalleComprajTable.getRowCount();
        if (filas > 0) {
            double subtotal = Double.parseDouble(SubtotaljTextField.getText());
            for (int i = this.banderaNuevaFila; i <= filas; i++) {
                subtotal = subtotal + Double.parseDouble(detalleComprajTable.getValueAt(i - 1, 4).toString());
                SubtotaljTextField.setText(Double.toString(subtotal));
                double IVA;
                if (!IVAjTextField.getText().isEmpty() && !SubtotaljTextField.getText().isEmpty()) {
                    IVA = Double.parseDouble(IVAjTextField.getText());
                    subtotal = Double.parseDouble(SubtotaljTextField.getText());
                } else {
                    IVA = 0.00;
                    subtotal = 0.00;
                }
                double total = subtotal + IVA;
                totaljTextField.setText(Double.toString(total));
            }
        }
    }

    private void guardarOActualizarCompra() {
        int resultado = 0;
        Compra compra = new Compra();
        try {
            compra.setUsuario(new Usuario().obtenerUsuario(this.idUsuario));
            compra.setMontoCompra(Double.parseDouble(SubtotaljTextField.getText()));
            compra.setProveedor(new Proveedor().obtenerProveedor(ProveedorjComboBox.getSelectedItem().toString()));
            compra.setIvaCompra(Double.parseDouble(IVAjTextField.getText()));
            this.cargarProductosPorCompra();
            compra.setProductos(this.productosPorCompra);
            if (this.actualizarStockProductos()) {
                if (CompraIDjTextField.getText().isEmpty()) {
                    resultado = compra.altaCompra(compra);
                } else {
                    compra.setIdCompra(Integer.parseInt(CompraIDjTextField.getText()));
                    resultado = compra.modificarCompra(compra);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al tratar de actualizar el stock de los productos");
            }
            if (resultado != 0) {
                if (guardarPago(resultado) != 0 && guardarMovimientoCaja(resultado) != 0) {
                    JOptionPane.showMessageDialog(null, "Compra ingresada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar el pago o el movimiento de caja");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar la compra");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean actualizarStockProductos() {
        int resultado = 0;
        boolean actualizo = false;
        if (!productos.isEmpty()) {
            for (int i = 0; i < productos.size(); i++) {
                try {
                    if (productos.get(i).modificarProducto(productos.get(i)) != 0) {
                        resultado++;
                    }
                } catch (Exception ex) {
                    Logger.getLogger(AltaCompra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (resultado == productos.size()) {
                actualizo = true;
            }
        }
        return actualizo;
    }

    private void eliminarItemProducto() {
        DefaultTableModel tabla = (DefaultTableModel) detalleComprajTable.getModel();
        try {
            if (tabla.getRowCount() != 0) {
                double precio = (double) tabla.getValueAt(detalleComprajTable.getSelectedRow(), 3);
                double total = Double.parseDouble(IVAjTextField.getText()) - precio;
                IVAjTextField.setText(Double.toString(total));
                tabla.removeRow(detalleComprajTable.getSelectedRow());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el producto a eliminar");
        }
    }

    private int guardarPago(int idCompra) {
        int resultado = 0;
        Pago pago = new Pago();
        try {
            pago.setCompra(new Compra().obtenerCompra(idCompra));
            pago.setTipoPago(new TipoPago().obtenerTipoPago(1));
            pago.setMontoPago(Double.parseDouble(totaljTextField.getText()));
            resultado = pago.altaPagoCompra(pago);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }

    private int guardarMovimientoCaja(int idCompra) {
        int resultado = 0;
        Movimiento mov = new Movimiento();
        try {
            Compra compra = new Compra().obtenerCompra(idCompra);
            mov.setDescripcionMovimiento("COMPRA N°: " + idCompra + " REALIZADA EL: " + compra.getFechaCompra().toString());
            mov.setMontoMovimiento(Double.parseDouble(totaljTextField.getText()));
            mov.setCaja(new Caja().obtenerCaja(this.idCaja));
            resultado = mov.altaMovimiento(mov);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }

}
