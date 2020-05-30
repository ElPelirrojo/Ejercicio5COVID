/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Empresa;
import modelo.Usuario;

/**
 *
 * @author Barbero
 */
public class FrameAdmin extends javax.swing.JFrame {
    
    Empresa miEmpresa;
    pnlCambiarContraAdmin pnlCambiar;
    Usuario usuariovalidado;
    panelAlta pAlta;
    panelCambiarContra pnlCambiarAdmin;
    panelBaja pBaja;
    panelEnviarMensajesA pEnviar;
    panelCorreoA pRecibidos;
    
    /**
     * Creates new form FrameAdmin
     */
    public FrameAdmin(Empresa miEmpresa, Usuario usuario) {
        this.miEmpresa = miEmpresa;
        initComponents();
        usuariovalidado = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCambiarContra = new javax.swing.JMenuItem();
        mnuAlta = new javax.swing.JMenuItem();
        mnuBaja = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuContraAdmin = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuRecibidos = new javax.swing.JMenuItem();
        mnuEnviar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Usuarios");

        mnuCambiarContra.setText("Cambiar Contraseña");
        mnuCambiarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarContraActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCambiarContra);

        mnuAlta.setText("Alta");
        mnuAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAlta);

        mnuBaja.setText("Baja-Consulta");
        mnuBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBajaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuBaja);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Perfil");

        mnuContraAdmin.setText("Cambiar Contraseña");
        mnuContraAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuContraAdminActionPerformed(evt);
            }
        });
        jMenu4.add(mnuContraAdmin);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Mensajes");

        mnuRecibidos.setText("Mensajes Recibidos");
        mnuRecibidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRecibidosActionPerformed(evt);
            }
        });
        jMenu3.add(mnuRecibidos);

        mnuEnviar.setText("Enviar Mensajes");
        mnuEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEnviarActionPerformed(evt);
            }
        });
        jMenu3.add(mnuEnviar);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Salir");

        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDesconectar);

        mnuSalir.setText("Salir de la Aplicacion");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new Principal(miEmpresa).setVisible(true);
        dispose();
        pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        dispose(); //elimina de la memoria todo lo que no necesites y cierra la ventana
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuCambiarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarContraActionPerformed
        eliminarPaneles();
        pnlCambiar = new pnlCambiarContraAdmin(miEmpresa,usuariovalidado);
        getContentPane().add(pnlCambiar);
        pack();
    }//GEN-LAST:event_mnuCambiarContraActionPerformed

    private void mnuAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaActionPerformed
        eliminarPaneles();
        pAlta = new panelAlta(miEmpresa,usuariovalidado);
        getContentPane().add(pAlta);
        pack();
    }//GEN-LAST:event_mnuAltaActionPerformed

    private void mnuContraAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuContraAdminActionPerformed
        eliminarPaneles();
        pnlCambiarAdmin = new panelCambiarContra(miEmpresa,usuariovalidado);
        getContentPane().add(pnlCambiarAdmin);
        pack();
    }//GEN-LAST:event_mnuContraAdminActionPerformed

    private void mnuBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBajaActionPerformed
        eliminarPaneles();
        pBaja = new panelBaja(miEmpresa,usuariovalidado);
        getContentPane().add(pBaja);
        pack();
    }//GEN-LAST:event_mnuBajaActionPerformed

    private void mnuEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEnviarActionPerformed
        eliminarPaneles();
        pEnviar = new panelEnviarMensajesA(miEmpresa,usuariovalidado);
        getContentPane().add(pEnviar);
        pack();
    }//GEN-LAST:event_mnuEnviarActionPerformed
        
    private void mnuRecibidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRecibidosActionPerformed
        eliminarPaneles();
        pRecibidos  = new panelCorreoA(miEmpresa,usuariovalidado);
        getContentPane().add(pRecibidos);
        pack();
    }//GEN-LAST:event_mnuRecibidosActionPerformed

    private void eliminarPaneles(){
        try{
            getContentPane().remove(pnlCambiar);
        }catch(Exception ex){}
        
        try{
            getContentPane().remove(pAlta);
        }catch(Exception ex){}
        
        try{
            getContentPane().remove(pnlCambiarAdmin);
        }catch(Exception ex){}
        
        try{
            getContentPane().remove(pBaja);
        }catch(Exception ex){}
        
        try{
            getContentPane().remove(pEnviar);
        }catch(Exception ex){}
        
        try{
            getContentPane().remove(pRecibidos);
        }catch(Exception ex){}
    }
    
    /*private void eliminarPaneles(){
        getContentPane.
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuAlta;
    private javax.swing.JMenuItem mnuBaja;
    private javax.swing.JMenuItem mnuCambiarContra;
    private javax.swing.JMenuItem mnuContraAdmin;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuEnviar;
    private javax.swing.JMenuItem mnuRecibidos;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
