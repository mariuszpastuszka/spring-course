package pl.mpas.grade_books.domain;

import java.util.Arrays;

public enum Grade {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6);

    private final int grade;

    Grade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public static Grade fromInt(int grade) {
        return Arrays.stream(values())
                .filter(enumGrade -> grade == enumGrade.getGrade())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Illegal grade: " + grade));
    }

}
