package backingBeans;


import businessBeans.UserLoginHandler;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class LoginBackingBean {

    @Inject
    private UserLoginHandler loginHandler;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String doLogin() {
        return loginHandler.loginUser(username, password);
    }
}
