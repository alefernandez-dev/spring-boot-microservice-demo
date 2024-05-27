package alexdev.school.domain;

import alexdev.school.dto.SchoolStudents;

public interface GetStudentsBySchoolUseCase {
    SchoolStudents get(Long schoolId);
}
