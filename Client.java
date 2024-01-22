package fr.appli.gestion.hotel;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Client implements Serializable {
    private String nom;
    private String numeroTelephone;
    private List<CommandeRepas> commandesRepas;

    public Client(String nom, String numeroTelephone) {
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
        this.commandesRepas = new ArrayList<>();
    }

    public void commanderRepas(CommandeRepas commandeRepas) {


        commandesRepas.add(commandeRepas);
    }


    public String getNom() {

        return nom;
    }

    public String getNumeroTelephone() {

        return numeroTelephone;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public void setNumeroTelephone(String numeroTelephone) {

        this.numeroTelephone = numeroTelephone;
    }

    public List<CommandeRepas> getCommandesRepas() {

        return null;
    }

}



