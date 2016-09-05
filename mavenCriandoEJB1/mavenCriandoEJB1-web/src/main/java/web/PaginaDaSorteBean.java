
package web;

/**
 *
 * @author 13108286
 */
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PaginaDaSorteBean {

    @EJB
    private negocio.SorteadorBeanLocal sorteadorBean;
    
    public int getNumero() {
        return sorteadorBean.getNumero();
    }

}

