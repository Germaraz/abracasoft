/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import gestores.Logs;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;

/**
 *
 * @author Pablo el mejor
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuDeOpcionesEmpleado
     */
    public VentanaPrincipal() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        JBNNuevaVenta.setMnemonic(KeyEvent.VK_V);
        BackupjButton.setMnemonic(KeyEvent.VK_F10);
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
    }

    public void cerrar() {
        try {
            Logs log = new Logs();
            log.user = NombreUsuariojLabel.getText();
            log.crearLog("ha cerrado sesion");
        } catch (IOException ex) {
            Logger.getLogger(AltaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        UsuarioIDjLabel = new javax.swing.JLabel();
        servidorjLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        BackupjButton = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        JBProductos = new javax.swing.JButton();
        JBCompras = new javax.swing.JButton();
        JBVentas = new javax.swing.JButton();
        JBClientes = new javax.swing.JButton();
        JBProveedores = new javax.swing.JButton();
        JBCajas = new javax.swing.JButton();
        JBInformes = new javax.swing.JButton();
        JBUsuarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnExit = new javax.swing.JButton();
        JBNNuevaVenta = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreUsuariojLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FechajLabel = new javax.swing.JLabel();

        servidorjLabel.setText("jLabel2");
        servidorjLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("OSG - Otro Sistema de Gestión");
        setAutoRequestFocus(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        BackupjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupjButtonActionPerformed(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setOpaque(false);

        JBProductos.setVisible(false);
        JBProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productos25.png"))); // NOI18N
        JBProductos.setText("Productos |");
        JBProductos.setFocusable(false);
        JBProductos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProductosActionPerformed(evt);
            }
        });
        jToolBar1.add(JBProductos);

        JBCompras.setVisible(false);
        JBCompras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comprasin30.png"))); // NOI18N
        JBCompras.setText("Compras |");
        JBCompras.setFocusable(false);
        JBCompras.setHideActionText(true);
        JBCompras.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBComprasActionPerformed(evt);
            }
        });
        jToolBar1.add(JBCompras);

        JBVentas.setVisible(false);
        JBVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/comprasout30.png"))); // NOI18N
        JBVentas.setText("Ventas |");
        JBVentas.setFocusable(false);
        JBVentas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVentasActionPerformed(evt);
            }
        });
        jToolBar1.add(JBVentas);

        JBClientes.setVisible(false);
        JBClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente30.png"))); // NOI18N
        JBClientes.setText("Clientes |");
        JBClientes.setFocusable(false);
        JBClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(JBClientes);

        JBProveedores.setVisible(false);
        JBProveedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proveedor35.png"))); // NOI18N
        JBProveedores.setText("Proveedores |");
        JBProveedores.setFocusable(false);
        JBProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProveedoresActionPerformed(evt);
            }
        });
        jToolBar1.add(JBProveedores);

        JBCajas.setVisible(false);
        JBCajas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBCajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/caja30.png"))); // NOI18N
        JBCajas.setText("Caja |");
        JBCajas.setFocusable(false);
        JBCajas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBCajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCajasActionPerformed(evt);
            }
        });
        jToolBar1.add(JBCajas);

        JBInformes.setVisible(false);
        JBInformes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informes30.png"))); // NOI18N
        JBInformes.setText("Informes |");
        JBInformes.setFocusable(false);
        JBInformes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBInformes.setPreferredSize(new java.awt.Dimension(31, 31));
        JBInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBInformesActionPerformed(evt);
            }
        });
        jToolBar1.add(JBInformes);

        JBUsuarios.setVisible(false);
        JBUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario30.png"))); // NOI18N
        JBUsuarios.setText("Usuarios");
        JBUsuarios.setFocusable(false);
        JBUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        JBUsuarios.setPreferredSize(new java.awt.Dimension(31, 31));
        JBUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuariosActionPerformed(evt);
            }
        });
        jToolBar1.add(JBUsuarios);

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

        JBNNuevaVenta.setVisible(false);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user20.png"))); // NOI18N
        jLabel1.setText("Usuario: ");

        NombreUsuariojLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NombreUsuariojLabel.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Ultimo ingreso:");

        FechajLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FechajLabel.setText(fec);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBNNuevaVenta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAyuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BackupjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreUsuariojLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBNNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackupjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExit)
                        .addComponent(btnAyuda)
                        .addComponent(jLabel1)
                        .addComponent(NombreUsuariojLabel)
                        .addComponent(jLabel3)
                        .addComponent(FechajLabel)))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProductosActionPerformed
        GestionDeProductos gestionproducto = new GestionDeProductos();
        if (señalProd == 0) {
            gestionproducto.nombreUsuario = NombreUsuariojLabel.getText();
            jTabbedPane1.addTab("Gestión de productos", gestionproducto.getContentPane());
            señalProd = 1;
        }
    }//GEN-LAST:event_JBProductosActionPerformed

    private void JBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientesActionPerformed
        GestionDeCliente gestioncliente = new GestionDeCliente();
        if (señalClie == 0) {
            gestioncliente.nombreUsuario = NombreUsuariojLabel.getText();
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
                case "Gestión de compras":
                    señalCompra = 0;
                    break;
                case "Gestión de ventas":
                    señalVenta = 0;
                    break;
                case "Informes":
                    señalOac = 0;
                    break;
                case "Gestión de caja":
                    señalOpDia = 0;
                    break;
                case "Nueva venta":
                    señalVenta = 0;
                    break;
                case "Gestión de usuarios":
                    señalUsu = 0;
                    break;
                default:
                    break;
            }
            jTabbedPane1.removeTabAt(jTabbedPane1.getSelectedIndex());
        } catch (ArrayIndexOutOfBoundsException e) {
            cerrar();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void JBCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCajasActionPerformed
        // TODO add your handling code here:
        GestionDeCaja gesCaja = new GestionDeCaja();
        if (!UsuarioIDjLabel.getText().isEmpty()) {
            gesCaja.idusuario = Integer.parseInt(UsuarioIDjLabel.getText());
            gesCaja.nombreUsuario = NombreUsuariojLabel.getText();
            if (señalOpDia == 0) {
                gesCaja.validarCajaAbierta();
                gesCaja.importeDeCajaEnVivo();
                jTabbedPane1.addTab("Gestión de caja", gesCaja.getContentPane());
                señalOpDia = 1;
            }
        }
    }//GEN-LAST:event_JBCajasActionPerformed

    private void JBNNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNNuevaVentaActionPerformed
        AltaVenta nuevaVenta = new AltaVenta();
        if (señalVenta == 0) {
            nuevaVenta.idUsuario = Integer.parseInt(UsuarioIDjLabel.getText());
            nuevaVenta.nombreUsuario = NombreUsuariojLabel.getText();
            if (nuevaVenta.validarCajaAbierta()) {
                nuevaVenta.cargarTiposPagos();
                nuevaVenta.cargarTipoFactura();
                nuevaVenta.cargarTablaClientes();
                jTabbedPane1.addTab("Nueva venta", nuevaVenta.getContentPane());
                señalVenta = 1;
            }
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

    private void JBInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBInformesActionPerformed
        GestionDeInformes config = new GestionDeInformes();
        if (señalOac == 0) {
            jTabbedPane1.addTab("Informes", config.getContentPane());
            señalOac = 1;
        }
    }//GEN-LAST:event_JBInformesActionPerformed

    private void JBProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProveedoresActionPerformed
        GestionDeProveedores gestProv = new GestionDeProveedores();
        if (señalProv == 0) {
            gestProv.nombreUsuario = NombreUsuariojLabel.getText();
            jTabbedPane1.addTab("Gestión de proveedores", gestProv.getContentPane());
            señalProv = 1;
        }
    }//GEN-LAST:event_JBProveedoresActionPerformed

    private void JBComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBComprasActionPerformed
        // TODO add your handling code here:
        GestionDeCompras gesComp = new GestionDeCompras();
        if (!UsuarioIDjLabel.getText().isEmpty()) {
            gesComp.idUsuario = Integer.parseInt(UsuarioIDjLabel.getText());
            gesComp.nombreUsuario = NombreUsuariojLabel.getText();
            if (señalCompra == 0) {
                jTabbedPane1.addTab("Gestión de compras", gesComp.getContentPane());
                señalCompra = 1;
            }
        }

    }//GEN-LAST:event_JBComprasActionPerformed

    private void JBVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVentasActionPerformed
        GestionDeVentas gesVenta = new GestionDeVentas();
        if (!UsuarioIDjLabel.getText().isEmpty()) {
            gesVenta.idUsuario = Integer.parseInt(UsuarioIDjLabel.getText());
            gesVenta.nombreUsuario = NombreUsuariojLabel.getText();
            if (señalVenta == 0) {
                jTabbedPane1.addTab("Gestión de ventas", gesVenta.getContentPane());
                señalVenta = 1;
            }
        }

    }//GEN-LAST:event_JBVentasActionPerformed

    private void JBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuariosActionPerformed
        GestionDeUsuarios gesUsu = new GestionDeUsuarios();
        if (señalUsu == 0) {
            gesUsu.nombreUsuario = NombreUsuariojLabel.getText();
            jTabbedPane1.addTab("Gestión de usuarios", gesUsu.getContentPane());
            señalUsu = 1;
        }
    }//GEN-LAST:event_JBUsuariosActionPerformed

    private void BackupjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupjButtonActionPerformed
        Backup backup = new Backup();
        backup.nombreUsuario = NombreUsuariojLabel.getText();
        backup.setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_BackupjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnknownHostException, IOException {
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton BackupjButton;
    javax.swing.JLabel FechajLabel;
    javax.swing.JButton JBCajas;
    javax.swing.JButton JBClientes;
    javax.swing.JButton JBCompras;
    javax.swing.JButton JBInformes;
    javax.swing.JButton JBNNuevaVenta;
    javax.swing.JButton JBProductos;
    javax.swing.JButton JBProveedores;
    javax.swing.JButton JBUsuarios;
    javax.swing.JButton JBVentas;
    public javax.swing.JLabel NombreUsuariojLabel;
    javax.swing.JLabel UsuarioIDjLabel;
    javax.swing.JButton btnAyuda;
    javax.swing.JButton btnExit;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel3;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JToolBar jToolBar1;
    javax.swing.JLabel servidorjLabel;
    // End of variables declaration//GEN-END:variables
    private int señalProd = 0;
    private int señalClie = 0;
    private int señalOac = 0;
    private int señalOpDia = 0;
    private int señalVenta = 0;
    private int señalCompra = 0;
    private int señalProv = 0;
    private int señalUsu = 0;

    Calendar Cal = Calendar.getInstance();
    String fec = Cal.get(Cal.DATE) + "/" + (Cal.get(Cal.MONTH) + 1) + "/" + Cal.get(Cal.YEAR
    ) + " " + Cal.get(Cal.HOUR_OF_DAY) + ":" + Cal.get(Cal.MINUTE) + ":" + Cal.get(Cal.SECOND);

}
