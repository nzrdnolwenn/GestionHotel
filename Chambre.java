package fr.appli.gestion.hotel;

import java.io.Serializable;

public class Chambre implements Serializable {
    private int numeroChambre;
    private boolean estReservee=false;
    private String type;
    private String lit;

    private int prix;




    public Chambre(int numeroChambre, String type, String lit, boolean estReservee) {
        this.numeroChambre = numeroChambre;
        this.type = type;
        this.lit = lit;
        this.estReservee = estReservee ;
        }


    public int getNumeroChambre() {

        return numeroChambre;
    }

    public boolean isEstReservee() {

        return estReservee;
    }

    public void setNumeroChambre(int numeroChambre) {

        this.numeroChambre = numeroChambre;
    }

    public void setEstReservee(boolean estReservee) {

        this.estReservee = estReservee;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getType() {

        return null;
    }

    public boolean estReservee() {

        return this.estReservee;
    }

    }


