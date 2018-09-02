package pl.mpas.decision.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DecisionController {

    @GetMapping(value = { "/welcome", "/" })
    String welcome() {
        return "welcome";
    }

    @PostMapping("/decision")
    String makeDecision(@RequestParam(name = "decision") String decision) {
        switch (decision) {
            case "yes":
                return "yes-html";
            default:
                return "no-html";
        }
    }
}
