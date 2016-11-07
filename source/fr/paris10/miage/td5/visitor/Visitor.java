package fr.paris10.miage.td5.visitor;

import fr.paris10.miage.td5.visitor.visitor.model.*;

/**
 * Created by ououlhac on 07/11/2016.
 */
public interface Visitor {

    public void visit(Univers univ);
    public void visit(Piece piece);
    public void visit(Bureau bureau);
    public void visit(GardeRobe gardeRobe);
    public void visit(Lit lit);



}
