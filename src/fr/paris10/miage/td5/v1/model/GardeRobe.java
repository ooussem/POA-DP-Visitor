package fr.paris10.miage.td5.v1.model;

import fr.paris10.miage.td5.v1.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ououlhac on 07/11/2016.
 */

public class GardeRobe extends Objet {

    public List<Vetement> listVetement;

    public GardeRobe(String name){
        super(name);
        listVetement = new ArrayList<Vetement>();
    }

    public GardeRobe(String name, List<Vetement> listVetement) {
        super(name);
        this.listVetement = listVetement;
    }

    public void addVetement(Vetement vetement){
        listVetement.add(vetement);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
