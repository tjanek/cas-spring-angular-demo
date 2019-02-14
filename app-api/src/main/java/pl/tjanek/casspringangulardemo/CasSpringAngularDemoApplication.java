package pl.tjanek.casspringangulardemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.OPTIONS;

@SpringBootApplication
@Controller
public class CasSpringAngularDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasSpringAngularDemoApplication.class, args);
    }

    @RequestMapping(
        method = { OPTIONS, GET },
        path = { "/**/{[path:[^\\.]*}" }
    )
    public String angularPaths() {
        return "forward:/index.html";
    }
}

