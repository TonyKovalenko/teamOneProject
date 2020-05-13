package backingBeans;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class LoginBackingBean {

    public String doLogin() {
        return "app/index.xhtml?faces-redirect=true";
    }
}
