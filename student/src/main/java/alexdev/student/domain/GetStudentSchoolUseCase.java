package alexdev.student.domain;

import alexdev.student.dto.StudentSchool;

public interface GetStudentSchoolUseCase {
    StudentSchool get(Long studentId);
}
