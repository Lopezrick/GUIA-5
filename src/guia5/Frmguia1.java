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
public class Frmguia1 extends javax.swing.JFrame {

    /** Creates new form Frmguia1 */
    public Frmguia1() {
        initComponents();
        setLocationRelativeTo(null);
        
        setTitle("App guia 1");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        area = new javax.swing.JButton();
        perimetro = new javax.swing.JButton();
        volumenE = new javax.swing.JButton();
        volumenC = new javax.swing.JButton();
        media = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("¿Que desea calcular?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(53, 49, 160, 19);

        area.setText("Area de un cuadrilatero");
        area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaActionPerformed(evt);
            }
        });
        getContentPane().add(area);
        area.setBounds(53, 81, 200, 23);

        perimetro.setText("Perimetro de un circulo");
        perimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perimetroActionPerformed(evt);
            }
        });
        getContentPane().add(perimetro);
        perimetro.setBounds(53, 122, 200, 23);

        volumenE.setText("Volumen de una esfera");
        volumenE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumenEActionPerformed(evt);
            }
        });
        getContentPane().add(volumenE);
        volumenE.setBounds(53, 163, 200, 23);

        volumenC.setText("Volumen de un cubo");
        volumenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumenCActionPerformed(evt);
            }
        });
        getContentPane().add(volumenC);
        volumenC.setBounds(53, 204, 200, 23);

        media.setText("Promedio de 10 datos");
        media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaActionPerformed(evt);
            }
        });
        getContentPane().add(media);
        media.setBounds(54, 245, 200, 23);

        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(180, 290, 70, 23);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 290, 100, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaActionPerformed
        double area;
        Procesos a=new Procesos();
        area=a.getArea();
        JOptionPane.showMessageDialog(null,"Area= "+area+" unidades cuadradas");
    }//GEN-LAST:event_areaActionPerformed

    private void perimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perimetroActionPerformed
     double perimetro;
        Procesos p=new Procesos();
        p.getRadio();
        perimetro=p.getPerimetro();
        JOptionPane.showMessageDialog(null,"Perimetro= "+perimetro+" unidades");
    }//GEN-LAST:event_perimetroActionPerformed

    private void volumenEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumenEActionPerformed
        // TODO add your handling code here:
        double vol;
        Procesos v=new Procesos();
        v.getRadio();
        vol=v.getVolumenesfera();
        JOptionPane.showMessageDialog(null,"Volumen= "+vol+" unidades cubicas");
    }//GEN-LAST:event_volumenEActionPerformed

    private void volumenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumenCActionPerformed
        // TODO add your handling code here:
        double cubo;
        Procesos v=new Procesos();
        v.getArista();
        cubo=v.getVolumencubo();
        JOptionPane.showMessageDialog(null,"Volumen= "+cubo+" unidades cubicas");
    }//GEN-LAST:event_volumenCActionPerformed

    private void mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaActionPerformed
        // TODO add your handling code here:
        Procesos pro=new Procesos();
        pro.llenarVector();
        
        JOptionPane.showMessageDialog(null,"Promedio= "+pro.getPromedio()+" unidades");
    }//GEN-LAST:event_mediaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Ventanasecundaria v= new Ventanasecundaria();
        v.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(Frmguia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmguia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmguia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmguia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmguia1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton media;
    private javax.swing.JButton perimetro;
    private javax.swing.JButton salir;
    private javax.swing.JButton volumenC;
    private javax.swing.JButton volumenE;
    // End of variables declaration//GEN-END:variables

}
