package ext;

import dao.IDAO;

public class DaoImplVWS implements IDAO {
     @Override
    public double getData(){
         System.out.print("Version web ");
         return 90;
     }
}
