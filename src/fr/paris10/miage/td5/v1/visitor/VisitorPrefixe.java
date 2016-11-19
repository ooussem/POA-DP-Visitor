package fr.paris10.miage.td5.v1.visitor;

import fr.paris10.miage.td5.v1.model.*;

/**
 * Created by OOussema on 18/11/2016.
 */
public class VisitorPrefixe implements Visitor {

    public VisitorPrefixe() {
    }

    @Override
    public void visit(Appartement appartement) {
        System.out.println("Je suis un appartement numero " +appartement.getNumero());
        for(Piece piece : appartement.getListPiece()){
            piece.accept(this);
         }
    }

    @Override
    public void visit(Piece piece) {
        System.out.println("Je suis la pièce numero " +piece.getNumPiece()+ " de type : " +piece.getType());
        if(!piece.getListObjet().isEmpty()){
            for(Objet objet : piece.getListObjet()){
                objet.accept(this);
            }
        }
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
        System.out.println("Je suis la garde robe : " +gardeRobe.getName());
        for(Vetement vetement : gardeRobe.listVetement){
            vetement.accept(this);
        }
    }

    @Override
    public void visit(Vetement vetement) {
        System.out.println("Je suis un vetement : " +vetement.getDes()+ " de prix : " +vetement.getPrix());
    }

    @Override
    public void visit(CollectionDeLivre collectionLivre) {
        System.out.println("Je suis une collection de livre : " +collectionLivre.getName());
        for(Livre livre : collectionLivre.listlivre){
            livre.accept(this);
        }

    }

    @Override
    public void visit(Livre livre) {
        System.out.println("Je suis un livre :" + livre.getTitre() +" de : " +livre.getAuteur()+ ", " +
                "de prix : " +livre.getPrix());
    }
}
