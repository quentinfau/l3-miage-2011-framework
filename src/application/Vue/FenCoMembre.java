/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FenCoMembre.java
 *
 * Created on 27 avr. 2012, 10:38:59
 */
package application.Vue;

import java.awt.Container;

/**
 *
 * @author NNJeremy
 */
public class FenCoMembre extends javax.swing.JPanel {

    /** Creates new form FenCoMembre */
    public FenCoMembre(FenPrincipale fenprinc) {
        initComponents();
        this.ancetre = fenprinc;
        jLabel_MonPseudo.setText(ancetre.profil().getPseudo());
        jButton_Admin.setVisible(false);
        if (ancetre.profil().isAdmin())
            jButton_Admin.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Deconnexion = new javax.swing.JButton();
        jLabel_MonPseudo = new javax.swing.JLabel();
        jButton_Admin = new javax.swing.JButton();

        jButton_Deconnexion.setText("Deconnexion");
        jButton_Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeconnexionActionPerformed(evt);
            }
        });

        jLabel_MonPseudo.setText("Mon Pseudo");

        jButton_Admin.setText("Admin");
        jButton_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                .addComponent(jLabel_MonPseudo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Deconnexion)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Deconnexion)
                    .addComponent(jLabel_MonPseudo)
                    .addComponent(jButton_Admin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton_DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeconnexionActionPerformed
    ancetre.switchPanelLogin(null);
}//GEN-LAST:event_jButton_DeconnexionActionPerformed

    private void jButton_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AdminActionPerformed
        
        this.ancetre.afficherAdmin();
        
    }//GEN-LAST:event_jButton_AdminActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Admin;
    private javax.swing.JButton jButton_Deconnexion;
    private javax.swing.JLabel jLabel_MonPseudo;
    // End of variables declaration//GEN-END:variables
    private FenPrincipale ancetre;
}