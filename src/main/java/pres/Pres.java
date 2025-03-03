package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {

    public static void main(String[] args) {
      //instanciation statique
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);// injection via constructeur
       // injection via setter //metier.setDao(d);
        System.out.println("RES = " + metier.calcul());
    }
}
