package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @GetMapping("/name")
    public String displayNameAndSurname(@RequestParam(required = false) String name,
                                        @RequestParam(required = false) String surname,
                                        Model model) {
        Person person = new Person(name, surname);
        model.addAttribute("mariusz", person);

        System.out.println("name from request: " + name);
        System.out.println("surname from request: " + surname);

        return "name";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

}
