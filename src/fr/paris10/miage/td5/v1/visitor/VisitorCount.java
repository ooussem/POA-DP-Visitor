package fr.paris10.miage.td5.v1.visitor;

import fr.paris10.miage.td5.v1.model.*;

/**
 * Created by OOussema on 18/11/2016.
 */



/**
 * Visiteur qui va
 */
public class VisitorCount implements Visitor {
    private double limit;
    private double somme;

    public VisitorCount(double limit) {
        this.limit = limit;

    }

    @Override
    public void visit(Appartement appartement) {
        System.out.println("Je suis un appartement numero " +appartement.getNumero());
        appartement.getListPiece().forEach(piece -> piece.accept(this));
        System.out.println("La somme total de l'appartement " +appartement.getNumero()+ " est de " +somme);
    }

    @Override
    public void visit(Piece piece) {
        System.out.println("Je suis la pièce numero " +piece.getNumPiece()+ " de type : " +piece.getType());
        piece.getListObjet().forEach(objet -> objet.accept(this));
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
        gardeRobe.listVetement.forEach(vetement -> vetement.accept(this));
        somme += gardeRobe.listVetement.parallelStream()
                                        .map(vetement -> vetement.getPrix())
                                        .reduce(0, (x,y)-> x+y);
        System.out.println("Somme des vetements où le prix dépasse "+this.limit+" euros : "
                +gardeRobe.listVetement.stream()
                .map(vetement -> vetement.getPrix())
                .filter(prix -> prix>this.limit )
                .reduce(0, (x,y)-> x+y));

        /**
         * Les vetements du stream d'en heut dépassant les 100e auront un deuxième visiteur.
         */
        //gardeRobe.listVetement.parallelStream().forEach(vetement -> vetement.accept(this));

    }

    @Override
    public void visit(Vetement vetement) {
        System.out.println("Je suis un vetement : " +vetement.getDes()+ " de prix : " +vetement.getPrix());
    }

    @Override
    public void visit(CollectionDeLivre collectionLivre) {
        System.out.println("Je suis une collection de livre : " +collectionLivre.getName());
        collectionLivre.listlivre.forEach(livre -> livre.accept(this));
        somme += collectionLivre.listlivre.parallelStream()
                .map(livre -> livre.getPrix())
                .reduce(0, (x,y)-> x+y);

    }

    @Override
    public void visit(Livre livre) {
        System.out.println("Je suis un livre :" + livre.getTitre() +" de : " +livre.getAuteur()+ ", " +
                "de prix : " +livre.getPrix());
    }
}
