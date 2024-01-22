package fr.appli.gestion.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.*;
import java.io.Serializable;


public class Hotel implements Serializable{
    private List<Chambre> chambres;
    private List<Reservation> reservations;
    private List<Client> clients;


    public Hotel(List<Chambre> chambres, List<Reservation> reservations, List<Client> clients) {
        this.chambres = chambres;
        this.reservations = reservations;
        this.clients = clients;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }



}
