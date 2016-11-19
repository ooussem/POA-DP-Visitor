package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

/**
 * Created by ououlhac on 07/11/2016.
 */

public interface Visitable
{
    public void accept(Visitor visitor);
}
