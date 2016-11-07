package fr.paris10.miage.td5.visitor.visitor.model;

/**
 * Created by ououlhac on 07/11/2016.
 */
public class Piece extends Composite {
    private String numPiece;

    public Piece() {this("-1");
    }

    public Piece(String numPiece) {
        super();
        this.numPiece = numPiece;
    }


    public void add(ObjetBasique objetBasique) {
        super.add(objetBasique);
    }

    public String getNumPiece() {
        return numPiece;
    }
}
