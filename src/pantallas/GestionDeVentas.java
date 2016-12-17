/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Compra;
import entidades.Producto;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author German
 */
public class GestionDeVentas extends javax.swing.JFrame {

    private ArrayList<ArrayList<Producto>> productos = new ArrayList<>();
    int idUsuario;

    /**
     * Creates new form GestionPresupuesto
     */
    public GestionDeVentas() {
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
        jButton3 = new javax.swing.JButton();
        SPpresupuestoArticulos = new javax.swing.JScrollPane();
        DetalleComprasjTable = new javax.swing.JTable();
        EditarComprajButton = new javax.swing.JButton();
        NuevaComprajButton = new javax.swing.JButton();
        HastajCalendar = new com.toedter.calendar.JDateChooser();
        DesdejCalendar = new com.toedter.calendar.JDateChooser();
        SPpresupuesto = new javax.swing.JScrollPane();
        ComprasjTable = new javax.swing.JTable();
        BajaComprajButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BuscarjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        ImprimirDetallejButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de ventas - OSG");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Nuevo tipo de pago");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        DetalleComprasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Cantidad", "Precio unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SPpresupuestoArticulos.setViewportView(DetalleComprasjTable);

        EditarComprajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EditarComprajButton.setText("Editar venta");
        EditarComprajButton.setMaximumSize(new java.awt.Dimension(41, 41));
        EditarComprajButton.setMinimumSize(new java.awt.Dimension(41, 41));
        EditarComprajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarComprajButtonActionPerformed(evt);
            }
        });

        NuevaComprajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NuevaComprajButton.setText("Nueva venta");
        NuevaComprajButton.setMaximumSize(new java.awt.Dimension(41, 41));
        NuevaComprajButton.setMinimumSize(new java.awt.Dimension(41, 41));
        NuevaComprajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaComprajButtonActionPerformed(evt);
            }
        });

        HastajCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HastajCalendar.setMinimumSize(new java.awt.Dimension(27, 25));
        HastajCalendar.setName("HastajCalendar"); // NOI18N
        HastajCalendar.setPreferredSize(new java.awt.Dimension(87, 18));

        DesdejCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesdejCalendar.setMinimumSize(new java.awt.Dimension(27, 25));
        DesdejCalendar.setName("DesdejCalendar"); // NOI18N

        ComprasjTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComprasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Usuario", "Cliente", "Fecha de compra", "Monto s/ IVA", "Monto c/ IVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ComprasjTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComprasjTable.getTableHeader().setReorderingAllowed(false);
        ComprasjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprasjTableMouseClicked(evt);
            }
        });
        SPpresupuesto.setViewportView(ComprasjTable);
        if (ComprasjTable.getColumnModel().getColumnCount() > 0) {
            ComprasjTable.getColumnModel().getColumn(0).setMinWidth(70);
            ComprasjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            ComprasjTable.getColumnModel().getColumn(0).setMaxWidth(90);
            ComprasjTable.getColumnModel().getColumn(2).setMinWidth(70);
            ComprasjTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            ComprasjTable.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        BajaComprajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BajaComprajButton.setText("Dar de baja venta");
        BajaComprajButton.setMaximumSize(new java.awt.Dimension(41, 41));
        BajaComprajButton.setMinimumSize(new java.awt.Dimension(41, 41));
        BajaComprajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaComprajButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Desde");

        BuscarjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BuscarjButton.setText("Buscar");
        BuscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarjButtonActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Hasta");

        ImprimirDetallejButton.setText("Imprimir");
        ImprimirDetallejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirDetallejButtonActionPerformed(evt);
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
                        .addComponent(NuevaComprajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditarComprajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BajaComprajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImprimirDetallejButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(DesdejCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(HastajCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SPpresupuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SPpresupuestoArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DesdejCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastajCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BuscarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPpresupuestoArticulos)
                    .addComponent(jSeparator1)
                    .addComponent(SPpresupuesto))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevaComprajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarComprajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BajaComprajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImprimirDetallejButton))
                .addContainerGap())
        );

        HastajCalendar.getAccessibleContext().setAccessibleName("CSpresupuestoRangoHasta");
        DesdejCalendar.getAccessibleContext().setAccessibleName("CSpresupuestoRangoDesde");

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

    private void BuscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarjButtonActionPerformed
        agregarComprasTabla();
    }//GEN-LAST:event_BuscarjButtonActionPerformed

    private void ComprasjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprasjTableMouseClicked
        if (evt.getClickCount() == 1) {
            ComprasjTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (ComprasjTable.getSelectedRow() > -1) {
                        agregarDetalleCompra();
                    }
                }
            });
        } else if (evt.getClickCount() == 2) {
            abrirEditarCompra();
        }
    }//GEN-LAST:event_ComprasjTableMouseClicked

    private void ImprimirDetallejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirDetallejButtonActionPerformed
        if (ComprasjTable.getSelectedRow() != -1) {
            try {
                MessageFormat headerFormat = new MessageFormat("COMPRAS REALIZADAS - DESDE: "
                        + DesdejCalendar.getDateFormatString() + " HASTA: " + HastajCalendar.getDateFormatString());
                MessageFormat footerFormat = new MessageFormat("Cantidad de compras: "
                        + ComprasjTable.getRowCount());
                ComprasjTable.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
            } catch (PrinterException ex) {
                Logger.getLogger(GestionDeVentas.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        } else {
            int fila = ComprasjTable.getSelectedRow();
            int nrocompra = (int) ComprasjTable.getValueAt(fila, 0);
            String usuario = ComprasjTable.getValueAt(fila, 1).toString();
            String proveedor = ComprasjTable.getValueAt(fila, 2).toString();
            String fechaCompra = ComprasjTable.getValueAt(fila, 3).toString();
            String montoSIVA = ComprasjTable.getValueAt(fila, 4).toString();
            String montoCIVA = ComprasjTable.getValueAt(fila, 5).toString();
            MessageFormat headerFormat = new MessageFormat("COMPRA N°: " + nrocompra + "\n"
                    + "REALIZADA POR: " + usuario + "\n" + "AL PROVEEDOR: " + proveedor + "\n"
                    + "FECHA DE COMPRA: " + fechaCompra + "\n"
            );
            MessageFormat footerFormat = new MessageFormat("SUBTOTAL: " + montoSIVA + "\n"
                    + "TOTAL: " + montoCIVA + "\n"
            );
            try {
                ComprasjTable.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
            } catch (PrinterException ex) {
                Logger.getLogger(GestionDeVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ImprimirDetallejButtonActionPerformed

    private void BajaComprajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaComprajButtonActionPerformed
        if (ComprasjTable.getSelectedRow() != -1) {
            int fila = ComprasjTable.getSelectedRow();
            int idcompra = (int) ComprasjTable.getValueAt(fila, 0);
            Compra compra = new Compra();
            compra.setIdCompra(idcompra);
            try {
                int resultado = compra.darDeBajaCompra(compra);
                if (resultado == 1) {
                    JOptionPane.showMessageDialog(null, "La compra fue dada de baja exitosamente");
                }
            } catch (Exception e) {
                Logger.getLogger(GestionDeVentas.class.getName()).log(Level.SEVERE, e.getMessage(), e);
                JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar dar de baja la compra");
            }
        }
    }//GEN-LAST:event_BajaComprajButtonActionPerformed

    private void EditarComprajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarComprajButtonActionPerformed
        abrirEditarCompra();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_EditarComprajButtonActionPerformed

    private void NuevaComprajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaComprajButtonActionPerformed
        // TODO add your handling code here:
        VentaEmpleado nuevaVenta = new VentaEmpleado();
        nuevaVenta.idUsuario = this.idUsuario;
        nuevaVenta.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_NuevaComprajButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new TipoPago().setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BajaComprajButton;
    private javax.swing.JButton BuscarjButton;
    private javax.swing.JTable ComprasjTable;
    private com.toedter.calendar.JDateChooser DesdejCalendar;
    private javax.swing.JTable DetalleComprasjTable;
    private javax.swing.JButton EditarComprajButton;
    private com.toedter.calendar.JDateChooser HastajCalendar;
    private javax.swing.JButton ImprimirDetallejButton;
    private javax.swing.JButton NuevaComprajButton;
    private javax.swing.JScrollPane SPpresupuesto;
    private javax.swing.JScrollPane SPpresupuestoArticulos;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void borrarRenglones(int jpanel) {
        int a;
        DefaultTableModel tabla;
        if (jpanel == 1) {
            tabla = (DefaultTableModel) ComprasjTable.getModel();
            a = ComprasjTable.getRowCount() - 1;
        } else {
            tabla = (DefaultTableModel) DetalleComprasjTable.getModel();
            a = DetalleComprasjTable.getRowCount() - 1;
        }
        for (int i = a; i >= 0; i--) {
            tabla.removeRow(i); //se van borrando para que solo muestre el producto que se buscó
        }
    }

    private void agregarComprasTabla() {
        DefaultTableModel tabla = (DefaultTableModel) ComprasjTable.getModel();
        ArrayList<Compra> compras = new ArrayList<>();
        Object[] columnas = new Object[6];
        try {
            compras = new Compra().listaCompras(DesdejCalendar.getDate(), HastajCalendar.getDate());
            if (compras.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Aun no se han realizado compras, puedes comenzar desde "
                        + "el boton 'Nueva compra'");
            } else {
                for (int i = 0; i < compras.size(); i++) {
                    columnas[0] = compras.get(i).getIdCompra();
                    columnas[1] = compras.get(i).getUsuario().getNombreUsuario();
                    columnas[2] = compras.get(i).getProveedor().getNombreFantasia();
                    columnas[3] = new SimpleDateFormat("dd-MM-yyyy").format(compras.get(i).getFechaCompra().getTime());
                    columnas[4] = compras.get(i).getMontoCompra();
                    float compra = compras.get(i).getMontoCompra();
                    float iva = compras.get(i).getIvaCompra() + 1;
                    float total = compra * iva;
                    columnas[5] = total;
                    this.productos.add(compras.get(i).getProductos());
                    tabla.addRow(columnas);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void agregarDetalleCompra() {
        DefaultTableModel tabla = (DefaultTableModel) DetalleComprasjTable.getModel();
        Object[] columnas = new Object[4];
        try {
            int fila = DetalleComprasjTable.getSelectedRow();
            if (!this.productos.isEmpty()) {
                if (!this.productos.get(fila).isEmpty()) {
                    for (int j = 0; j < this.productos.get(fila).size(); j++) {
                        columnas[0] = this.productos.get(fila).get(j).getCodigoBarra();
                        columnas[1] = this.productos.get(fila).get(j).getDescripcionProducto();
                        columnas[2] = this.productos.get(fila).get(j).getStock();
                        columnas[3] = this.productos.get(fila).get(j).getPrecioUnitario();
                        tabla.addRow(columnas);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al cargar los productos de las compras");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void abrirEditarCompra() {
        if (ComprasjTable.getSelectedRow() != -1) {
            int fila = ComprasjTable.getSelectedRow();
            int idCompra = (int) ComprasjTable.getValueAt(fila, 0);
            try {
                Compra compra = new Compra().obtenerCompra(idCompra);
                AltaCompra modCompra = new AltaCompra();
                modCompra.CompraIDjTextField.setText(Integer.toString(compra.getIdCompra()));
                modCompra.ProveedorjComboBox.addItem(compra.getProveedor().getNombreFantasia());
                modCompra.CUITjTextField.setText(Integer.toString(compra.getProveedor().getCuit()));
                if (compra.getProductos().size() > 0) {
                    DefaultTableModel tabla2 = (DefaultTableModel) modCompra.detalleComprajTable.getModel();
                    Object[] columnas = new Object[4];
                    for (int i = 0; i < compra.getProductos().size(); i++) {
                        columnas[0] = compra.getProductos().get(i).getCodigoBarra();
                        columnas[1] = compra.getProductos().get(i).getDescripcionProducto();
                        columnas[2] = compra.getProductos().get(i).getStock();
                        columnas[3] = compra.getProductos().get(i).getPrecioUnitario();
                        tabla2.addRow(columnas);
                    }
                }
                modCompra.SubtotaljTextField.setText(Float.toString(compra.getMontoCompra()));
                modCompra.IVAjTextField.setText(Float.toString(compra.getIvaCompra()));
                Float total = compra.getMontoCompra() + compra.getIvaCompra();
                modCompra.totaljTextField.setText(total.toString());
                modCompra.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecionar una fila para poder editarla");
        }
    }
}
