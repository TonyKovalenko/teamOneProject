package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthorizationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String pageRequested = req.getRequestURI();
        System.out.println("GOOOOOOOOOOOOOOT CAAAAAAAAAAAALLLLLLLLLED");
        if (pageRequested.contains("login.xhtml")) {
            resp.sendRedirect("app/index.xhtml");
        } else {
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
    }

}

