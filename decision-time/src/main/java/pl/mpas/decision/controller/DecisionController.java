package pl.mpas.decision.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DecisionController {

    @GetMapping({ "/welcome", "/" })
    String welcome() {
        return "welcome";
    }

}
