package fr.paris10.miage.td5.visitor.visitor.model;

import fr.paris10.miage.td5.visitor.Visitor;

/**
 * Created by ououlhac on 07/11/2016.
 */

public interface Visitable
{
    public void accept(Visitor visitor);
}
