/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import javax.swing.JOptionPane;

/**
 *
 * @author RICK LOPEZ
 */
public class Ventanasistema extends javax.swing.JFrame {

    /**
     * Creates new form Ventanasistema
     */
    public Ventanasistema() {
        initComponents();
        setLocationRelativeTo(null);
        
        setTitle("Iniciar sesion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btningresar = new javax.swing.JButton();
        pasword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });
        getContentPane().add(txtuser);
        txtuser.setBounds(160, 60, 127, 20);

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 100, 14);

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 129, 130, 14);

        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        getContentPane().add(btningresar);
        btningresar.setBounds(111, 181, 120, 23);

        pasword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paswordKeyPressed(evt);
            }
        });
        getContentPane().add(pasword);
        pasword.setBounds(160, 120, 127, 20);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel3.setText("Bienvenido");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 30, 111, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
String usuario= txtuser.getText();
String psw = pasword.getText();
if (usuario.equals("ADMIN")&&psw.equals("123ABC")){
    Ventanasecundaria objeto=new  Ventanasecundaria();
    objeto.setVisible(true);
    dispose();
    
}
else{
    
    txtuser.setText("");
    pasword.setText("");
    txtuser.requestFocus();
    JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecta.Intente otra ves");
}
    }//GEN-LAST:event_btningresarActionPerformed

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        // TODO add your handling code here:
        int c=(int)evt.getKeyChar();
        if(c==10){
           pasword.requestFocus();
        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void paswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paswordKeyPressed
        // TODO add your handling code here:
        int c=(int)evt.getKeyChar();
        if(c==10){
           btningresar.requestFocus();
        }
    }//GEN-LAST:event_paswordKeyPressed

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
            java.util.logging.Logger.getLogger(Ventanasistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanasistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanasistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanasistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanasistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pasword;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
