package fr.paris10.miage.td5.visitor.visitor.model;

import fr.paris10.miage.td5.visitor.Visitor;

/**
 * Created by ououlhac on 07/11/2016.
 */


public class Univers extends Composite implements Visitable
{
    private String nameUnivers;

    public Univers() {
        this("empty");
    }

    public Univers(String nameUnvivers){
        super();
        this.nameUnivers= nameUnvivers;
    }


    public void add(Piece composite)
    {
        super.add(composite);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitUnivers(this);
    }

    public String getNameUnivers() {
        return this.nameUnivers;
    }
}
