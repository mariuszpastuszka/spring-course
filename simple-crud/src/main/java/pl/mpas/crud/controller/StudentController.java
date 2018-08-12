package pl.mpas.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.mpas.crud.service.StudentService;

@Controller
public class StudentController {

    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.findAllStudents());

        return "students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable("id") int studentId) {

        log.debug("Editing student of id {}", studentId);

        return "students";
    }
}
