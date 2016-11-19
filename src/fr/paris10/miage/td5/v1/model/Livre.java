package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

/**
 * Created by OOussema on 18/11/2016.
 */
public class Livre implements Visitable{

    private int prix;
    private String auteur;
    private String titre;

    public Livre(int prix, String auteur, String titre) {
        this.prix = prix;
        this.auteur = auteur;
        this.titre = titre;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getPrix() {
        return prix;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }
}
