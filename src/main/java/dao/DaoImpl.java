package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDAO {

    @Override
    public double getData(){
        System.out.println("XD");
        double temp=Math.random()*40;
        return temp;
    }
}
