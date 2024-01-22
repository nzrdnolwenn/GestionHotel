package fr.appli.gestion.hotel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class ApplicationGestionHotel {
    public static void main(String[] args) {
        ArrayList<Client> listClient = new ArrayList<Client>() ;
        ArrayList<Chambre> listChambre = new ArrayList<Chambre>() ;
        listChambre.add(new Chambre(1,"simple","", false));
        listChambre.add(new Chambre(2,"double","", false));
        listChambre.add(new Chambre(3,"suite","", false));
        listChambre.add(new Chambre(4,"","", false));
        listChambre.add(new Chambre(5,"","", false));
        listChambre.add(new Chambre(6,"","", false));
        listChambre.add(new Chambre(7,"","", false));
        listChambre.add(new Chambre(8,"","", false));
        listChambre.add(new Chambre(9,"","", false));
        listChambre.add(new Chambre(10,"","" ,false));
        listChambre.add(new Chambre(3,"","", false));
        listChambre.add(new Chambre(4,"","", false));
        listChambre.add(new Chambre(1,"","", false));
        listChambre.add(new Chambre(2,"","", false));
        listChambre.add(new Chambre(3,"","", false));
        listChambre.add(new Chambre(4,1,"", false));
        listChambre.add(new Chambre(1,3,"", false));
        listChambre.add(new Chambre(2,2,"", false));
        listChambre.add(new Chambre(3,3,"", false));
        listChambre.add(new Chambre(4,1,"", false));
        listChambre.add(new Chambre(1,3,"", false));
        listChambre.add(new Chambre(2,2,"", false));
        listChambre.add(new Chambre(3,3,"", false));
        listChambre.add(new Chambre(4,1,"", false));
        listChambre.add(new Chambre(1,3,"", false));
        listChambre.add(new Chambre(2,2,"", false));
        listChambre.add(new Chambre(3,3,"", false));
        listChambre.add(new Chambre(4,1,"", false));
        ArrayList<Reservation> listResa = new ArrayList<Reservation>() ;

        Hotel hotel = new Hotel(listChambre,listResa,listClient);

        Menu menu = new Menu( hotel ) ;
        menu.afficherMenuPrincipal();




    }
}