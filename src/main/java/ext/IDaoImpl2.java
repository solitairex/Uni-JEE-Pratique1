package ext;

import dao.IDAO;
import org.springframework.stereotype.Component;

@Component("dao2")
public class IDaoImpl2 implements IDAO {

    @Override
    public double getData(){
        System.out.println("Version Capteurs");
        double temp=6000;

        return temp;
    }

}
