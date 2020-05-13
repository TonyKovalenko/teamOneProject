package backingBeans;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.IOException;

@Named
@RequestScoped
public class LogoutBackingBean {

    public String doLogout() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/welcome?faces-redirect=true";
    }
}
