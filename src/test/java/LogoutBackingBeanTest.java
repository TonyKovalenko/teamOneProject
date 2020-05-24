import backingBeans.LogoutBackingBean;
import org.junit.Assert;
import org.junit.Test;

public class LogoutBackingBeanTest {

    @Test
    public void logoutRedirectTest() {
        LogoutBackingBean bean = new LogoutBackingBean();
        String actual = bean.sendRedirectURL();
        String expected = "/login?faces-redirect=true";
        Assert.assertEquals("Incorrect logout redirect.", expected, actual);
    }

}
