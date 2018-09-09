package pl.mpas.grade_books.exception;

public class PupilNotEnrolledOnSubject extends RuntimeException {

    public PupilNotEnrolledOnSubject() {
        super();
    }

    public PupilNotEnrolledOnSubject(String message) {
        super(message);
    }

    public PupilNotEnrolledOnSubject(String message, Throwable cause) {
        super(message, cause);
    }

}
