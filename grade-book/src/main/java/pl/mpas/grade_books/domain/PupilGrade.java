package pl.mpas.grade_books.domain;

import java.util.ArrayList;
import java.util.List;

public class PupilGrade {
    private final Subject subject;
    private List<Grade> grades;

    public PupilGrade(Subject subject) {
        this.subject = subject;
        grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public Subject getSubject() {
        return subject;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "PupilGrade{" +
                "subject=" + subject +
                ", grades=" + grades +
                '}';
    }
}
