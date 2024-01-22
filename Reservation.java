package fr.appli.gestion.hotel;

import java.util.Date;
import java.util.List;
import java.io.Serializable;


public class Reservation implements Serializable{
    private Client client;
    private List<CommandeRepas> commandesRepas;
    private int numeroReservation ;
    private Chambre chambre;
    private String dateDebut;
    private String dateFin;

    public Reservation(int numeroReservation, Chambre chambre, String dateDebut, String dateFin, Client client) {
        /*if (chambre.estReservee()) {
            System.out.println("La chambre est déjà réservée.");
        }
        else {*/
            this.numeroReservation = numeroReservation;
            chambre.setEstReservee(true);
            this.chambre = chambre;
            this.dateDebut = dateDebut;
            this.dateFin = dateFin;
            this.client = client;
            System.out.println("•••••• la resevation "+ this.numeroReservation +" est effectuer ••••••");
    }
    public int getNumeroReservation() {
        return numeroReservation;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return client;
    }

    public List<CommandeRepas> getCommandesRepas() {
        return commandesRepas;
    }
    public void commanderRepas(CommandeRepas commandeRepas) {
        client.commanderRepas(commandeRepas);
    }

    public void supprimerReservation (Chambre chambre) {
        if (chambre.estReservee()) {
            this.numeroReservation = 0;
            chambre.setEstReservee(false);
            this.chambre = null;
            this.dateDebut = null;
            this.dateFin =  null;
            this.client = null;
            this.commandesRepas = null;
            System.out.println("La chambre n'edt plus réservée.");
        }
        else {
            System.out.println("La chambre n'a jamaid etat réservée.");

        }
    }

}
