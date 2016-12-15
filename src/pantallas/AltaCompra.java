/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Compra;
import entidades.Producto;
import entidades.Proveedor;
import entidades.Usuario;
import java.awt.event.ItemEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
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
    
    private Producto producto;
    private final Usuario usuario;
    
    public AltaCompra(Usuario usuario) {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        buscarProveedor();
        ProveedorjComboBox.requestFocus();
        this.usuario = usuario;
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
        DescripcionjComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        agregarProdjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        generarFacturajButton = new javax.swing.JButton();
        GuardarjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        TipoFacturajComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        totaljTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CUITjTextField = new javax.swing.JTextField();
        ProveedorjComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        CompraIDjTextField = new javax.swing.JTextField();

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva venta - OSG");

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
                "Codigo", "Producto", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
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
        jScrollPane2.setViewportView(detalleComprajTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Total");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Proveedor");

        codigoBarrajTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigoBarrajTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        codigoBarrajTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                codigoBarrajTextFieldInputMethodTextChanged(evt);
            }
        });

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
        NuevoProvjButton.setText("Nuevo Proveedor");
        NuevoProvjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProvjButtonActionPerformed(evt);
            }
        });

        DescripcionjComboBox.setEditable(true);
        DescripcionjComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Descripción");

        agregarProdjButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarProdjButton.setText("Agregar");
        agregarProdjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdjButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Producto");

        generarFacturajButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        generarFacturajButton.setText("Generar Factura");
        generarFacturajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarFacturajButtonActionPerformed(evt);
            }
        });

        GuardarjButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GuardarjButton.setText("Guardar");
        GuardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarjButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tipo de Factura");

        totaljTextField.setEditable(false);
        totaljTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CUIT");

        CUITjTextField.setEditable(false);

        ProveedorjComboBox.setEditable(true);
        ProveedorjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProveedorjComboBoxItemStateChanged(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Ayuda");

        CompraIDjTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eliminarProductoTablajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(totaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TipoFacturajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(generarFacturajButton)
                        .addGap(18, 18, 18)
                        .addComponent(GuardarjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DescripcionjComboBox, 0, 325, Short.MAX_VALUE)
                                    .addComponent(codigoBarrajTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cantidadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(agregarProdjButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProveedorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CUITjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NuevoProvjButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CompraIDjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarProdjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoBarrajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescripcionjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eliminarProductoTablajButton)
                    .addComponent(totaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generarFacturajButton)
                        .addComponent(GuardarjButton)
                        .addComponent(TipoFacturajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
                CUITjTextField.setText(Integer.toString(proveedor.getCuit()));
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

    private void codigoBarrajTextFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_codigoBarrajTextFieldInputMethodTextChanged
        // TODO add your handling code here:
        this.buscarProducto(codigoBarrajTextField.getText());
    }//GEN-LAST:event_codigoBarrajTextFieldInputMethodTextChanged

    private void agregarProdjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdjButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_agregarProdjButtonActionPerformed

    private void generarFacturajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarFacturajButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_generarFacturajButtonActionPerformed

    private void GuardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarjButtonActionPerformed
        // TODO add your handling code here:
        int resultado = 0;
        Compra compra = new Compra();
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            compra.setUsuario(this.usuario);
            compra.setMontoCompra(Float.parseFloat(totaljTextField.getText()));
            compra.setProveedor(new Proveedor().obtenerProveedor(ProveedorjComboBox.getSelectedItem().toString()));
            Field field = TipoFacturajComboBox.getSelectedItem().getClass().getField("porcIVA");
            compra.setIvaCompra(field.getFloat(TipoFacturajComboBox.getSelectedItem()));
            DefaultTableModel tabla = (DefaultTableModel) detalleComprajTable.getModel();
            for (int i = 0; i < tabla.getRowCount(); i++) {
                String codigobarra = tabla.getValueAt(i, 0).toString();
                productos.add(new Producto().obtenerProductoCodBarra(codigobarra));
            }
            compra.setProductos(productos);
            if (CompraIDjTextField.getText().isEmpty()) {
                resultado = compra.altaCompra(compra);
            } else {
                compra.setIdCompra(Integer.parseInt(CompraIDjTextField.getText()));
                resultado = compra.modificarCompra(compra);
            }
            if (resultado != 0) {
                JOptionPane.showMessageDialog(null, "Compra ingresada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar la compra");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_GuardarjButtonActionPerformed

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
                Usuario usuario = new MenuDeOpcionesEmpleado().usuario;
                new AltaCompra(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CUITjTextField;
    private javax.swing.JTextField CompraIDjTextField;
    private javax.swing.JComboBox DescripcionjComboBox;
    private javax.swing.JButton GuardarjButton;
    private javax.swing.JButton NuevoProvjButton;
    private javax.swing.JComboBox<String> ProveedorjComboBox;
    private javax.swing.JComboBox<String> TipoFacturajComboBox;
    private javax.swing.JButton agregarProdjButton;
    private javax.swing.JTextField cantidadjTextField;
    private javax.swing.JTextField codigoBarrajTextField;
    private javax.swing.JTable detalleComprajTable;
    private javax.swing.JButton eliminarProductoTablajButton;
    private javax.swing.JButton generarFacturajButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField totaljTextField;
    // End of variables declaration//GEN-END:variables

    private void buscarProveedor() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
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
    
    private void buscarProducto(String codigoBarra) {
        try {
            producto = new Producto().obtenerProductoCodBarra(codigoBarra);
            DescripcionjComboBox.addItem(producto.getDescripcionProducto());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void cargarProductoATabla() {
        DefaultTableModel tabla = (DefaultTableModel) detalleComprajTable.getModel();
        if (!DescripcionjComboBox.getSelectedItem().toString().isEmpty()) {
            Object[] columnas = new Object[4];
            columnas[0] = producto.getCodigoBarra();
            columnas[1] = producto.getDescripcionProducto();
            columnas[2] = Integer.parseInt(cantidadjTextField.getText());
            columnas[3] = producto.getPrecioUnitario();
            tabla.addRow(columnas);
            float total = Float.parseFloat(totaljTextField.getText()) + producto.getPrecioUnitario();
            totaljTextField.setText(Float.toString(total));
        } else {
            JOptionPane.showMessageDialog(null, "Debe buscar un producto primero");
        }
    }
    
    private void eliminarItemProducto() {
        DefaultTableModel tabla = (DefaultTableModel) detalleComprajTable.getModel();
        if (tabla.getRowCount() != 0) {
            float precio = (float) tabla.getValueAt(detalleComprajTable.getSelectedRow(), 3);
            float total = Float.parseFloat(totaljTextField.getText()) - precio;
            totaljTextField.setText(Float.toString(total));
            try {
                tabla.removeRow(detalleComprajTable.getSelectedRow());
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el producto a eliminar");
            }
        }
    }
}
