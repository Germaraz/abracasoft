/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Producto;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Interleaved25;
import gestores.Logs;
import java.io.FileWriter;
import java.util.Calendar;

/**
 *
 * @author German
 */
public class AltaProducto extends javax.swing.JFrame {
    
    private int bandera = 0;

    /**
     * Creates new form AltaProducto
     */
    public AltaProducto() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        setLocationRelativeTo(null);
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
        CodigoProductoJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        StockProdjTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        NombreProdJTextField = new javax.swing.JTextField();
        ImprimirCodBarrajButton = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        PrecioUniProdjTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        GuardajButton = new javax.swing.JButton();
        CancelajButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DescripcionProductojTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        AlicuotaProdjTextField = new javax.swing.JTextField();
        IDProductojTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FecVencjDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar un nuevo producto");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código de barra");

        CodigoProductoJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CodigoProductoJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodigoProductoJTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Stock ");

        StockProdjTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StockProdjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StockProdjTextFieldKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Nombre");

        NombreProdJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NombreProdJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreProdJTextFieldFocusLost(evt);
            }
        });

        ImprimirCodBarrajButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ImprimirCodBarrajButton.setText("Imprimir codigo de barra");
        ImprimirCodBarrajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirCodBarrajButtonActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Precio unitario");

        PrecioUniProdjTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PrecioUniProdjTextField.setText("0.00");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("% de ganancia");

        jLabel35.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel35.setText("No Incluir el IVA, el mismo será calculado en la venta");

        GuardajButton.setText("Guardar");
        GuardajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardajButtonActionPerformed(evt);
            }
        });

        CancelajButton.setText("Cancelar");
        CancelajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelajButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Descripcion");

        DescripcionProductojTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        IDProductojTextField.setVisible(false);
        IDProductojTextField.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Fecha de vencimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GuardajButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelajButton)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350)
                        .addComponent(ImprimirCodBarrajButton, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CodigoProductoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(IDProductojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NombreProdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescripcionProductojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)
                                        .addComponent(PrecioUniProdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel30)
                                        .addGap(18, 18, 18)
                                        .addComponent(AlicuotaProdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(StockProdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FecVencjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodigoProductoJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreProdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(IDProductojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(ImprimirCodBarrajButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescripcionProductojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioUniProdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30)
                    .addComponent(AlicuotaProdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StockProdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FecVencjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelajButton)
                    .addComponent(GuardajButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescProdJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescProdJTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_DescProdJTextFieldKeyTyped

    private void DescProdJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescProdJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_DescProdJTextFieldFocusLost

    private void CancelajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelajButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelajButtonActionPerformed

    private void GuardajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardajButtonActionPerformed
        if (validar()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Agregar este producto");
            if (respuesta == JOptionPane.YES_OPTION) {
                guardarOActualizarProducto();
                this.dispose();
            }
        }
    }//GEN-LAST:event_GuardajButtonActionPerformed

    private void PrecioUnitJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioUnitJTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioUnitJTextFieldKeyTyped

    private void PrecioUnitJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PrecioUnitJTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioUnitJTextFieldFocusLost

    private void ImprimirCodBarrajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirCodBarrajButtonActionPerformed
        TestBarCode();
        setLocationRelativeTo(null);
        Object[] opciones = {"Aceptar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "Codigo de barra guardado", "",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {;
        } else {
        }
    }//GEN-LAST:event_ImprimirCodBarrajButtonActionPerformed

    private void StockjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StockjTextFieldKeyTyped

    }//GEN-LAST:event_StockjTextFieldKeyTyped

    private void CodigoProductoJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoProductoJTextFieldKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_CodigoProductoJTextFieldKeyTyped

    private void StockProdjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StockProdjTextFieldKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_StockProdjTextFieldKeyTyped

    private void NombreProdJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreProdJTextFieldFocusLost
        // TODO add your handling code here:
        DescripcionProductojTextField.setText(NombreProdJTextField.getText());
    }//GEN-LAST:event_NombreProdJTextFieldFocusLost
    
    private void TestBarCode() {
        
        JBarcodeBean barcode = new JBarcodeBean();

        // nuestro tipo de codigo de barra
        barcode.setCodeType(new Interleaved25());
        //barcode.setCodeType(new Code39());

        // nuestro valor a codificar y algunas configuraciones mas
        barcode.setCode(CodigoProductoJTextField.getText());
        barcode.setCheckDigit(true);
        
        BufferedImage bufferedImage = barcode.draw(new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB));

        // guardar en disco como png
        String nombre;
        if (NombreProdJTextField.getText() == "") {
            nombre = "forro";
        } else {
            nombre = NombreProdJTextField.getText();
        }
        File file = new File("codigoBarra_" + nombre + ".png");
        try {
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(AltaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField AlicuotaProdjTextField;
    private javax.swing.JButton CancelajButton;
    protected javax.swing.JTextField CodigoProductoJTextField;
    protected javax.swing.JTextField DescripcionProductojTextField;
    private com.toedter.calendar.JDateChooser FecVencjDateChooser;
    private javax.swing.JButton GuardajButton;
    protected javax.swing.JTextField IDProductojTextField;
    private javax.swing.JButton ImprimirCodBarrajButton;
    protected javax.swing.JTextField NombreProdJTextField;
    protected javax.swing.JTextField PrecioUniProdjTextField;
    protected javax.swing.JTextField StockProdjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private boolean validar() {
        boolean valido = true;
        if (CodigoProductoJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el codigo de barra del producto");
            CodigoProductoJTextField.requestFocus();
            valido = false;
        } else if (NombreProdJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre del producto");
            NombreProdJTextField.requestFocus();
            valido = false;
        } else if (DescripcionProductojTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la descripción del producto");
            DescripcionProductojTextField.requestFocus();
            valido = false;
        } else if (PrecioUniProdjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el precio unitario del producto");
            PrecioUniProdjTextField.requestFocus();
            valido = false;
        } else if (AlicuotaProdjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el porcentaje de ganancia del producto");
            AlicuotaProdjTextField.requestFocus();
            valido = false;
        } else if (StockProdjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el stock del producto");
            StockProdjTextField.requestFocus();
            valido = false;
        } else if (FecVencjDateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la fecha de vencimiento del producto");
            FecVencjDateChooser.requestFocus();
            valido = false;
            return valido;
        }
        return valido;
    }
    
    private void guardarOActualizarProducto() {
        try {
            Logs log = new Logs();
            log.crearLog("ha creado/actualizado un producto");
        } catch (IOException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        int resultado;
        Producto producto = new Producto();
        try {
            producto.setCodigoBarra(Long.parseLong(CodigoProductoJTextField.getText()));
            producto.setNombreProducto(NombreProdJTextField.getText());
            producto.setDescripcionProducto(DescripcionProductojTextField.getText());
            producto.setPrecioUnitario(Double.parseDouble(PrecioUniProdjTextField.getText()));
            producto.setAlicuota(Integer.parseInt(AlicuotaProdjTextField.getText()));
            producto.setStock(Integer.parseInt(StockProdjTextField.getText()));
            producto.setFechaVencimientoProducto(FecVencjDateChooser.getDate());
            if (IDProductojTextField.getText().isEmpty()) {
                resultado = producto.altaProducto(producto);
            } else {
                resultado = producto.modificarProducto(producto);
            }
            if (resultado != 0) {
                JOptionPane.showMessageDialog(null, "Producto ingresado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar el producto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
