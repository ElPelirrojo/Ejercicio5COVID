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
public class frameNormal extends javax.swing.JFrame {
    
    Empresa miEmpresa;
    panelCambiarContra pnlCambiar;
    Usuario usuariovalidado;

    /**
     * Creates new form frameNormal
     */
   public frameNormal(Empresa miEmpresa, Usuario usuario) {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCambiarClave = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Perfil");

        mnuCambiarClave.setText("Cambiar Clave");
        mnuCambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCambiarClaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCambiarClave);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Mensaje");

        jMenuItem1.setText("Mensajes recibidos");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Enviar mensajes");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Salir");

        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDesconectar);

        mnuSalir.setText("Salir de la aplicacion");
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

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        dispose(); //elimina de la memoria todo lo que no necesites y cierra la ventana
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new Principal(miEmpresa).setVisible(true);
        dispose();
        pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuCambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCambiarClaveActionPerformed
        eliminarPaneles();
        pnlCambiar = new panelCambiarContra(miEmpresa,usuariovalidado);
        getContentPane().add(pnlCambiar);
        pack();
    }//GEN-LAST:event_mnuCambiarClaveActionPerformed
    
    private void eliminarPaneles(){
        try{
            getContentPane().remove(pnlCambiar);
        }catch(Exception ex){
            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mnuCambiarClave;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}