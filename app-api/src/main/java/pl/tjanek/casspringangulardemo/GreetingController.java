package pl.tjanek.casspringangulardemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/greeting")
public class GreetingController {

    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping
    public String greetUser() {
        return "{ \"greeting\": \"Logged user\"}";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping(value = "/admin")
    public String greetAdmin() {
        return "{ \"greeting\": \"Logged admin\"}";
    }
}
