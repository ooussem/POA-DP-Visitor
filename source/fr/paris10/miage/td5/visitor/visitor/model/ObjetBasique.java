package fr.paris10.miage.td5.visitor.visitor.model;

import java.util.Set;

/**
 * Created by ououlhac on 07/11/2016.
 */
public abstract class ObjetBasique extends Composite implements Visitable{
    private String name;


    public ObjetBasique() {
        super();
    }

    @Override
    public void add(Composite composite) {
        super.add(composite);
    }

    @Override
    public void delete(Composite composite) {
        super.delete(composite);
    }

    @Override
    public Set getCompositeList() {
        return super.getCompositeList();
    }


}
