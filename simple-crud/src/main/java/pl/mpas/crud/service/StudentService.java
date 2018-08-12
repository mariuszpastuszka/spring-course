package pl.mpas.crud.service;

import pl.mpas.crud.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
}
