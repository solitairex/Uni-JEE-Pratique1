package pres;
import dao.DaoImpl;
import ext.IDaoImpl2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args){
        IDaoImpl2 dao=new IDaoImpl2();
        IMetierImpl metier = new IMetierImpl(dao);
       // metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
