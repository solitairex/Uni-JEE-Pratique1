package metier;
import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IMetierImpl implements IMetier{

    @Autowired

    private IDAO dao;
    public IMetierImpl(IDAO dao){
        this.dao=dao;
    }


    @Override
    public double calcul(){
     double tmp=dao.getData();
             double res=tmp*540/Math.cos(tmp*Math.PI);
             return res;
    }
    public void setDao(IDAO dao){
        this.dao = dao;
    }
}
