/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Compra;
import entidades.Pago;
import entidades.Proveedor;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author German
 */
public class GestionDeProveedores extends javax.swing.JFrame {

    private ArrayList<ArrayList<Compra>> compras = new ArrayList<>();
    private TableRowSorter trsFiltro;

    /**
     * Creates new form GestinonCliente
     */
    public GestionDeProveedores() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        agregarProveedoresATabla();
        ProveedoresjTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DarBajajButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProveedoresjTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ComprasjTable = new javax.swing.JTable();
        PagoComprajButton = new javax.swing.JButton();
        NuevoProveedorjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FiltrojComboBox = new javax.swing.JComboBox<String>();
        FiltrojTextField = new javax.swing.JTextField();
        EditarProveedorjButton = new javax.swing.JButton();
        imprimirjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de clientes");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setMinimumSize(new java.awt.Dimension(713, 510));

        DarBajajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DarBajajButton.setText("Dar de baja proveedor/es seleccionados");
        DarBajajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarBajajButtonActionPerformed(evt);
            }
        });

        ProveedoresjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CUIT", "Razon Social", "Nombre de Fantasia", "Provincia", "Localidad", "Dirección", "Telefono", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProveedoresjTable.getTableHeader().setReorderingAllowed(false);
        ProveedoresjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProveedoresjTable);
        if (ProveedoresjTable.getColumnModel().getColumnCount() > 0) {
            ProveedoresjTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        ComprasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compra", "Fecha", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
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
        jScrollPane2.setViewportView(ComprasjTable);

        PagoComprajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PagoComprajButton.setText("Agregar pago");

        NuevoProveedorjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NuevoProveedorjButton.setText("Nuevo proveedor");
        NuevoProveedorjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProveedorjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por:");

        FiltrojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre de fantasia", "Razon social" }));

        FiltrojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FiltrojTextFieldKeyTyped(evt);
            }
        });

        EditarProveedorjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EditarProveedorjButton.setText("Editar proveedor");

        imprimirjButton.setText("Imprimir");
        imprimirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NuevoProveedorjButton)
                        .addGap(18, 18, 18)
                        .addComponent(EditarProveedorjButton)
                        .addGap(18, 18, 18)
                        .addComponent(DarBajajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimirjButton))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FiltrojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FiltrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 574, Short.MAX_VALUE)
                        .addComponent(PagoComprajButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltrojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(PagoComprajButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DarBajajButton)
                        .addComponent(imprimirjButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NuevoProveedorjButton)
                        .addComponent(EditarProveedorjButton)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProveedoresjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedoresjTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            if (ProveedoresjTable.getSelectedRow() > -1) {
                agregarComprasPorProveedor();
            }
        } else if (evt.getClickCount() == 2) {
            abrirEditarProveedor();
        }
    }//GEN-LAST:event_ProveedoresjTableMouseClicked

    private void NuevoProveedorjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProveedorjButtonActionPerformed
        // TODO add your handling code here:

        AltaProveedor nuProveVent = new AltaProveedor();
        nuProveVent.setTitle("Nuevo Proveedor");
        nuProveVent.setVisible(true);
    }//GEN-LAST:event_NuevoProveedorjButtonActionPerformed

    private void DarBajajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarBajajButtonActionPerformed
        // TODO add your handling code here:
        darDeBajaProveedores();
    }//GEN-LAST:event_DarBajajButtonActionPerformed

    private void FiltrojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltrojTextFieldKeyTyped
        // TODO add your handling code here:
        FiltrojTextField.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (FiltrojTextField.getText());
                FiltrojTextField.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(ProveedoresjTable.getModel());
        ProveedoresjTable.setRowSorter(trsFiltro);
    }//GEN-LAST:event_FiltrojTextFieldKeyTyped

    private void imprimirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirjButtonActionPerformed
        // TODO add your handling code here:
        imprimir();
    }//GEN-LAST:event_imprimirjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDeProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDeProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDeProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDeProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDeProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ComprasjTable;
    private javax.swing.JButton DarBajajButton;
    private javax.swing.JButton EditarProveedorjButton;
    private javax.swing.JComboBox<String> FiltrojComboBox;
    private javax.swing.JTextField FiltrojTextField;
    private javax.swing.JButton NuevoProveedorjButton;
    private javax.swing.JButton PagoComprajButton;
    private javax.swing.JTable ProveedoresjTable;
    private javax.swing.JButton imprimirjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla(JTable tabla) {
        int filas = tabla.getRowCount();
        if (filas > 0) {
            DefaultTableModel defaultTabla = (DefaultTableModel) tabla.getModel();
            for (int i = filas; i >= -1; i--) {
                defaultTabla.removeRow(i);
            }
        }
    }

    private void agregarProveedoresATabla() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            proveedores = new Proveedor().obtenerProveedores();
            if (!proveedores.isEmpty()) {
                DefaultTableModel tabla = (DefaultTableModel) ProveedoresjTable.getModel();
                Object[] columnas = new Object[9];
                for (int i = 0; i < proveedores.size(); i++) {
                    columnas[0] = proveedores.get(i).getIdProveedor();
                    columnas[1] = proveedores.get(i).getCuit();
                    columnas[2] = proveedores.get(i).getRazonSocial();
                    columnas[3] = proveedores.get(i).getNombreFantasia();
                    columnas[4] = proveedores.get(i).getLocalidad().getProvincia().getNombreProvincia();
                    columnas[5] = proveedores.get(i).getLocalidad().getNombreLocalidad();
                    columnas[6] = proveedores.get(i).getDireccionProveedor();
                    columnas[7] = proveedores.get(i).getTelefonoProveedor();
                    columnas[8] = proveedores.get(i).getMailProveedor();
                    compras.add(new Compra().obtenerComprasProveedor(proveedores.get(i).getIdProveedor()));
                    tabla.addRow(columnas);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Aun no cargado ningun proveedor. Por favor ingrese uno");
            }
        } catch (Exception e) {
            Logger.getLogger(GestionDeProveedores.class.getName()).log(Level.SEVERE, e.getMessage(), e);
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }

    private void filtro() {
        int columnaABuscar = 0;
        if ("Nombre de Fantasia".toLowerCase().trim().equals(FiltrojComboBox.getSelectedItem().toString().toLowerCase().trim())) {
            columnaABuscar = 3;
        }
        if ("Razon Social".toLowerCase().trim().equals(FiltrojComboBox.getSelectedItem().toString().toLowerCase().trim())) {
            columnaABuscar = 2;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(FiltrojTextField.getText().toLowerCase().trim(), columnaABuscar));
    }

    private void agregarComprasPorProveedor() {
        limpiarTabla(ComprasjTable);
        try {
            int fila = ProveedoresjTable.getSelectedRow();
            if (!compras.isEmpty()) {
                DefaultTableModel tabla = (DefaultTableModel) ComprasjTable.getModel();
                Object[] columnas = new Object[3];
                if (!compras.get(fila).isEmpty()) {
                    for (int i = 0; i < compras.get(fila).size(); i++) {
                        columnas[0] = compras.get(fila).get(i).getIdCompra();
                        columnas[1] = compras.get(fila).get(i).getFechaCompra();
                        Pago pago = new Pago().obtenerPagoCompra(compras.get(fila).get(i).getIdCompra());
                        double montoTotalCompra = compras.get(fila).get(i).getMontoCompra() + compras.get(fila).get(i).getIvaCompra();
                        double saldo = montoTotalCompra - pago.getMontoPago();
                        columnas[2] = saldo;
                        tabla.addRow(columnas);
                    }
                }
            }
        } catch (Exception e) {
            Logger.getLogger(GestionDeProveedores.class.getName()).log(Level.SEVERE, e.getMessage(), e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void abrirEditarProveedor() {
        if (ProveedoresjTable.getSelectedRow() != -1) {
            int fila = ProveedoresjTable.getSelectedRow();
            int idProveedor = (int) ProveedoresjTable.getValueAt(fila, 0);
            try {
                Proveedor proveedor = new Proveedor().obtenerProveedor(idProveedor);
                AltaProveedor modProveedor = new AltaProveedor();
                modProveedor.CUITjTextField.setText(Long.toString(proveedor.getCuit()));
                modProveedor.RazonSocialjTextField.setText(proveedor.getRazonSocial());
                modProveedor.NombreFantasiajTextField.setText(proveedor.getNombreFantasia());
                modProveedor.ProvinciasjComboBox.setSelectedItem(proveedor.getLocalidad().getProvincia());
                modProveedor.LocalidadesjComboBox.setSelectedItem(proveedor.getLocalidad());
                modProveedor.CodPostjTextField.setText(Integer.toString(proveedor.getLocalidad().getCodigoPosta()));
                modProveedor.DireccionjTextField.setText(proveedor.getDireccionProveedor());
                modProveedor.EmailjTextField.setText(proveedor.getMailProveedor());
                modProveedor.TelefonojTextField.setText(Long.toString(proveedor.getTelefonoProveedor()));
                modProveedor.ProveedorIDjTextField.setText(Integer.toString(proveedor.getIdProveedor()));
                modProveedor.setTitle("Modificar Proveedor");
                modProveedor.setVisible(true);
            } catch (Exception e) {
                Logger.getLogger(GestionDeProveedores.class.getName()).log(Level.SEVERE, e.getMessage(), e);
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    private void darDeBajaProveedores() {
        int resultados = 0;
        if (ProveedoresjTable.getSelectedRowCount() > 0) {
            int[] filas = ProveedoresjTable.getSelectedRows();
            for (int i = 0; i < filas.length; i++) {
                int idProveedor = (int) ProveedoresjTable.getValueAt(filas[i], 0);
                try {
                    Proveedor proveedor = new Proveedor();
                    proveedor.setIdProveedor(idProveedor);
                    proveedor.setFechaBajaProveedor(new Date());
                    if (proveedor.darDeBajaProveedor(proveedor) != 0) {
                        resultados++;
                    }
                } catch (Exception e) {
                    Logger.getLogger(GestionDeProveedores.class.getName()).log(Level.SEVERE, e.getMessage(), e);
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            if (resultados == filas.length) {
                JOptionPane.showMessageDialog(null, "Se han dado de baja " + resultados + " proveedores");
                this.dispose();
                new GestionDeProveedores().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una fila de la tabla para dar de baja");
        }
    }

    private void imprimir() {
        int fila = ProveedoresjTable.getSelectedRow();
        if (fila != -1) {
            try {
                MessageFormat headerFormat = new MessageFormat("Proveedor: " + ProveedoresjTable.getValueAt(fila, 3).toString()
                        + "\n CUIT: " + ProveedoresjTable.getValueAt(fila, 1).toString() + "\n");
                MessageFormat footerFormat = new MessageFormat("Cantidad de compras: "
                        + ComprasjTable.getRowCount());
                ComprasjTable.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
            } catch (PrinterException ex) {
                Logger.getLogger(GestionDeCompras.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            }
        } else {
            MessageFormat headerFormat = new MessageFormat("LISTADO DE PROVEEDORES \n"
                    + "CANTIDAD DE PROVEEDORES: " + ProveedoresjTable.getRowCount() + "\n");
            MessageFormat footerFormat = new MessageFormat("");
            try {
                ProveedoresjTable.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
            } catch (PrinterException ex) {
                Logger.getLogger(GestionDeCompras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
