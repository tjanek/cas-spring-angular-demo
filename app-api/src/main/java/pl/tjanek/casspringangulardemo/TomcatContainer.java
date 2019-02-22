package pl.tjanek.casspringangulardemo;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class TomcatContainer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        factory.addErrorPages(
                new ErrorPage(HttpStatus.NOT_FOUND, "/"),
                new ErrorPage(HttpStatus.BAD_REQUEST, "/"),
                new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/"),
                new ErrorPage(HttpStatus.FORBIDDEN, "/"),
                new ErrorPage(HttpStatus.SERVICE_UNAVAILABLE, "/")
        );
    }
}