package pl.mpas.own_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mpas.own_security.service.MyService;

@Controller
public class MyController {

    MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping({"/welcome", "/"})
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/root")
    public String root() {
        return "root";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
