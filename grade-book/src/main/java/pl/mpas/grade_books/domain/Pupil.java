package pl.mpas.grade_books.domain;

import pl.mpas.grade_books.exception.PupilNotEnrolledOnSubject;

import javax.persistence.Entity;
import java.util.*;
import java.util.stream.Collectors;

// TODO: annotations
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

    public boolean enrollOnSubject(Subject subject) {
        boolean result = false;

        return result;
    }

    public Set<Subject> enrollOnSubjects(Set<Subject> subjects) {
        List<Subject> enrolledSubjects =  pupilGrades.stream()
                .map(PupilGrade::getSubject)
                .collect(Collectors.toList());

        Set<Subject> setOfSubjects = new HashSet<>(subjects);
        setOfSubjects.removeAll(enrolledSubjects);

        setOfSubjects.forEach(this::enrollOnSubject);

        return setOfSubjects;
    }

    public void addGradeFromSubject(Subject subject, Grade grade) throws PupilNotEnrolledOnSubject {
        Optional<PupilGrade> gradeOfPupil = pupilGrades.stream()
                .filter(pupilGrade -> pupilGrade.getSubject() == subject)
                .findFirst();

        if (gradeOfPupil.isPresent()) {
            gradeOfPupil.get().addGrade(grade);
        } else {
            throw new PupilNotEnrolledOnSubject(String.format("Pupil [%s %s] isn't enrolled on subject [%s]",
                    name, surname, subject));
        }
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
