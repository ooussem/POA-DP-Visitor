package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

/**
 * Created by ououlhac on 07/11/2016.
 */

public abstract class Objet implements Visitable{
    private String name;
    private  static int numb = 0;

    public Objet(String name) {
        this.name = name;
        numb++;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public static int getNumb() {
        return numb;
    }

    public String getName() {
        return name;
    }


}
