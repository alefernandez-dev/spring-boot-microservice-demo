package alexdev.student.service;

import alexdev.student.domain.GetStudentsBySchoolUseCase;
import alexdev.student.domain.Student;
import alexdev.student.domain.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetStudentsBySchoolService implements GetStudentsBySchoolUseCase {

    private StudentRepository studentRepository;

    @Override
    public List<Student> get(Long schoolId) {
        return studentRepository.findBySchoolId(schoolId);
    }
}
