package pl.mpas.crud.service;

import pl.mpas.crud.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAllStudents();
    Optional<Student> findStudentById(Long studentId);
    void saveStudent(Student student);
}
