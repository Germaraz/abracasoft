/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pantallas;

import com.toedter.calendar.JDateChooser;
import entidades.Presupuesto;
import gestores.GestorCliente;
import gestores.GestorPresupuesto;
import gestores.GestorProducto;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static javax.xml.bind.DatatypeConverter.parseDate;

/**
 *
 * @author German
 */
public class GestionPresupuesto extends javax.swing.JFrame {

    /**
     * Creates new form GestionPresupuesto
     */
    public GestionPresupuesto() {
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

        SPpresupuesto = new javax.swing.JScrollPane();
        Tpresupuesto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFpresupuestoCodigo = new javax.swing.JTextField();
        BpresupuestoNuevo = new javax.swing.JButton();
        BpresupuestoEditar = new javax.swing.JButton();
        BpresupuestoEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BpresupuestoBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        SPpresupuestoArticulos = new javax.swing.JScrollPane();
        TpresupuestoArticulos = new javax.swing.JTable();
        CSpresupuestoRangoDesde = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        CSpresupuestoRangoHasta = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion de presupuestos");

        Tpresupuesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tpresupuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Vendedor", "Código venta", "Válido hasta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tpresupuesto.setColumnSelectionAllowed(true);
        Tpresupuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tpresupuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TpresupuestoMouseClicked(evt);
            }
        });
        Tpresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TpresupuestoKeyReleased(evt);
            }
        });
        SPpresupuesto.setViewportView(Tpresupuesto);
        Tpresupuesto.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (Tpresupuesto.getColumnModel().getColumnCount() > 0) {
            Tpresupuesto.getColumnModel().getColumn(0).setMinWidth(70);
            Tpresupuesto.getColumnModel().getColumn(0).setPreferredWidth(80);
            Tpresupuesto.getColumnModel().getColumn(0).setMaxWidth(90);
            Tpresupuesto.getColumnModel().getColumn(2).setMinWidth(70);
            Tpresupuesto.getColumnModel().getColumn(2).setPreferredWidth(80);
            Tpresupuesto.getColumnModel().getColumn(2).setMaxWidth(90);
            Tpresupuesto.getColumnModel().getColumn(3).setMinWidth(80);
            Tpresupuesto.getColumnModel().getColumn(3).setPreferredWidth(90);
            Tpresupuesto.getColumnModel().getColumn(3).setMaxWidth(100);
            Tpresupuesto.getColumnModel().getColumn(4).setMinWidth(90);
            Tpresupuesto.getColumnModel().getColumn(4).setPreferredWidth(100);
            Tpresupuesto.getColumnModel().getColumn(4).setMaxWidth(110);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Rango");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Código");

        TFpresupuestoCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFpresupuestoCodigoMouseClicked(evt);
            }
        });
        TFpresupuestoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFpresupuestoCodigoKeyTyped(evt);
            }
        });

        BpresupuestoNuevo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BpresupuestoNuevo.setText("+");
        BpresupuestoNuevo.setMaximumSize(new java.awt.Dimension(41, 41));
        BpresupuestoNuevo.setMinimumSize(new java.awt.Dimension(41, 41));
        BpresupuestoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpresupuestoNuevoActionPerformed(evt);
            }
        });

        BpresupuestoEditar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BpresupuestoEditar.setText("/");
        BpresupuestoEditar.setMaximumSize(new java.awt.Dimension(41, 41));
        BpresupuestoEditar.setMinimumSize(new java.awt.Dimension(41, 41));
        BpresupuestoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpresupuestoEditarActionPerformed(evt);
            }
        });

        BpresupuestoEliminar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BpresupuestoEliminar.setText("-");
        BpresupuestoEliminar.setMaximumSize(new java.awt.Dimension(41, 41));
        BpresupuestoEliminar.setMinimumSize(new java.awt.Dimension(41, 41));
        BpresupuestoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpresupuestoEliminarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("?");
        jButton1.setMaximumSize(new java.awt.Dimension(41, 41));
        jButton1.setMinimumSize(new java.awt.Dimension(41, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BpresupuestoBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BpresupuestoBuscar.setText("Buscar");
        BpresupuestoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpresupuestoBuscarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        TpresupuestoArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Cantidad", "Subtotal"
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
        SPpresupuestoArticulos.setViewportView(TpresupuestoArticulos);

        CSpresupuestoRangoDesde.setMinSelectableDate(new java.util.Date(-62135755134000L));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("desde");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("hasta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BpresupuestoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BpresupuestoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BpresupuestoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SPpresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SPpresupuestoArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFpresupuestoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CSpresupuestoRangoDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CSpresupuestoRangoHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(BpresupuestoBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BpresupuestoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BpresupuestoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BpresupuestoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(TFpresupuestoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(CSpresupuestoRangoDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(CSpresupuestoRangoHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(SPpresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(BpresupuestoBuscar))))
                    .addComponent(SPpresupuestoArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFpresupuestoCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFpresupuestoCodigoMouseClicked
        // TODO add your handling code here:
        TFpresupuestoCodigo.setBackground(Color.white);
    }//GEN-LAST:event_TFpresupuestoCodigoMouseClicked

    private void TFpresupuestoCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFpresupuestoCodigoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_TFpresupuestoCodigoKeyTyped

    private void BpresupuestoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpresupuestoNuevoActionPerformed
        // TODO add your handling code here:
        new AltaPresupuesto().setVisible(true);
    }//GEN-LAST:event_BpresupuestoNuevoActionPerformed

    private void BpresupuestoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpresupuestoEditarActionPerformed
        //modificarPresupuesto();
        abrirPresupuesto();
    }//GEN-LAST:event_BpresupuestoEditarActionPerformed

    private void BpresupuestoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpresupuestoBuscarActionPerformed
        busqueda();
    }//GEN-LAST:event_BpresupuestoBuscarActionPerformed

    private void TpresupuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TpresupuestoKeyReleased
        presupuestoProducto();        // TODO add your handling code here:
    }//GEN-LAST:event_TpresupuestoKeyReleased

    private void TpresupuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TpresupuestoMouseClicked
        presupuestoProducto();
    }//GEN-LAST:event_TpresupuestoMouseClicked

    private void BpresupuestoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpresupuestoEliminarActionPerformed
        eliminarPresupuesto();
    }//GEN-LAST:event_BpresupuestoEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        abrirAyuda();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPresupuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BpresupuestoBuscar;
    private javax.swing.JButton BpresupuestoEditar;
    private javax.swing.JButton BpresupuestoEliminar;
    private javax.swing.JButton BpresupuestoNuevo;
    private com.toedter.calendar.JDateChooser CSpresupuestoRangoDesde;
    private com.toedter.calendar.JDateChooser CSpresupuestoRangoHasta;
    private javax.swing.JScrollPane SPpresupuesto;
    private javax.swing.JScrollPane SPpresupuestoArticulos;
    private javax.swing.JTextField TFpresupuestoCodigo;
    private javax.swing.JTable Tpresupuesto;
    private javax.swing.JTable TpresupuestoArticulos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void borrarRenglones(int jpanel) {
        int a;
        DefaultTableModel tabla;
        if (jpanel == 1){
            tabla = (DefaultTableModel) Tpresupuesto.getModel();
            a = Tpresupuesto.getRowCount() - 1;
        }else{
            tabla = (DefaultTableModel) TpresupuestoArticulos.getModel();
            a = TpresupuestoArticulos.getRowCount() - 1;
        }
        for (int i = a; i >= 0; i--) {
            tabla.removeRow(i); //se van borrando para que solo muestre el producto que se buscó
        }
    }
    
    private void buscarPorFecha() {
        String fechaDesde = "";
        String fechaHasta = "";
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fechaDesde = formato.format(CSpresupuestoRangoDesde.getDate()); 
            fechaHasta = formato.format(CSpresupuestoRangoHasta.getDate());
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null,"Seleccione el rango de fecha a buscar");
        }
        
        if (fechaDesde != "" && fechaHasta != ""){
            agregarProductoATabla(gestores.GestorPresupuesto.buscarPresupuesto(fechaDesde, fechaHasta));
        }
        
    }
    
    private void buscarPorCodigo() {
        int codigo = 0;
        
        try {
            codigo = parseInt(TFpresupuestoCodigo.getText());
        }catch (NumberFormatException e){
            System.out.println("No se puede convertir el codigo de barra");
        }

        if (codigo!=0){
            agregarProductoATabla(gestores.GestorPresupuesto.buscarPresupuesto(codigo));
        }

    }

    private void agregarProductoATabla(ArrayList<Presupuesto> buscarPorFecha) {
        DefaultTableModel tabla = (DefaultTableModel) Tpresupuesto.getModel();
        for (int i = 0; i < buscarPorFecha.size(); i++) {
            String nombreCliente = "";
            try{
                nombreCliente = GestorCliente.ConsultaPorDescripcion(buscarPorFecha.get(i).getIdCliente()).get(0).getNombreCliente();
            }catch (IndexOutOfBoundsException e){
                nombreCliente = valueOf(buscarPorFecha.get(i).getIdCliente());
            }
            
            if (nombreCliente.equalsIgnoreCase("0")){
                nombreCliente = "-";
            }
            
            Object[] fila = { buscarPorFecha.get(i).getIdPresupuesto(),
                nombreCliente,
                buscarPorFecha.get(i).getIdVendedor(),
                buscarPorFecha.get(i).getRelVenta(),
                buscarPorFecha.get(i).getVigenciaDePresupuesto()
            };
            tabla.addRow(fila);
        }
    }  

    private void presupuestoProducto() {
        if(Tpresupuesto.getSelectedRows().length > 0 ) {
            int valorCelda = 0;
            try{
                valorCelda = parseInt(Tpresupuesto.getValueAt(Tpresupuesto.getSelectedRow(),0).toString());
            }catch (NumberFormatException e){ 
            }
            borrarRenglones(2);
            if(valorCelda != 0){
                DefaultTableModel tarticulos = (DefaultTableModel) TpresupuestoArticulos.getModel();
                for (int i = 0; i < GestorProducto.presupuestoProducto(valorCelda).size(); i++) {
                    tarticulos.addRow((Object[]) GestorProducto.presupuestoProducto(valorCelda).get(i));
                }  
            }
         }
    }

    private void eliminarPresupuesto() {
        //¿Será conveniente que también borre el listado de "Productos relacionado con el Presupuesto"?
        
        if(Tpresupuesto.getSelectedRows().length > 0 ) {
            int valorCelda = 0;
            try{
                valorCelda = parseInt(Tpresupuesto.getValueAt(Tpresupuesto.getSelectedRow(),0).toString());
            }catch (NumberFormatException e){
                System.out.println("no se pudo determinar el codigo del presupuesto");
            }
            if(valorCelda != 0){
                DefaultTableModel tpresupuesto = (DefaultTableModel) Tpresupuesto.getModel();
                int confirmado = JOptionPane.showConfirmDialog(BpresupuestoEliminar, 
                    "¿Confirma que desea borrar el presupuesto: " + 
                    Tpresupuesto.getValueAt(Tpresupuesto.getSelectedRow(),0).toString() + " ?");

                if (JOptionPane.OK_OPTION == confirmado){
                    if (GestorPresupuesto.eliminarPresupuesto(valorCelda)==true){
                        JOptionPane.showMessageDialog(null, "El presupuesto fue eliminado");
                        borrarRenglones(1);
                        busqueda();
                    }else{
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el presupuesto");
                    }
                }else{
                   System.out.println("no se elimino nada");
                }
            }
         }
        
    }

    private void busqueda() {
        String validador = "";
        borrarRenglones(1);
        try {
            validador = CSpresupuestoRangoDesde.getDate().toString() + CSpresupuestoRangoHasta.getDate().toString();
        }catch (NullPointerException e){
            System.out.println("fechas vacias");
        }
        
        if (validador == ""){
            buscarPorCodigo();
        }else{
            buscarPorFecha();
        }
    }
    
    private void abrirAyuda(){
        try {
            //File file = new File(System.getProperty("user.dir") + "\\src\\ayuda\\Manual_Gestion_Presupuesto.pdf");
            //Desktop.getDesktop().open(file);
            
            if (Desktop.isDesktopSupported()) {
            File file = new File("Ayuda_Gestion_Presupuesto.pdf");
            if (!file.exists()) {
                InputStream inputStream = ClassLoader.getSystemClassLoader()
                                    .getResourceAsStream("ayuda/Ayuda_Gestion_Presupuesto.pdf");
                OutputStream outputStream = new FileOutputStream(file);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
                outputStream.close();
                inputStream.close();
            }
            Desktop.getDesktop().open(file);
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "No se puedo abrir el archivo de ayuda");
        }
    }

    private void modificarPresupuesto() {
        if(Tpresupuesto.getSelectedRows().length > 0 ) {
            int valorCelda = 0;
            try{
                valorCelda = parseInt(Tpresupuesto.getValueAt(Tpresupuesto.getSelectedRow(),0).toString());
            }catch (NumberFormatException e){
                System.out.println("no se pudo determinar el codigo presupuesto");
            }
            if(valorCelda != 0){
                DefaultTableModel dtmPresupuesto = (DefaultTableModel) Tpresupuesto.getModel();
                int confirmado = JOptionPane.showConfirmDialog(BpresupuestoEditar, 
                    "¿Confirma que desea modificar el presupuesto seleccionado?");

                if (JOptionPane.OK_OPTION == confirmado){

                      try{
                        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                        String nuevaVigencia = Tpresupuesto.getValueAt(Tpresupuesto.getSelectedRow(),4).toString();
                        Date fecha = formatoDelTexto.parse(nuevaVigencia);
                        
                        if (GestorPresupuesto.modificarPresupuesto(nuevaVigencia, valorCelda)==true){
                            JOptionPane.showMessageDialog(null, "El presupuesto fue modificado");
                        }else{
                            JOptionPane.showMessageDialog(null, "No se pudo modificar el presupuesto");
                        }
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Los campos no pueden ser nulos");
                    }catch (ParseException e) {
                        JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida");
                    }
                      
                      
                }else{
                   System.out.println("no se modifico nada");
                }
            }
         }
    }

    private void abrirPresupuesto() {
        AltaPresupuesto apa = new AltaPresupuesto();
        apa.cargarPresupuesto(GestorPresupuesto.buscarPresupuesto(parseInt(Tpresupuesto.getValueAt(Tpresupuesto.getSelectedRow(),0).toString())).get(0));
        apa.setVisible(true);
    }
}
