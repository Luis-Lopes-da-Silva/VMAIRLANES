
package View;



public class Login_GUI extends javax.swing.JFrame {


    public Login_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new org.edisoncor.gui.textField.TextFieldRound();
        cbe = new org.edisoncor.gui.textField.TextFieldRound();
        erro1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        erro2 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jButton1 = new javax.swing.JButton();
        semCadastro_BTN = new org.edisoncor.gui.button.ButtonTransluceIcon();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 220, 50, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 150, 40, 17);

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario);
        usuario.setBounds(210, 140, 230, 30);

        cbe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbeActionPerformed(evt);
            }
        });
        getContentPane().add(cbe);
        cbe.setBounds(210, 210, 230, 30);

        erro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/no.png"))); // NOI18N
        erro1.setFocusCycleRoot(true);
        getContentPane().add(erro1);
        erro1.setBounds(450, 130, 40, 40);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 160, 0, 0);

        erro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/no.png"))); // NOI18N
        getContentPane().add(erro2);
        erro2.setBounds(450, 200, 40, 40);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        panelImage2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelImage2.add(jButton1);
        jButton1.setBounds(250, 270, 160, 30);

        semCadastro_BTN.setBackground(new java.awt.Color(255, 255, 255));
        semCadastro_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semCadastro_BTNActionPerformed(evt);
            }
        });
        panelImage2.add(semCadastro_BTN);
        semCadastro_BTN.setBounds(210, 350, 230, 30);

        labelMetric1.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric1.setText("Ainda não tem uma conta?");
        labelMetric1.setDistanciaDeSombra(0);
        panelImage2.add(labelMetric1);
        labelMetric1.setBounds(230, 360, 210, 17);

        getContentPane().add(panelImage2);
        panelImage2.setBounds(0, 0, 650, 400);

        setSize(new java.awt.Dimension(650, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void cbeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbeActionPerformed

    private void semCadastro_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semCadastro_BTNActionPerformed
        new Cadastro_GUI().setVisible(true);
    }//GEN-LAST:event_semCadastro_BTNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Model.DadosL_DAO.Entrarr();
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
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_GUI().setVisible(true);
                 View.Login_GUI.erro1.setVisible(false);
     View.Login_GUI.erro2.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static org.edisoncor.gui.textField.TextFieldRound cbe;
    public static javax.swing.JLabel erro1;
    public static javax.swing.JLabel erro2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.button.ButtonTransluceIcon semCadastro_BTN;
    public static org.edisoncor.gui.textField.TextFieldRound usuario;
    // End of variables declaration//GEN-END:variables
}
