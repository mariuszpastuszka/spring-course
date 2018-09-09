package pl.mpas.grade_books.domain;

import pl.mpas.grade_books.exception.PupilNotEnrolledOnSubject;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pupil {
    private Long id;
    private String name;
    private String surname;
    private List<PupilGrade> pupilGrades = new ArrayList<>();

    public Pupil() {
        // emtpy
    }

    public Pupil(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void addGradeFromSubject(Subject subject, Grade grade) throws PupilNotEnrolledOnSubject {

    }

    @Override
    public String toString() {
        return "Pupil{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pupilGrades=" + pupilGrades +
                '}';
    }
}
