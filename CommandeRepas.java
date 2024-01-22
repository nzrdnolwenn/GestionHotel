package fr.appli.gestion.hotel;

import java.awt.*;
import java.io.Serializable;

import java.io.Serializable;


public class CommandeRepas implements Serializable {
    private int numeroCommande;
    private String plat;
    private double prix;

    public CommandeRepas(int numeroCommande, String plat, double prix) {
        this.numeroCommande = numeroCommande;
        this.plat = plat;
        this.prix = prix;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public String getPlat() {
        return plat;
    }

    public double getPrix() {
        return prix;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
