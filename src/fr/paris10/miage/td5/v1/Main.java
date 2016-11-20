package fr.paris10.miage.td5.v1;

import fr.paris10.miage.td5.v1.model.*;
import fr.paris10.miage.td5.v1.visitor.Visitor;
import fr.paris10.miage.td5.v1.visitor.VisitorCount;
import fr.paris10.miage.td5.v1.visitor.VisitorPrefixe;
import fr.paris10.miage.td5.v1.visitor.VisitorSuffixe;

/**
 * Created by ououlhac on 07/11/2016.
 */
public class Main {
    public static void main(String[] args){

        Visitor vp = new VisitorPrefixe();
        Visitor vs = new VisitorSuffixe();
        Visitor vc = new VisitorCount(50);

        Appartement a1 = new Appartement(1);
        Piece p1 = new Piece("chambre", 1);
        Piece p2 = new Piece("Bibliothèque", 2);
        Objet obj1_1 = new ObjetBasic("Lampe");
        GardeRobe gr1_1 = new GardeRobe("hiver");
        Vetement v1_1 = new Vetement("manteau", 100);
        Vetement v1_2 = new Vetement("pantalon", 100);
        Vetement v1_3 = new Vetement("T-shirt", 15);
        Vetement v1_4 = new Vetement("Pull", 30);
        Vetement v1_5 = new Vetement("Manteau en poil de toto", 410);
        CollectionDeLivre cl2_1 = new CollectionDeLivre("Collection informatique");
        Livre livre2_1 = new Livre(19, "Toto", "DP sous java");
        cl2_1.ajouterLivre(livre2_1);


        gr1_1.addVetement(v1_1);
        gr1_1.addVetement(v1_2);
        gr1_1.addVetement(v1_3);
        gr1_1.addVetement(v1_4);
        gr1_1.addVetement(v1_5);
        p1.addObjet(obj1_1);
        p1.addObjet(gr1_1);
        p2.addObjet(cl2_1);
        a1.add(p1);
        a1.add(p2);

        System.out.println("********* Visiteur préfixe");
        a1.accept(vp);
        System.out.println("********* Visiteur suffixe");
        a1.accept(vs);
        System.out.println("********* Visiteur count");
        a1.accept(vc);




    }
}
