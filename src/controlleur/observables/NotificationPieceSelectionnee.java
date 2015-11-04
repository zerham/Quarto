/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlleur.observables;

import model.NumeroJoueur;
import view.EtatGUI;

/**
 *
 * @author Anis
 */
public class NotificationPieceSelectionnee extends Notification {

    public final String NomPiece;
    public final NumeroJoueur source;
    public final NumeroJoueur destination;

    public NotificationPieceSelectionnee(NumeroJoueur source, String nomPiece, EtatGUI etatSuivant, EtatGUI etatActuel) {
        super(etatSuivant, etatActuel);
        this.NomPiece = nomPiece;
        this.source = source;
        switch (source) {
                case J1:
                    destination = NumeroJoueur.J2;
                    break;
                case J2:
                    destination = NumeroJoueur.J1;             
                    break;
                default:
                    destination = null;
            }
    }


 

}