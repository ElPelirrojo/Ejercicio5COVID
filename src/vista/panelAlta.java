/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Empresa;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Barbero
 */
public class panelAlta extends javax.swing.JPanel {
    
    Empresa miEmpresa;
    Usuario usuariovalidado;

    /**
     * Creates new form panelAlta
     */
    public panelAlta(Empresa miEmpresa, Usuario usuario) {
        initComponents();
        this.miEmpresa = miEmpresa;
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

        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pwdContra = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pwdRepe = new javax.swing.JPasswordField();

        jLabel1.setText("USUARIO");

        jLabel2.setText("CONTRASEÑA");

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");

        jLabel3.setText("ADMINISTRADOR");

        jLabel4.setText("DIRECCION DE ENTREGA");

        jLabel5.setText("REPETIR CONTRASEÑA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnAceptar)
                        .addGap(189, 189, 189)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo)
                            .addComponent(txtLogin)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pwdContra, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pwdRepe, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addComponent(txtAdmin))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwdContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(pwdRepe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String usuario = txtLogin.getText();
        String contra = new String(pwdContra.getPassword());
        String repe = new String(pwdRepe.getPassword());
        String correo = txtCorreo.getText();
        boolean admin = false;
        if(txtAdmin.getText().equalsIgnoreCase("si")){
            admin = true;
        }else if(txtAdmin.getText().equalsIgnoreCase("no")){
            admin = false;
        }
        if(!txtLogin.getText().equals("")){
            if(!txtAdmin.getText().equals("")){
                Usuario a = new Usuario(usuario);
                int pos = miEmpresa.getUsuarios().indexOf(a);
                if(pos == -1){
                    if(repe.equalsIgnoreCase(contra)){
                        int existe = miEmpresa.buscarCorreo(correo);
                        if(existe == -1){
                            miEmpresa.nuevoUsuario(usuario, contra, admin, correo);
                            JOptionPane.showMessageDialog(this, "Se ha añadido al usuario", "ventana informacion", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                        }else{
                            JOptionPane.showMessageDialog(this, "Este correo ya esta cogido", "error", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "La contraseña no coincide", "error", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "el usuario ya existe", "error", JOptionPane.ERROR_MESSAGE);
                    limpiar();
                }
            }else{
                JOptionPane.showMessageDialog(this, "la casilla de administrador es obligatoria", "error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Tiene que introducir un usuario", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed
    
    private void limpiar(){
        txtLogin.setText("");
        pwdContra.setText("");
        txtAdmin.setText("");
        pwdRepe.setText("");
        txtCorreo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pwdContra;
    private javax.swing.JPasswordField pwdRepe;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
