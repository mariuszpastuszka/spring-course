package pl.mpas.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {

    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
