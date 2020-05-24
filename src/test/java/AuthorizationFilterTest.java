import filters.AuthorizationFilter;
import org.junit.Test;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class AuthorizationFilterTest {

    @Test
    public void testDoFilter() throws IOException, ServletException {
        HttpServletRequest mockRequest = mock(HttpServletRequest.class);
        HttpServletResponse mockResponse = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);

        when(mockRequest.getRequestURI()).thenReturn("/login.xhtml");

        AuthorizationFilter filter = new AuthorizationFilter();
        filter.doFilter(mockRequest, mockResponse, filterChain);

        verify(mockResponse).sendRedirect("app/index.xhtml");
    }
}
