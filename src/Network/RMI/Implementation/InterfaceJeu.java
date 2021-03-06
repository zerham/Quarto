/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network.RMI.Implementation;

import Database.Compte;
import Network.RMI.Interface.IClientCallback;
import Network.RMI.Interface.IJeu;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.Coord;
import model.EtatGUI;
import model.NumeroJoueur;
import model.SortieGUI;
import org.apache.log4j.Logger;

public class InterfaceJeu extends UnicastRemoteObject implements IJeu {

    Compte Joueur;

    ControlleurDistant controleurPartieServeur;

    private static final Logger logger = Logger.getLogger(InterfaceJeu.class);

    public InterfaceJeu(Compte joueur, ControlleurDistant controleur) throws RemoteException {

        this.Joueur = joueur;
        controleurPartieServeur = controleur;

    }

    @Override
    public boolean poserPiece(Coord coord) throws RemoteException {
        return controleurPartieServeur.poserPiece(Joueur, coord);
    }

    @Override
    public boolean donnerPieceAdversaire() throws RemoteException {
        return controleurPartieServeur.donnerPieceAdversaire(Joueur);
    }

    @Override
    public boolean selectionPiece(int idPiece) throws RemoteException {
        return controleurPartieServeur.selectionPiece(Joueur, idPiece);
    }

    @Override
    public boolean annoncerQuarto() throws RemoteException {
        return controleurPartieServeur.annoncerMatchNul(Joueur);
    }

    @Override
    public boolean annoncerMatchNul() throws RemoteException {
        return controleurPartieServeur.annoncerMatchNul(Joueur);
    }

    @Override
    public NumeroJoueur getJoueurCourant() throws RemoteException {
        return controleurPartieServeur.getJoueurCourant();
    }

    @Override
    public EtatGUI getEtatCourant() throws RemoteException {
        return controleurPartieServeur.getEtatCourant();
    }

    @Override
    public SortieGUI getSortieGui() throws RemoteException {
        return controleurPartieServeur.getSortieGui();
    }

    @Override
    public List<Map.Entry<Integer, String>> getListPieceDisponible() throws RemoteException {
        return controleurPartieServeur.getListPieceDisponible();
    }

    @Override
    public String getNomJoueur(NumeroJoueur nj) throws RemoteException {
        return controleurPartieServeur.getNomJoueur(nj);
    }

    @Override
    public Boolean getIsValidationAutoEnabled() throws RemoteException {
        return controleurPartieServeur.getIsValidationAutoEnabled();
    }

    @Override
    public ArrayList<Coord> getAvailableCoords() throws RemoteException {
        return controleurPartieServeur.getAvailableCoords();
    }

    @Override
    public boolean onePlayer() throws RemoteException {
        return controleurPartieServeur.onePlayer();
    }

    @Override
    public void registerClientCallback(IClientCallback client) throws RemoteException {
        logger.warn(client);
        controleurPartieServeur.addObserver(client, Joueur);
    }

    @Override
    public String getParametres() throws RemoteException {
        return controleurPartieServeur.getParametres();
    }

    @Override
    public boolean VerifierJoueurs(Compte joueur1, Compte joeur2) throws RemoteException {
        return controleurPartieServeur.VerifierJoueurs(joueur1, joeur2);
    }

    @Override
    public void quiterPartie() throws RemoteException {
        //TODO notification que le joeuer a quiter la partie.
        controleurPartieServeur.quiterPartie(Joueur);
        logger.warn(Joueur.pseudo + " à quité la partie !");
    }

    @Override
    public String getNamePieceJ1() throws RemoteException {
        return controleurPartieServeur.getNamePieceJ1();
    }

    @Override
    public String getNamePieceJ2() throws RemoteException {
        return controleurPartieServeur.getNamePieceJ2();
    }

    @Override
    public List<Map.Entry<Coord, String>> getListPiecePlateauJeu() throws RemoteException {
        return controleurPartieServeur.getListPiecePlateauJeu();
    }

    @Override
    public void terminerPartie() throws RemoteException {
        logger.warn(Joueur.pseudo + " à supprimé la partie !");
        controleurPartieServeur.terminerPartie(Joueur);
        controleurPartieServeur = null;
        unexportObject(this, true);
    }

}
