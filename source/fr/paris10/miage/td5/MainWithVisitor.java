package fr.paris10.miage.td5;

import fr.paris10.miage.td5.visitor.Visitor;
import fr.paris10.miage.td5.visitor.visitor.model.Composite;
import fr.paris10.miage.td5.visitor.visitor.model.Univers;

/**
 * Created by ououlhac on 07/11/2016.
 */

public class MainWithVisitor
{
    public static void main(String[] args)
    {
        Composite univers1 = new Univers("Studio");
        Visitor visiteur1 = new VisiteurComptage();
        visiteur1.visitUnivers(univers1);

        univers1.accept(visiteur1);

    }


}
