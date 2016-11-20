package fr.paris10.miage.td5.v1.visitor;

import fr.paris10.miage.td5.v1.model.*;

import java.util.stream.Stream;

/**
 * Created by OOussema on 18/11/2016.
 */
public class VisitorSuffixe implements Visitor {

    public VisitorSuffixe() {

    }


    @Override
    public void visit(Appartement appartement) {
        appartement.getListPiece().forEach(piece -> piece.accept(this));
        System.out.println("Je suis un appartement numero " +appartement.getNumero());

    }

    @Override
    public void visit(Piece piece) {
        if(!piece.getListObjet().isEmpty()){
            for(Objet objet : piece.getListObjet()){
                objet.accept(this);
            }
        }
        System.out.println("Je suis la pièce numero " +piece.getNumPiece()+ " de type : " +piece.getType());
    }

    @Override
    public void visit(Objet obj) {

    }

    @Override
    public void visit(ObjetBasic obj) {
        System.out.println("Je suis l'objet: " +obj.getName());
    }

    @Override
    public void visit(GardeRobe gardeRobe) {
        for(Vetement vetement : gardeRobe.listVetement){
            vetement.accept(this);
        }
        System.out.println("Je suis la garde robe : " +gardeRobe.getName());
    }

    @Override
    public void visit(Vetement vetement) {
        System.out.println("Je suis un vetement : " +vetement.getDes()+ " de prix : " +vetement.getPrix());
    }

    @Override
    public void visit(CollectionDeLivre collectionLivre) {
        for(Livre livre : collectionLivre.listlivre){
            livre.accept(this);
        }
        System.out.println("Je suis une collection de livre : " +collectionLivre.getName());

    }

    @Override
    public void visit(Livre livre) {
        System.out.println("Je suis un livre :" + livre.getTitre() +" de : " +livre.getAuteur()+ ", " +
                "de prix : " +livre.getPrix());
    }
}
