package fr.paris10.miage.td5.visitor.visitor.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ououlhac on 07/11/2016.
 */

public class GardeRobe extends ObjetBasique{

    private List listVetement;

    public GardeRobe()
    {
        listVetement = new ArrayList();
    }

    public void addVetement(Vetement vetement){
        listVetement.add(vetement);
    }


}
