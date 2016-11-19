package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ououlhac on 07/11/2016.
 */

public class Appartement implements Visitable
{
    private int numero;
    private Set<Piece> listPiece;

    public Appartement(int numero){
        this.numero= numero;
        listPiece = new HashSet<Piece>();
    }

    public void add(Piece piece)
    {
        listPiece.add(piece);
    }

    public int getNumero() {
        return numero;
    }

    public Set<Piece> getListPiece() {
        return listPiece;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
