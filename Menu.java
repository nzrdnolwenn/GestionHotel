package fr.appli.gestion.hotel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Menu implements Serializable {
    public Hotel hotel;
    private List<Chambre> chambres;
    private List<Reservation> reservations;
    private Date dateDebut;
    private Date dateFin;
    private Facture facture;

    public Menu(Hotel hotel) {
        this.hotel = hotel;
        this.chambres = hotel.getChambres();
        this.reservations = hotel.getReservations() ;
    }


    private void commanderRepas() {

    }

    private void enregistrerDepartClient() {

    }



    public void afficherMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Afficher les détails des chambres");
            System.out.println("2. Afficher la disponibilité des chambres");
            System.out.println("3. Effectuer une réservation");
            System.out.println("4. Annuler une réservation");
            System.out.println("5. Quitter");

            System.out.print("Veuillez choisir une option : ");
            choix = scanner.nextInt();

            switch (choix) {/*
                case 1:
                    hotel.afficherDetailsChambres();
                    break;
                case 2:
                    hotel.afficherDisponibiliteChambres();
                    break;*/
                case 3:
                    effectuerReservation();
                    break;
                case 4:
                    supprimerReservation();
                    break;
            }


        } while (choix != 5);


    }


    private void effectuerReservation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nom du client : ");
        String nomClient = scanner.nextLine();

        System.out.print("Numéro de téléphone du client : ");
        String numeroTelephone = scanner.nextLine();

        System.out.print("Numéro chambre : ");
        int chambre = Integer.parseInt(scanner.nextLine());
        System.out.print("Numéro reservation : ");
        int numrServation = Integer.parseInt(scanner.nextLine());

        System.out.print("Date de type JJ-MM-AAAA: ");
        String dateDebut = scanner.nextLine();

        System.out.print("Date de type JJ-MM-AAAA : ");
        String dateFin = scanner.nextLine();

        this.reservations.add( new Reservation(numrServation, chambres.get(chambre), "20/12/2003", "14/12/2003", new Client( nomClient,numeroTelephone )) ) ;

    }

    private void supprimerReservation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numéro reservation ");
        int reservation = Integer.parseInt(scanner.nextLine());

        reservations.remove(reservation) ;
    }


}
