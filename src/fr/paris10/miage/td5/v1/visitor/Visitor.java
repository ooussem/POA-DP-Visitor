package fr.paris10.miage.td5.v1.visitor;

import fr.paris10.miage.td5.v1.model.*;

/**
 * Created by ououlhac on 07/11/2016.
 */
public interface Visitor {

    public void visit(Appartement appartement);
    public void visit(Piece piece);
    public void visit(Objet obj);
    public void visit(ObjetBasic obj);
    public void visit(GardeRobe gardeRobe);
    public void visit(Vetement vetement);
    public void visit(CollectionDeLivre collectionLivre);
    public void visit(Livre livre);




}
