package pres;

import dao.IDAO;
import metier.IMetier;
import metier.IMetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.*;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDAO dao=(IDAO) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDAO.class );
        method.invoke(metier,dao);

        System.out.println(metier.calcul());




    }
}
