package pl.tjanek.casspringangulardemo;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CasAuthenticationEntryPoint implements AuthenticationEntryPoint {

    public final void commence(final HttpServletRequest servletRequest,
                               final HttpServletResponse response,
                               final AuthenticationException authenticationException) throws IOException {

        response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }

}
