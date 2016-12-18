/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Caja;
import entidades.Cliente;
import entidades.Factura;
import entidades.Pago;
import entidades.Producto;
import entidades.TipoPago;
import entidades.Usuario;
import entidades.Venta;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
public class AltaVenta extends javax.swing.JFrame {

    private int cantidad = 1;
    private TableRowSorter trsFiltro;
    private ArrayList<Producto> productos;
    int idUsuario;
    private double montoVenta;
    private double montoTotal;
    private double montoIVA;
    private int[] bonificaciones;

    /**
     * Creates new form AltaVenta
     */
    public AltaVenta() {
        initComponents();
        cargarTiposPagos();
        cargarTablaClientes();
        cargarTipoFactura();
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
        jLabel1 = new javax.swing.JLabel();
        FiltrojComboBox = new javax.swing.JComboBox<>();
        FiltrojTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DetalleVentajTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        UnidadesjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TotaljTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TipoPagojComboBox = new javax.swing.JComboBox<>();
        AutjLabel = new javax.swing.JLabel();
        NroAutjTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        CobrarjButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        VueltojLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Filtro2jTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ClientesjTable = new javax.swing.JTable();
        GenPresujButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TipoFacturajComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        PorcIVAjComboBox = new javax.swing.JComboBox<>();
        IDVentajTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BonifjTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nueva venta - OSG");

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Buscar por");

        FiltrojComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FiltrojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo de barra", "Nombre del producto" }));

        FiltrojTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FiltrojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FiltrojTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FiltrojTextFieldKeyTyped(evt);
            }
        });

        DetalleVentajTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo de Barra", "Producto", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
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
        DetalleVentajTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(DetalleVentajTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("UNIDADES:");

        UnidadesjTextField.setEditable(false);
        UnidadesjTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("TOTAL:");

        TotaljTextField.setEditable(false);
        TotaljTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TotaljTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotaljTextField.setText("0.00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("TIPO DE PAGO:");

        TipoPagojComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        AutjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AutjLabel.setText("NRO AUTORIZACIÓN:");

        NroAutjTextField.setEditable(false);
        NroAutjTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        CobrarjButton.setText("Cobrar");
        CobrarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobrarjButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("VUELTO:");

        VueltojLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VueltojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VueltojLabel.setText("0.00");
        VueltojLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setText("Apellido y nombre:");

        Filtro2jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Filtro2jTextFieldKeyTyped(evt);
            }
        });

        ClientesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClientesjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ClientesjTable);

        GenPresujButton.setText("Generar presupuesto");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("PAGA CON:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0.00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Tipo de Factura:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("IVA %");

        IDVentajTextField.setVisible(false);
        IDVentajTextField.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("BONIFICACIÓN");

        BonifjTextField1.setEditable(false);
        BonifjTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(FiltrojTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TipoPagojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BonifjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AutjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NroAutjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TipoFacturajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PorcIVAjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UnidadesjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TotaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IDVentajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VueltojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Filtro2jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(GenPresujButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CobrarjButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(FiltrojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FiltrojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Filtro2jTextField)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnidadesjTextField)
                    .addComponent(TotaljTextField)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(PorcIVAjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(TipoFacturajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TipoPagojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AutjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NroAutjTextField)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BonifjTextField1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VueltojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CobrarjButton)
                    .addComponent(GenPresujButton)
                    .addComponent(jTextField1)
                    .addComponent(jLabel6)
                    .addComponent(IDVentajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            cantidad = car;
        }
    }//GEN-LAST:event_jPanel1KeyPressed

    private void Filtro2jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Filtro2jTextFieldKeyTyped
        // TODO add your handling code here:
        FiltrojTextField.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (FiltrojTextField.getText());
                FiltrojTextField.setText(cadena);
                repaint();
                filtroClientes();
            }
        });
        trsFiltro = new TableRowSorter(ClientesjTable.getModel());
        ClientesjTable.setRowSorter(trsFiltro);
    }//GEN-LAST:event_Filtro2jTextFieldKeyTyped

    private void FiltrojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltrojTextFieldKeyTyped
        // TODO add your handling code here:
        switch (FiltrojComboBox.getSelectedIndex()) {
            case 0:
                char car = evt.getKeyChar();
                if ((car < '0' || car > '9')) {
                    evt.consume();
                }
                break;
            case 1:
                buscarProducto(cantidad);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_FiltrojTextFieldKeyTyped

    private void FiltrojTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltrojTextFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarProducto(cantidad);
        }
    }//GEN-LAST:event_FiltrojTextFieldKeyPressed

    private void CobrarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobrarjButtonActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Generar Venta?");
        if (respuesta == JOptionPane.YES_OPTION) {
            guardarOActualizarVenta();
        }
    }//GEN-LAST:event_CobrarjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AltaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaVenta ventana = new AltaVenta();
                if (ventana.validarCajaAbierta()) {
                    ventana.setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutjLabel;
    protected javax.swing.JTextField BonifjTextField1;
    protected javax.swing.JTable ClientesjTable;
    private javax.swing.JButton CobrarjButton;
    protected javax.swing.JTable DetalleVentajTable;
    private javax.swing.JTextField Filtro2jTextField;
    private javax.swing.JComboBox<String> FiltrojComboBox;
    private javax.swing.JTextField FiltrojTextField;
    private javax.swing.JButton GenPresujButton;
    protected javax.swing.JTextField IDVentajTextField;
    protected javax.swing.JTextField NroAutjTextField;
    private javax.swing.JComboBox<String> PorcIVAjComboBox;
    private javax.swing.JComboBox<String> TipoFacturajComboBox;
    protected javax.swing.JComboBox<String> TipoPagojComboBox;
    protected javax.swing.JTextField TotaljTextField;
    protected javax.swing.JTextField UnidadesjTextField;
    private javax.swing.JLabel VueltojLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    protected javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private boolean validarCajaAbierta() {
        boolean resultado = false;
        try {
            Caja caja = new Caja().obtenerCajaPorUsuario(idUsuario);
            Date fecha = new Date();
            Date fechaCajaApertura = caja.getFechaApertura();
            Date fechaCajaCierre = caja.getFechaCierre();
            if (fechaCajaCierre == null && fechaCajaApertura != null) {
                if (fechaCajaApertura.compareTo(fecha) == 0) {
                    resultado = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Usted tiene una caja abierta pero no es del dia y no esta cerrada. Por favor comuniquese con el administrador");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tiene que abrir primero una caja para poder realizar una venta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }

    private void limpiarTabla(JTable tabla) {
        int filas = tabla.getRowCount();
        if (filas != -1) {
            DefaultTableModel defaultTabla = (DefaultTableModel) tabla.getModel();
            for (int i = filas; i >= -1; i--) {
                defaultTabla.removeRow(i);
            }
        }
    }

    private void filtroClientes() {
        int columnaABuscar = 0;
        if ("Nombre de Fantasia".equals(FiltrojComboBox.getSelectedItem().toString())) {
            columnaABuscar = 4;
        }
        if ("Razon Social".equals(FiltrojComboBox.getSelectedItem().toString())) {
            columnaABuscar = 3;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(FiltrojTextField.getText(), columnaABuscar));
    }

    private void buscarProducto(int cantidad) {
        DefaultTableModel tabla = (DefaultTableModel) DetalleVentajTable.getModel();
        Object[] columnas = new Object[3];
        try {
            switch (FiltrojComboBox.getSelectedItem().toString()) {
                case "Codigo de Barra":
                    Producto producto;
                    long codigoBarra = Long.parseLong(FiltrojTextField.getText());
                    if (cantidad == 1) {
                        producto = new Producto().obtenerProductoCodBarra(codigoBarra);
                        if (producto != null) {
                            this.productos.add(producto);
                            columnas[0] = producto.getIdProducto();
                            columnas[1] = producto.getCodigoBarra();
                            columnas[2] = producto.getNombreProducto();
                            double ganancia = (producto.getPrecioUnitario() * producto.getAlicuota()) / 100;
                            double precioVenta = producto.getPrecioUnitario() + ganancia;
                            columnas[3] = precioVenta;
                            tabla.addRow(columnas);
                        }
                    } else if (cantidad > 1) {
                        for (int i = 0; i < cantidad; i++) {
                            producto = new Producto().obtenerProductoCodBarra(codigoBarra);
                            if (producto != null) {
                                this.productos.add(producto);
                                columnas[0] = producto.getIdProducto();
                                columnas[1] = producto.getCodigoBarra();
                                columnas[2] = producto.getNombreProducto();
                                double ganancia = (producto.getPrecioUnitario() * producto.getAlicuota()) / 100;
                                double precioVenta = producto.getPrecioUnitario() + ganancia;
                                columnas[3] = precioVenta;
                                tabla.addRow(columnas);
                            }
                        }
                    }
                    break;
                case "Nombre del Producto":
                    ArrayList<Producto> productos2;
                    productos2 = new Producto().obtenerProductosDescripcion(FiltrojTextField.getText());
                    if (!productos.isEmpty()) {
                        this.productos = productos2;
                        limpiarTabla(DetalleVentajTable);
                        for (int i = 0; i < productos.size(); i++) {
                            columnas[0] = productos.get(i).getCodigoBarra();
                            columnas[1] = productos.get(i).getNombreProducto();
                            double ganancia = (productos.get(i).getPrecioUnitario() * productos.get(i).getAlicuota()) / 100;
                            double precioVenta = productos.get(i).getPrecioUnitario() + ganancia;
                            columnas[2] = precioVenta;
                            columnas[3] = cantidad;
                            tabla.addRow(columnas);
                        }
                    }
            }
            actualizarTotales();
        } catch (Exception e) {
            Logger.getLogger(AltaVenta.class.getName()).log(Level.SEVERE, e.getMessage(), e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void cargarTiposPagos() {
        ArrayList<TipoPago> tipos;
        try {
            tipos = new TipoPago().listarTiposPagos();
            if (!tipos.isEmpty()) {
                bonificaciones = new int[tipos.size()];
                for (int i = 0; i < tipos.size(); i++) {
                    TipoPagojComboBox.addItem(tipos.get(i).getTipoPago());
                    bonificaciones[tipos.get(i).getIdTipoPago()] = tipos.get(i).getBonificacion();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay tipos de pago cargados. Por favor cargue uno");
            }
        } catch (Exception e) {
            Logger.getLogger(AltaVenta.class.getName()).log(Level.SEVERE, e.getMessage(), e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void cargarTablaClientes() {
        ArrayList<Cliente> clientes;
        try {
            clientes = new Cliente().listarClientes();
            if (!clientes.isEmpty()) {
                DefaultTableModel tabla = (DefaultTableModel) ClientesjTable.getModel();
                Object[] columnas = new Object[1];
                for (int i = 0; i < clientes.size(); i++) {
                    columnas[0] = clientes.get(i).getApellidoCliente() + clientes.get(i).getNombreCliente();
                    tabla.addRow(columnas);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No exiten clientes en la base. Por favor cargue uno");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void cargarTipoFactura() {
        ArrayList<Factura> facturas;
        try {
            facturas = new Factura().listarFacturas();
            if (!facturas.isEmpty()) {
                for (int i = 0; i < facturas.size(); i++) {
                    TipoFacturajComboBox.addItem(facturas.get(i).getTipoFactura());
                    PorcIVAjComboBox.addItem(Integer.toString(facturas.get(i).getPorcIVA()));
                    if (facturas.get(i).getTipoFactura().equals("B")) {
                        TipoFacturajComboBox.setSelectedIndex(i);
                        PorcIVAjComboBox.setSelectedIndex(i);
                    }
                }
            }
        } catch (Exception e) {
            Logger.getLogger(AltaVenta.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void actualizarTotales() {
        int filas = DetalleVentajTable.getRowCount();
        if (filas > 0) {
            for (int i = 0; i < filas; i++) {
                double montoProducto = Double.parseDouble(DetalleVentajTable.getValueAt(i, 3).toString());
                montoVenta = montoVenta + montoProducto;
            }
            montoIVA = (montoVenta * Integer.parseInt(PorcIVAjComboBox.getSelectedItem().toString())) / 100;
            montoTotal = montoVenta + montoIVA;
            UnidadesjTextField.setText(Integer.toString(filas));
            TotaljTextField.setText(Double.toString(montoTotal));
        }
    }

    private boolean validar() {
        boolean valido = true;
        if (DetalleVentajTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Debe cargar al menos 1 producto para realizar la venta");
            FiltrojTextField.requestFocus();
            valido = false;
        } else if (TotaljTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ocurrio un erro el total no puede estar vacio");
            TotaljTextField.requestFocus();
            valido = false;
        }
        return valido;
    }

    private boolean descontarStock() {
        int resultado = 0;
        int cantidadProductos = productos.size();
        for (int i = 0; i < cantidadProductos; i++) {
            try {
                Producto producto = new Producto();
                producto.setIdProducto(productos.get(i).getIdProducto());
                producto.setStock(productos.get(i).getStock() - 1);
                if (producto.modificarProducto(producto) != 0) {
                    resultado++;
                    productos.remove(productos.get(i));
                }
            } catch (Exception ex) {
                Logger.getLogger(AltaVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (resultado == cantidadProductos) {
            return true;
        } else {
            return false;
        }
    }

    private void guardarOActualizarVenta() {
        int resultado = 0;
        if (validar()) {
            try {
                Venta venta = new Venta();
                venta.setUsuario(new Usuario().obtenerUsuario(idUsuario));
                venta.setProductos(productos);
                venta.setFactura(new Factura().obtenerFactura(TipoFacturajComboBox.getSelectedItem().toString()));
                if (ClientesjTable.getSelectedRowCount() > 0) {
                    int filaSelec = ClientesjTable.getSelectedRow();
                    String apeynom = ClientesjTable.getValueAt(filaSelec, 0).toString();
                    venta.setCliente(new Cliente().obtenerCliente(apeynom));
                }
                venta.setFechaVenta(new Date());
                venta.setMontoVenta(montoVenta);
                venta.setIvaVenta(montoIVA);
                if (descontarStock()) {
                    if (IDVentajTextField.getText().isEmpty()) {
                        resultado = venta.altaVenta(venta);
                    } else {
                        venta.setIdVenta(Integer.parseInt(IDVentajTextField.getText()));
                        resultado = venta.modificarVenta(venta);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al tratar de descontar el stock de los productos. La venta fue cancelada");
                }
            } catch (Exception ex) {
                Logger.getLogger(AltaVenta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            if (resultado != 0) {
                if (guardarPago(resultado) != 0) {
                    JOptionPane.showMessageDialog(null, "Venta guardada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar el pago");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar la venta");
            }
        }
    }

    private int guardarPago(int idVenta) {
        int resultado = 0;
        Pago pago = new Pago();
        try {
            pago.setVenta(new Venta().obtenerVenta(idVenta));
            pago.setTipoPago(new TipoPago().obtenerTipoPago(TipoFacturajComboBox.getSelectedItem().toString()));
            pago.setMontoPago(Double.parseDouble(TotaljTextField.getText()));
            resultado = pago.altaPago(pago);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
}
