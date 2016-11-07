package fr.paris10.miage.td5.visitor.visitor.model;

import fr.paris10.miage.td5.visitor.Visitor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ououlhac on 07/11/2016.
 */

public class Composite
{
    Visitor visitor;
    Set compositeList;

    public Composite(){
        compositeList = new HashSet();
    }

    public void add(Composite composite)
    {
        compositeList.add(composite);
    }

    public void delete(Composite composite)
    {
        compositeList.remove(composite);
    }

    public Set getCompositeList() {
        return compositeList;
    }
}
