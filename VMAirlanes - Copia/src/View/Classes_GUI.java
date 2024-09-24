/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Pichau
 */
public class Classes_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Classes_GUI
     */
    public Classes_GUI() {
        initComponents();
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
        jMenu2 = new javax.swing.JMenu();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        buttonIcon1 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon2 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon3 = new org.edisoncor.gui.button.ButtonIcon();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Classes_GUI.png"))); // NOI18N
        panelImage1.setLayout(null);

        buttonIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Executiva.png"))); // NOI18N
        buttonIcon1.setText("buttonIcon1");
        buttonIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon1ActionPerformed(evt);
            }
        });
        panelImage1.add(buttonIcon1);
        buttonIcon1.setBounds(20, 260, 310, 80);

        buttonIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Economica.png"))); // NOI18N
        buttonIcon2.setText("buttonIcon1");
        buttonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon2ActionPerformed(evt);
            }
        });
        panelImage1.add(buttonIcon2);
        buttonIcon2.setBounds(20, 40, 310, 80);

        buttonIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EconomicaPR.png"))); // NOI18N
        buttonIcon3.setText("buttonIcon1");
        buttonIcon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon3ActionPerformed(evt);
            }
        });
        panelImage1.add(buttonIcon3);
        buttonIcon3.setBounds(20, 150, 310, 80);

        jMenu3.setText("Voltar");

        jMenuItem1.setText("Escolher Destino");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(650, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon2ActionPerformed
new economica_GUI().setVisible(true);
this.dispose();
    }//GEN-LAST:event_buttonIcon2ActionPerformed

    private void buttonIcon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon3ActionPerformed
     new economicaPR_GUI().setVisible(true);
this.dispose();
    }//GEN-LAST:event_buttonIcon3ActionPerformed

    private void buttonIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon1ActionPerformed
   new executiva_GUI().setVisible(true);
this.dispose();
    }//GEN-LAST:event_buttonIcon1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Destino_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Classes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classes_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon buttonIcon1;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon2;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
