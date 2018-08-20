package pl.mpas.controller;

import org.springframework.web.bind.annotation.*;
import pl.mpas.domain.Student;
import pl.mpas.service.StudentService;

import java.util.List;

@RestController
public class RestFullController {

    private StudentService studentService;

    @GetMapping("/students/{id}")
    List<Student> getStudents(@PathVariable(value = "id", required = false) Long id) {
        if (null == id) {
            return studentService.getAllStudents();
        }
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    boolean deleteStudents(@PathVariable(value = "id", required = false) Long id) {
        if (null == id) {
            return studentService.deleteAllStudens();
        }

        return studentService.deleteStudentById(id);
    }

    @PostMapping("/students/{id}")
    boolean addStudents(@PathVariable(value = "id") Long id, @ModelAttribute Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    boolean editStudents(@PathVariable(value = "id") Long id, @ModelAttribute Student student) {
        return studentService.replaceStudent(student);
    }
}
