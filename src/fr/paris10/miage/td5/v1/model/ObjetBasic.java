package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

/**
 * Created by OOussema on 17/11/2016.
 */
public class ObjetBasic extends Objet {

    public ObjetBasic(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
