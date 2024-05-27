package alexdev.school.service;

import alexdev.school.domain.GetStudentsBySchoolUseCase;
import alexdev.school.domain.School;
import alexdev.school.domain.SchoolRepository;
import alexdev.school.dto.SchoolStudents;
import alexdev.school.dto.Student;
import alexdev.school.exception.SchoolNotFoundException;
import alexdev.school.httpClient.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetStudentsBySchoolService implements GetStudentsBySchoolUseCase {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;

    @Override
    public SchoolStudents get(Long schoolId) {
        School school = schoolRepository
                .findById(schoolId)
                .orElseThrow(() -> new SchoolNotFoundException(schoolId));
        List<Student> students = studentClient.getStudentsBySchoolId(schoolId);
        return SchoolStudents.createFrom(school, students);
    }
}
