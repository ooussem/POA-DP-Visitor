package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ououlhac on 07/11/2016.
 */
public class Piece implements Visitable{
    private String type;
    private int numPiece;
    private List<Objet> listObjet;

    public Piece(String type, int numPiece) {
        this.type = type;
        this.numPiece = numPiece;
        this.listObjet = new ArrayList<>();
    }
    public void addObjet(Objet obj){
        this.listObjet.add(obj);
    }

    public String getType() {
        return type;
    }

    public int getNumPiece() {
        return numPiece;
    }


    public List<Objet> getListObjet() {
        return listObjet;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
