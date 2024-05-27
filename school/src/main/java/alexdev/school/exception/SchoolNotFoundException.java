package alexdev.school.exception;

public class SchoolNotFoundException extends RuntimeException{
    public SchoolNotFoundException(Long  schoolId) {
        super("School with id " + schoolId + " not found");
    }
}
