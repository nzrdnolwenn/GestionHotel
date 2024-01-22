package fr.appli.gestion.hotel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Facture implements Serializable {
    private Reservation reservation;
    private Date dateDepart;
    private double prixChambre;
    private List<CommandeRepas> commandesRepas;


    public Facture(Reservation reservation, Date dateDepart) {
        this.reservation = reservation;
        this.dateDepart = dateDepart;
        this.prixChambre = prixChambre;
        this.commandesRepas = commandesRepas;
    }


}
