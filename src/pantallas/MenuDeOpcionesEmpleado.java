/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Usuario;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.File;
import java.net.URL;
import java.util.Calendar;
import javax.help.HelpBroker;
import javax.help.HelpSet;

/**
 *
 * @author Pablo el mejor
 */
public class MenuDeOpcionesEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form MenuDeOpcionesEmpleado
     */
    public MenuDeOpcionesEmpleado() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        JBNNuevaVenta.setMnemonic(KeyEvent.VK_V);
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
    }

    public void cerrar() {
        setLocationRelativeTo(null);
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea salir de OSG?", "Saliendo de OSG",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
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
        jToolBar1 = new javax.swing.JToolBar();
        JBProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ComprajButton = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        JBVentas = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        JBClientes = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        JBProveedores = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        JBCaja = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        JBOtrosAccesos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnExit = new javax.swing.JButton();
        JBNNuevaVenta = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreUsuariojLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FechajLabel = new javax.swing.JLabel();
        UsuarioIDjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("OSG - Otro Sistema de Gestión");
        setAutoRequestFocus(false);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setOpaque(false);

        JBProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productos25.png"))); // NOI18N
        JBProductos.setText("Productos");
        JBProductos.setFocusable(false);
        JBProductos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProductosActionPerformed(evt);
            }
        });
        jToolBar1.add(JBProductos);
        jToolBar1.add(jSeparator1);

        ComprajButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComprajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comprasin30.png"))); // NOI18N
        ComprajButton.setText("Compras");
        ComprajButton.setFocusable(false);
        ComprajButton.setHideActionText(true);
        ComprajButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ComprajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprajButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(ComprajButton);
        jToolBar1.add(jSeparator4);

        JBVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comprasout30.png"))); // NOI18N
        JBVentas.setText("Ventas");
        JBVentas.setFocusable(false);
        JBVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVentasActionPerformed(evt);
            }
        });
        jToolBar1.add(JBVentas);
        jToolBar1.add(jSeparator6);

        JBClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes30.png"))); // NOI18N
        JBClientes.setText("Clientes");
        JBClientes.setFocusable(false);
        JBClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(JBClientes);
        jToolBar1.add(jSeparator2);

        JBProveedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proveedor30.png"))); // NOI18N
        JBProveedores.setText("Proveedores");
        JBProveedores.setFocusable(false);
        JBProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProveedoresActionPerformed(evt);
            }
        });
        jToolBar1.add(JBProveedores);
        jToolBar1.add(jSeparator3);

        JBCaja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caja30.png"))); // NOI18N
        JBCaja.setText("Caja");
        JBCaja.setFocusable(false);
        JBCaja.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCajaActionPerformed(evt);
            }
        });
        jToolBar1.add(JBCaja);
        jToolBar1.add(jSeparator5);

        JBOtrosAccesos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBOtrosAccesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/config25.png"))); // NOI18N
        JBOtrosAccesos.setText("Otros accesos");
        JBOtrosAccesos.setFocusable(false);
        JBOtrosAccesos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBOtrosAccesos.setPreferredSize(new java.awt.Dimension(31, 31));
        JBOtrosAccesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBOtrosAccesosActionPerformed(evt);
            }
        });
        jToolBar1.add(JBOtrosAccesos);

        jScrollPane1.setOpaque(false);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setFocusTraversalPolicyProvider(true);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jTabbedPane1);

        btnExit.setText("Cerrar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        JBNNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBNNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cash35.png"))); // NOI18N
        JBNNuevaVenta.setText("VENTA");
        JBNNuevaVenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JBNNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNNuevaVentaActionPerformed(evt);
            }
        });

        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario: ");

        NombreUsuariojLabel.setText("jLabel2");

        jLabel3.setText("Ultimo Ingreso:");

        FechajLabel.setText("jLabel4");

        UsuarioIDjLabel.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBNNuevaVenta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAyuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreUsuariojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsuarioIDjLabel)
                        .addGap(171, 171, 171)
                        .addComponent(btnExit))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBNNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnAyuda)
                    .addComponent(jLabel1)
                    .addComponent(NombreUsuariojLabel)
                    .addComponent(jLabel3)
                    .addComponent(FechajLabel)
                    .addComponent(UsuarioIDjLabel))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProductosActionPerformed
        MenuDeGestionDeProductos gestionproducto = new MenuDeGestionDeProductos();
        if (señalProd == 0) {
            jTabbedPane1.addTab("Gestión de productos", gestionproducto.getContentPane());
            señalProd = 1;
        }

    }//GEN-LAST:event_JBProductosActionPerformed

    private void JBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientesActionPerformed
        MenuGestionCliente gestioncliente = new MenuGestionCliente();
        if (señalClie == 0) {
            jTabbedPane1.addTab("Gestión de clientes", gestioncliente.getContentPane());
            señalClie = 1;
        }
    }//GEN-LAST:event_JBClientesActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            String nomTab = jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex());
            switch (nomTab) {
                case "Gestión de clientes":
                    señalClie = 0;
                    break;
                case "Gestión proveedores":
                    señalProv = 0;
                    break;
                case "Gestión de productos":
                    señalProd = 0;
                    break;
                case "Gestion Compras":
                    señalCompra = 0;
                    break;
                case "Otros accesos":
                    señalOac = 0;
                    break;
                case "Caja":
                    señalOpDia = 0;
                    break;
                case "Nueva venta":
                    señalVenta = 0;
                    break;
                default:
                    break;
            }
            jTabbedPane1.removeTabAt(jTabbedPane1.getSelectedIndex());
        } catch (ArrayIndexOutOfBoundsException e) {
            cerrar();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void JBCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCajaActionPerformed
        // TODO add your handling code here:
        MenuDeOperacionesDiarias menuopdiarias = new MenuDeOperacionesDiarias();

        if (señalOpDia == 0) {
            jTabbedPane1.addTab("Caja", menuopdiarias.getContentPane());
            señalOpDia = 1;
        }
    }//GEN-LAST:event_JBCajaActionPerformed

    private void JBNNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNNuevaVentaActionPerformed
        VentaEmpleado nuevaventa = new VentaEmpleado();
        if (señalVenta == 0) {
            jTabbedPane1.addTab("Nueva venta", nuevaventa.getContentPane());
            señalVenta = 1;
        }
    }//GEN-LAST:event_JBNNuevaVentaActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        ponLaAyuda();

    }//GEN-LAST:event_btnAyudaActionPerformed

    private void ponLaAyuda() {
        try {
            // Carga el fichero de ayuda
            File fichero = new File("help/help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            // principal y secundaria.
            hb.enableHelpOnButton(btnAyuda, "aplicacion", helpset);
            hb.enableHelpKey(getRootPane(), "", helpset);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void JBOtrosAccesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBOtrosAccesosActionPerformed
        Config config = new Config();

        if (señalOac == 0) {
            jTabbedPane1.addTab("Otros accesos", config.getContentPane());
            señalOac = 1;
        }
    }//GEN-LAST:event_JBOtrosAccesosActionPerformed

    private void JBProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProveedoresActionPerformed
        MenuGestionProveedor gestProv = new MenuGestionProveedor();
        if (señalProv == 0) {
            jTabbedPane1.addTab("Gestion de proveedores", gestProv.getContentPane());
            señalProv = 1;
        }
    }//GEN-LAST:event_JBProveedoresActionPerformed

    private void ComprajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprajButtonActionPerformed
        // TODO add your handling code here:
        GestionDeCompras gesComp = new GestionDeCompras();
        gesComp.idUsuario = Integer.parseInt(UsuarioIDjLabel.getText());
        if (señalCompra == 0) {
            jTabbedPane1.addTab("Gestion Compra", gesComp.getContentPane());
        }
    }//GEN-LAST:event_ComprajButtonActionPerformed

    private void JBVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBVentasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDeOpcionesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDeOpcionesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDeOpcionesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDeOpcionesEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDeOpcionesEmpleado().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton ComprajButton;
    javax.swing.JLabel FechajLabel;
    javax.swing.JButton JBCaja;
    javax.swing.JButton JBClientes;
    javax.swing.JButton JBNNuevaVenta;
    javax.swing.JButton JBOtrosAccesos;
    javax.swing.JButton JBProductos;
    javax.swing.JButton JBProveedores;
    javax.swing.JButton JBVentas;
    javax.swing.JLabel NombreUsuariojLabel;
    javax.swing.JLabel UsuarioIDjLabel;
    javax.swing.JButton btnAyuda;
    javax.swing.JButton btnExit;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel3;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JToolBar.Separator jSeparator1;
    javax.swing.JToolBar.Separator jSeparator2;
    javax.swing.JToolBar.Separator jSeparator3;
    javax.swing.JToolBar.Separator jSeparator4;
    javax.swing.JToolBar.Separator jSeparator5;
    javax.swing.JToolBar.Separator jSeparator6;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    private int señalProd = 0;
    private int señalClie = 0;
    private int señalOac = 0;
    private int señalOpDia = 0;
    private int señalVenta = 0;
    private int señalCompra = 0;
    private int señalProv = 0;

    Calendar Cal = Calendar.getInstance();
    String fec = Cal.get(Cal.DATE) + "/" + (Cal.get(Cal.MONTH) + 1) + "/" + Cal.get(Cal.YEAR
    ) + " " + Cal.get(Cal.HOUR_OF_DAY) + ":" + Cal.get(Cal.MINUTE) + ":" + Cal.get(Cal.SECOND);

}
