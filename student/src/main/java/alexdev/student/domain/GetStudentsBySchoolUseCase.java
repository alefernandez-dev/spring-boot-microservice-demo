package alexdev.student.domain;

import java.util.List;

public interface GetStudentsBySchoolUseCase {
    List<Student> get(Long schoolId);
}
