/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Compra;
import entidades.Pago;
import entidades.Producto;
import entidades.Venta;
import gestores.Logs;
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
    String nombreUsuario;

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
        DetalleVentasjTable = new javax.swing.JTable();
        EditarVentajButton = new javax.swing.JButton();
        NuevaVentajButton = new javax.swing.JButton();
        HastajCalendar = new com.toedter.calendar.JDateChooser();
        DesdejCalendar = new com.toedter.calendar.JDateChooser();
        SPpresupuesto = new javax.swing.JScrollPane();
        VentasjTable = new javax.swing.JTable();
        BajaVentajButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BuscarjButton = new javax.swing.JButton();
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

        DetalleVentasjTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DetalleVentasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de barra", "Producto", "Cantidad", "Precio unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
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
        DetalleVentasjTable.getTableHeader().setReorderingAllowed(false);
        SPpresupuestoArticulos.setViewportView(DetalleVentasjTable);

        EditarVentajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EditarVentajButton.setText("Editar venta");
        EditarVentajButton.setMaximumSize(new java.awt.Dimension(41, 41));
        EditarVentajButton.setMinimumSize(new java.awt.Dimension(41, 41));
        EditarVentajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarVentajButtonActionPerformed(evt);
            }
        });

        NuevaVentajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NuevaVentajButton.setText("Nueva venta");
        NuevaVentajButton.setMaximumSize(new java.awt.Dimension(41, 41));
        NuevaVentajButton.setMinimumSize(new java.awt.Dimension(41, 41));
        NuevaVentajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaVentajButtonActionPerformed(evt);
            }
        });

        HastajCalendar.setDateFormatString("dd-MM-yyyy");
        HastajCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HastajCalendar.setMinimumSize(new java.awt.Dimension(27, 25));
        HastajCalendar.setName("HastajCalendar"); // NOI18N
        HastajCalendar.setDate(new Date());
        HastajCalendar.setPreferredSize(new java.awt.Dimension(87, 18));

        DesdejCalendar.setDateFormatString("dd-MM-yyyy");
        DesdejCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DesdejCalendar.setMinimumSize(new java.awt.Dimension(27, 25));
        DesdejCalendar.setName("DesdejCalendar"); // NOI18N
        DesdejCalendar.setDate(new Date());

        VentasjTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VentasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Usuario", "Cliente", "Fecha de venta", "Monto s/ IVA", "Monto c/ IVA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VentasjTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VentasjTable.getTableHeader().setReorderingAllowed(false);
        VentasjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasjTableMouseClicked(evt);
            }
        });
        SPpresupuesto.setViewportView(VentasjTable);
        if (VentasjTable.getColumnModel().getColumnCount() > 0) {
            VentasjTable.getColumnModel().getColumn(0).setMinWidth(70);
            VentasjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            VentasjTable.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        BajaVentajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BajaVentajButton.setText("Dar de baja venta");
        BajaVentajButton.setMaximumSize(new java.awt.Dimension(41, 41));
        BajaVentajButton.setMinimumSize(new java.awt.Dimension(41, 41));
        BajaVentajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaVentajButtonActionPerformed(evt);
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
                .addContainerGap(905, Short.MAX_VALUE)
                .addComponent(ImprimirDetallejButton)
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NuevaVentajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditarVentajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BajaVentajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(SPpresupuesto)
                    .addComponent(SPpresupuestoArticulos))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                .addComponent(SPpresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPpresupuestoArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevaVentajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarVentajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BajaVentajButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImprimirDetallejButton))
                .addContainerGap())
        );

        HastajCalendar.getAccessibleContext().setAccessibleName("");
        DesdejCalendar.getAccessibleContext().setAccessibleName("");

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

    private void BuscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarjButtonActionPerformed
        agregarVentasTabla();
    }//GEN-LAST:event_BuscarjButtonActionPerformed

    private void VentasjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasjTableMouseClicked
        if (evt.getClickCount() == 1) {
            if (VentasjTable.getSelectedRow() > -1) {
                agregarDetalleVenta();
            }
        } else if (evt.getClickCount() == 2) {
            abrirEditarCompra();
        }
    }//GEN-LAST:event_VentasjTableMouseClicked

    private void ImprimirDetallejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirDetallejButtonActionPerformed
        imprimir();
    }//GEN-LAST:event_ImprimirDetallejButtonActionPerformed

    private void NuevaVentajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaVentajButtonActionPerformed
        // TODO add your handling code here:
        AltaVenta nuevaVenta = new AltaVenta();
        nuevaVenta.idUsuario = this.idUsuario;
        nuevaVenta.nombreUsuario = nombreUsuario;
        nuevaVenta.validarCajaAbierta();
        nuevaVenta.cargarTiposPagos();
        nuevaVenta.cargarTipoFactura();
        nuevaVenta.cargarTablaClientes();
        nuevaVenta.setLocationRelativeTo(null);
        nuevaVenta.setVisible(true);
    }//GEN-LAST:event_NuevaVentajButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AltaTipoPago().setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BajaVentajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaVentajButtonActionPerformed
        darDeBajaVentas();
    }//GEN-LAST:event_BajaVentajButtonActionPerformed

    private void EditarVentajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarVentajButtonActionPerformed
        abrirEditarCompra();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_EditarVentajButtonActionPerformed

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
    private javax.swing.JButton BajaVentajButton;
    private javax.swing.JButton BuscarjButton;
    private com.toedter.calendar.JDateChooser DesdejCalendar;
    private javax.swing.JTable DetalleVentasjTable;
    private javax.swing.JButton EditarVentajButton;
    private com.toedter.calendar.JDateChooser HastajCalendar;
    private javax.swing.JButton ImprimirDetallejButton;
    private javax.swing.JButton NuevaVentajButton;
    private javax.swing.JScrollPane SPpresupuesto;
    private javax.swing.JScrollPane SPpresupuestoArticulos;
    private javax.swing.JTable VentasjTable;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla(JTable tabla) {
        int filas = tabla.getRowCount();
        if (filas != -1) {
            DefaultTableModel defaultTabla = (DefaultTableModel) tabla.getModel();
            for (int i = filas; i >= -1; i--) {
                defaultTabla.removeRow(i);
            }
        }
    }

    private void agregarVentasTabla() {
        DefaultTableModel tabla = (DefaultTableModel) VentasjTable.getModel();
        ArrayList<Venta> ventas;
        Object[] columnas = new Object[6];
        try {
            ventas = new Venta().listarVentas(DesdejCalendar.getDate(), HastajCalendar.getDate());
            if (ventas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Aun no se han realizado ventas, puedes comenzar desde "
                        + "el boton 'Nueva Venta'");
            } else {
                limpiarTabla(VentasjTable);
                for (int i = 0; i < ventas.size(); i++) {
                    columnas[0] = ventas.get(i).getIdVenta();
                    columnas[1] = ventas.get(i).getUsuario().getNombreUsuario();
                    columnas[2] = ventas.get(i).getCliente().getApellidoCliente() + " " + ventas.get(i).getCliente().getNombreCliente();
                    columnas[3] = new SimpleDateFormat("dd-MM-yyyy").format(ventas.get(i).getFechaVenta());
                    columnas[4] = ventas.get(i).getMontoVenta();
                    double montoVenta = ventas.get(i).getMontoVenta();
                    double iva = ventas.get(i).getIvaVenta();
                    double total = montoVenta * iva;
                    columnas[5] = total;
                    this.productos.add(ventas.get(i).getProductos());
                    tabla.addRow(columnas);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void agregarDetalleVenta() {
        DefaultTableModel tabla = (DefaultTableModel) DetalleVentasjTable.getModel();
        Object[] columnas = new Object[4];
        try {
            int fila = DetalleVentasjTable.getSelectedRow();
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
        if (VentasjTable.getSelectedRow() != -1) {
            int fila = VentasjTable.getSelectedRow();
            int idVenta = (int) VentasjTable.getValueAt(fila, 0);
            try {
                Venta venta = new Venta().obtenerVenta(idVenta);
                AltaVenta modVenta = new AltaVenta();
                if (venta.getProductos().size() > 0) {
                    DefaultTableModel tabla2 = (DefaultTableModel) modVenta.DetalleVentajTable.getModel();
                    Object[] columnas = new Object[3];
                    for (int i = 0; i < venta.getProductos().size(); i++) {
                        columnas[0] = venta.getProductos().get(i).getCodigoBarra();
                        columnas[1] = venta.getProductos().get(i).getDescripcionProducto();
                        columnas[2] = venta.getProductos().get(i).getPrecioUnitario();
                        tabla2.addRow(columnas);
                    }
                }
                double total = venta.getMontoVenta() + venta.getIvaVenta();
                modVenta.TotaljTextField.setText(Double.toString(total));
                modVenta.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecionar una fila para poder editarla");
        }
    }

    private void darDeBajaVentas() {
        int resultados = 0;
        if (VentasjTable.getSelectedRowCount() > 0) {
            int[] filas = VentasjTable.getSelectedRows();
            for (int i = 0; i < filas.length; i++) {
                int idVenta = (int) VentasjTable.getValueAt(filas[i], 0);
                try {
                    ArrayList<Pago> pagos = new Pago().obtenerPagosVenta(idVenta);
                    if (pagos.isEmpty()) {
                        Venta venta = new Venta();
                        venta.setIdVenta(idVenta);
                        venta.setFechaBajaVenta(new Date());
                        if (venta.darDeBajaVenta(venta) != 0) {
                            resultados++;
                        }
                    }
                } catch (Exception e) {
                    Logger.getLogger(GestionDeVentas.class.getName()).log(Level.SEVERE, e.getMessage(), e);
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            if (resultados == filas.length) {
                JOptionPane.showMessageDialog(null, "Se han dado de baja " + resultados + " ventas");
                this.dispose();
                new GestionDeVentas().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una fila de la tabla para dar de baja");
        }
        try {
            Logs log = new Logs();
            log.user = new VentanaPrincipal().NombreUsuariojLabel.getText();
            log.crearLog("ha dado de baja una venta realizada a un cliente");
        } catch (IOException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void imprimir() {
        if (VentasjTable.getSelectedRow() != -1) {
            try {
                MessageFormat headerFormat = new MessageFormat("VENTAS REALIZADAS - DESDE: "
                        + DesdejCalendar.getDateFormatString() + " HASTA: " + HastajCalendar.getDateFormatString());
                MessageFormat footerFormat = new MessageFormat("Cantidad de ventas: "
                        + VentasjTable.getRowCount());
                VentasjTable.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
            } catch (PrinterException ex) {
                Logger.getLogger(GestionDeVentas.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        } else {
            int fila = VentasjTable.getSelectedRow();
            int nroventa = (int) VentasjTable.getValueAt(fila, 0);
            String usuario = VentasjTable.getValueAt(fila, 1).toString();
            String cliente = VentasjTable.getValueAt(fila, 2).toString();
            String fechaVenta = VentasjTable.getValueAt(fila, 3).toString();
            String montoSIVA = VentasjTable.getValueAt(fila, 4).toString();
            String montoCIVA = VentasjTable.getValueAt(fila, 5).toString();
            MessageFormat headerFormat = new MessageFormat("VENTA N°: " + nroventa + "\n"
                    + "REALIZADA POR: " + usuario + "\n" + "AL CLIENTE: " + cliente + "\n"
                    + "FECHA DE VENTA: " + fechaVenta + "\n"
            );
            MessageFormat footerFormat = new MessageFormat("SUBTOTAL: " + montoSIVA + "\n"
                    + "TOTAL: " + montoCIVA + "\n"
            );
            try {
                VentasjTable.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
            } catch (PrinterException ex) {
                Logger.getLogger(GestionDeVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
