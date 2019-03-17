package pl.tjanek.casspringangulardemo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/profile")
public class ProfileController {

    @GetMapping
    public String getProfile() {
        return String.format("{ \"username\": \"%s\"}", loggedUsername());
    }

    private String loggedUsername() {
        return (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
