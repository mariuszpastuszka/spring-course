package pl.mpas.grade_books.domain;

import java.util.Arrays;

public enum Subject {
    MATH("Math"),
    POLISH("Polish"),
    ENGLISH("English"),
    JAVA("Java"),
    PYTHON("Python"),
    JAVA_SCRIPT("JavaScript"),
    GEOGRAPHY("Geography");

    private final String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    static Subject fromString(String name) {
        return Arrays.stream(values())
                .filter(subject -> subject.getSubjectName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Illegal string argument: " + name));
    }

}
