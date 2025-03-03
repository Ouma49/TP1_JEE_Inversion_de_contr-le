package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component("metier")
@Service("metier") //=> pour les services
public class MetierImpl implements IMetier{

    //Couplage faible
  // @Autowired // Injection par type
    private IDao dao ;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
       double t =dao.getData();
       double res =t*23;
       return res;
    }

    /* Pour Injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao */

    public void setDao(IDao dao){
        this.dao = dao;
    }
}
