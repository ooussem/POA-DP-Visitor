package fr.paris10.miage.td5.visitor;

import fr.paris10.miage.td5.visitor.visitor.model.*;

/**
 * Created by ououlhac on 07/11/2016.
 */
public class VisitorSuffixe implements Visitor {

    @Override
    public void visit(Univers univ) {
        System.out.println("Je suis un " + univ.getNameUnivers());
        for(ObjetBasique obj : univ.getCompositeList()){
            obj.
        }

    }

    @Override
    public void visit(Piece piece) {

    }

    @Override
    public void visit(Bureau bureau) {

    }

    @Override
    public void visit(GardeRobe gardeRobe) {

    }

    @Override
    public void visit(Lit lit) {

    }
}