package pl.mpas.grade_books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({ "/", "/home"})
    String homePage() {
        return "home-page";
    }
}
