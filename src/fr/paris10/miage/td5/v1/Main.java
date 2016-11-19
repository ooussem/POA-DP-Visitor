package fr.paris10.miage.td5.v1;

import fr.paris10.miage.td5.v1.model.*;
import fr.paris10.miage.td5.v1.visitor.Visitor;
import fr.paris10.miage.td5.v1.visitor.VisitorPrefixe;

/**
 * Created by ououlhac on 07/11/2016.
 */
public class Main {
    public static void main(String[] args){

        Visitor vp = new VisitorPrefixe();
        Appartement a1 = new Appartement(1);
        Piece p1 = new Piece("chambre", 1);
        Objet obj1_1 = new ObjetBasic("Lampe");
        GardeRobe gr1_1 = new GardeRobe("hiver");
        Vetement v1_1 = new Vetement("manteau toto", 100);
        Vetement v1_2 = new Vetement("pantalon levis", 100);

        gr1_1.addVetement(v1_1);
        gr1_1.addVetement(v1_2);
        p1.addObjet(obj1_1);
        p1.addObjet(gr1_1);
        a1.add(p1);

        a1.accept(vp);





    }
}
