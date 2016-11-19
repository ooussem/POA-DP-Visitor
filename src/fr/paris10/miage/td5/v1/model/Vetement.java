package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

/**
 * Created by ououlhac on 07/11/2016.
 */

public class Vetement implements Visitable
{
    private String des;
    private int prix;

    public Vetement(String des, int prix) {
        this.des = des;
        this.prix = prix;
    }

    public String getDes() {
        return des;
    }

    public int getPrix() {
        return prix;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
