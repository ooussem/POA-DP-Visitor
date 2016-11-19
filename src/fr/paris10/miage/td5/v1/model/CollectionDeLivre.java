package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ououlhac on 07/11/2016.
 */

public class CollectionDeLivre extends Objet {

    public List<Livre> listlivre;

    public CollectionDeLivre(String name) {
        super(name);
        listlivre = new ArrayList<Livre>();
    }

    public void ajouterLivre(Livre livre){
        listlivre.add(livre);
    }

    @Override
    public void accept(Visitor visitor) {
        super.accept(visitor);
    }
}
