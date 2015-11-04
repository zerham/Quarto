/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlleur.ControllerLocal;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Observer;
import javax.swing.JPanel;
import model.Joueur;
import model.NumeroJoueur;
import model.Parametre;
import model.Partie;
import model.Piece;

/**
 *
 * @author timotheetroncy
 */
public class JPanelParametres extends javax.swing.JPanel {

    /**
     * Creates new form JPanelParametres
     */
    public JPanelParametres() {
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

        CommencerPartie = new javax.swing.JButton();
        RetourMenu = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Taille = new javax.swing.JCheckBox();
        Creux = new javax.swing.JCheckBox();
        Couleur = new javax.swing.JCheckBox();
        Forme = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        QuartoCarre = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        joueur1 = new javax.swing.JTextField();
        joueur2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setName("parametres"); // NOI18N
        setOpaque(false);

        CommencerPartie.setText("CommencerPartie");
        CommencerPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommencerPartieActionPerformed(evt);
            }
        });

        RetourMenu.setText("RetourMenu");
        RetourMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourMenuActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Paramètres du jeu de pièce"));
        jPanel4.setOpaque(false);

        Taille.setSelected(true);
        Taille.setText("Taille");
        Taille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TailleActionPerformed(evt);
            }
        });

        Creux.setSelected(true);
        Creux.setText("Creux");

        Couleur.setSelected(true);
        Couleur.setText("Couleur");
        Couleur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouleurActionPerformed(evt);
            }
        });

        Forme.setSelected(true);
        Forme.setText("Forme");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Taille)
                    .addComponent(Forme)
                    .addComponent(Couleur)
                    .addComponent(Creux))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Taille)
                .addGap(18, 18, 18)
                .addComponent(Forme)
                .addGap(18, 18, 18)
                .addComponent(Couleur)
                .addGap(18, 18, 18)
                .addComponent(Creux)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Activation Quarto par assemblage carré groupé"));
        jPanel5.setOpaque(false);

        QuartoCarre.setSelected(true);
        QuartoCarre.setText("Carré groupé");
        QuartoCarre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuartoCarreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(QuartoCarre)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(QuartoCarre)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Joueurs"));
        jPanel1.setOpaque(false);

        joueur1.setText("Joueur 1\n");
        joueur1.setName("Joueur1\n"); // NOI18N

        joueur2.setText("Joueur 2");
        joueur2.setName("Joueur2"); // NOI18N
        joueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joueur2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Joueur 1");

        jLabel2.setText("Joueur 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(joueur1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(joueur2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(RetourMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CommencerPartie)
                        .addGap(30, 30, 30)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommencerPartie, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RetourMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TailleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TailleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TailleActionPerformed

    private void CouleurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouleurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CouleurActionPerformed

    private void QuartoCarreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuartoCarreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuartoCarreActionPerformed

    private void RetourMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourMenuActionPerformed
        CardLayout cl = (CardLayout) this.getParent().getLayout();
        cl.show(this.getParent(), "menu");
    }//GEN-LAST:event_RetourMenuActionPerformed

    private void CommencerPartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommencerPartieActionPerformed
//        Parametre p = new Parametre(true, true, true, true, true);
//        Joueur j1 = new Joueur("Joueur 1", false, NumeroJoueur.J1);
//        Joueur j2 = new Joueur("Joueur 2", false, NumeroJoueur.J2);

        Piece.instanciationNb=0;
        Partie partie = new Partie(getParametres(), getJoueur1(), getJoueur2());
        ControllerLocal controllerLocal = new ControllerLocal(partie);
        JPanel panel = new JPanelQuarto(controllerLocal);
        controllerLocal.addObserver((Observer) panel);
        panel.setName("jeu");//Important

        CardLayout cl = (CardLayout) this.getParent().getLayout();

        //on remove le component jeu
        Component[] components = this.getParent().getComponents();
        for (Component c : components) {
            if (c.getName().equals("jeu")) {
                cl.removeLayoutComponent(c);
                this.getParent().remove(c);
            }
        }
        this.getParent().add("jeu", panel);

        cl.show(this.getParent(), "jeu");
    }//GEN-LAST:event_CommencerPartieActionPerformed

    private void joueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joueur2ActionPerformed

    private Parametre getParametres() {
        return new Parametre(this.Forme.isSelected(), this.Taille.isSelected(), this.Couleur.isSelected(),this.Creux.isSelected(), this.QuartoCarre.isSelected());
    }

    private Joueur getJoueur1() {
        return new Joueur(this.joueur1.getText(),false,NumeroJoueur.J1);
    }

    private Joueur getJoueur2() {
        return new Joueur(this.joueur2.getText(),false,NumeroJoueur.J2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CommencerPartie;
    private javax.swing.JCheckBox Couleur;
    private javax.swing.JCheckBox Creux;
    private javax.swing.JCheckBox Forme;
    private javax.swing.JCheckBox QuartoCarre;
    private javax.swing.JButton RetourMenu;
    private javax.swing.JCheckBox Taille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField joueur1;
    private javax.swing.JTextField joueur2;
    // End of variables declaration//GEN-END:variables
}
