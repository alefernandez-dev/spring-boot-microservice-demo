package alexdev.student.service;

import alexdev.student.domain.GetStudentSchoolUseCase;
import alexdev.student.domain.Student;
import alexdev.student.domain.StudentRepository;
import alexdev.student.dto.School;
import alexdev.student.dto.StudentSchool;
import alexdev.student.exception.StudentNotFoundException;
import alexdev.student.httpClient.SchoolClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class GetStudentSchoolService implements GetStudentSchoolUseCase {

    private StudentRepository repository;
    private SchoolClient schoolClient;

    @Override
    public StudentSchool get(Long studentId) {
        Student student = repository.findById(studentId)
                .orElseThrow(() -> new StudentNotFoundException(studentId));
        School school = schoolClient.find(student.getSchoolId());
        return StudentSchool.createFrom(student, school);
    }
}
