/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import help.Help;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ema
 */
public class MenuDeOpcionesEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form MenuDeOpcionesEmpleado
     */
    public MenuDeOpcionesEmpleado() {
        AparienciaPantalla apa = new AparienciaPantalla();
        apa.cambiarApariencia("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        btnVenta.setMnemonic(KeyEvent.VK_V);
        setIconImage(new ImageIcon(getClass().getResource("../images/osg512.png")).getImage());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setAlwaysOnTop(true);
        this.setResizable(false); 
        btnVenta.setVisible(false);
        btnCaja.setVisible(false);
        btnGClientes.setVisible(false);
        btnGProductos.setVisible(false);
        btnGPresupuestos.setVisible(false);
        btnGUsuarios.setVisible(false);
    }
    
    public void cerrar(){
        setLocationRelativeTo(null);
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"¿Desea salir de OSG?","Saliendo de OSG",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
            if (eleccion == JOptionPane.YES_OPTION){
                System.exit(0);
            }else{
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
        btnGProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnGClientes = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGPresupuestos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnGUsuarios = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnCaja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnExit = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("OSG");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setExtendedState(MenuDeOpcionesEmpleado.MAXIMIZED_BOTH);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setOpaque(false);

        btnGProductos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGProductos.setText("Gestión de productos");
        btnGProductos.setFocusable(false);
        btnGProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGProductosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGProductos);
        jToolBar1.add(jSeparator1);

        btnGClientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGClientes.setText("Gestión de clientes");
        btnGClientes.setFocusable(false);
        btnGClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGClientes);
        jToolBar1.add(jSeparator2);

        btnGPresupuestos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGPresupuestos.setText("Gestión de presupuestos");
        btnGPresupuestos.setFocusable(false);
        btnGPresupuestos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGPresupuestos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGPresupuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGPresupuestosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGPresupuestos);
        jToolBar1.add(jSeparator3);

        btnGUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGUsuarios.setText("Gestión de usuarios");
        btnGUsuarios.setFocusable(false);
        btnGUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUsuariosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGUsuarios);
        jToolBar1.add(jSeparator4);

        btnCaja.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCaja.setText("Caja");
        btnCaja.setFocusable(false);
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCaja);

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

        btnVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVenta.setText("VENTA");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
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
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAyuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnAyuda))
                .addContainerGap())
        );

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

    private void btnGProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGProductosActionPerformed
        MenuDeGestionDeProductos gestionproducto = new MenuDeGestionDeProductos();
        if (señalProd == 0) {
            jTabbedPane1.addTab("Gestión de productos", gestionproducto.getContentPane());
           señalProd = 1;
        }
        
    }//GEN-LAST:event_btnGProductosActionPerformed

    private void btnGClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGClientesActionPerformed
        MenuGestionCliente gestioncliente = new MenuGestionCliente();
        if (señalClie == 0) {
            jTabbedPane1.addTab("Gestión de clientes", gestioncliente.getContentPane());
           señalClie = 1;
        }
    }//GEN-LAST:event_btnGClientesActionPerformed

    private void btnGPresupuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGPresupuestosActionPerformed
        GestionPresupuesto gestionpresupuesto = new GestionPresupuesto();
        if (señalPresu == 0) {
            jTabbedPane1.addTab("Gestión de presupuestos", gestionpresupuesto.getContentPane());
           señalPresu = 1;
        }
    }//GEN-LAST:event_btnGPresupuestosActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try{
            String nomTab = jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex());
            switch (nomTab) {
            case "Gestión de clientes":
                señalClie = 0;
                break;
            case "Gestión de productos":
                señalProd = 0;
                break;
            case "Gestión de presupuestos":
                señalPresu = 0;
                break;
            case "Gestión de usuarios":
                señalUsu = 0;
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
        }catch (ArrayIndexOutOfBoundsException e){
            cerrar();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUsuariosActionPerformed
        GestionDeUsuarios gestionusuarios = new GestionDeUsuarios();
        
        if (señalUsu == 0) {
            jTabbedPane1.addTab("Gestión de usuarios", gestionusuarios.getContentPane());
           señalUsu = 1;
        }
        
    }//GEN-LAST:event_btnGUsuariosActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
        // TODO add your handling code here:
        MenuDeOperacionesDiarias menuopdiarias = new MenuDeOperacionesDiarias();
        
        if (señalOpDia == 0) {
            jTabbedPane1.addTab("Caja", menuopdiarias.getContentPane());
           señalOpDia = 1;
        }
    }//GEN-LAST:event_btnCajaActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
        //new VentasEmpleado().setVisible(true);
        VentasEmpleado nuevaventa = new  VentasEmpleado();
        if (señalVenta == 0) {
            jTabbedPane1.addTab("Nueva venta", nuevaventa.getContentPane());
           señalVenta = 1;
        }
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
            Help help = new Help();
            help.setVisible(true);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

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
    javax.swing.JButton btnAyuda;
    javax.swing.JButton btnCaja;
    javax.swing.JButton btnExit;
    javax.swing.JButton btnGClientes;
    javax.swing.JButton btnGPresupuestos;
    javax.swing.JButton btnGProductos;
    javax.swing.JButton btnGUsuarios;
    javax.swing.JButton btnVenta;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JToolBar.Separator jSeparator1;
    javax.swing.JToolBar.Separator jSeparator2;
    javax.swing.JToolBar.Separator jSeparator3;
    javax.swing.JToolBar.Separator jSeparator4;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
    private int señalProd = 0;
    private int señalClie = 0;
    private int señalPresu = 0;
    private int señalUsu = 0;
    private int señalOpDia = 0;
    private int señalVenta = 0;
}
