package alexdev.student.dto;

import alexdev.student.domain.Student;

public record StudentSchool(
        String firstname,
        String lastname,
        String phone,
        School school
) {
    public static StudentSchool createFrom(Student student, School school) {
        return new StudentSchool(
                student.getFirstname(),
                student.getLastname(),
                student.getPhone(),
                school);
    }
}
