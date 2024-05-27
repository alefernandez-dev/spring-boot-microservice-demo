package alexdev.student.service;

import alexdev.student.domain.RegisterStudentUseCase;
import alexdev.student.domain.Student;
import alexdev.student.domain.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RegisterStudentService implements RegisterStudentUseCase {

    //private final StudentRepository repository;
    private final StudentRepository repository;

    public RegisterStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void register(Student student) {
        repository.save(student);
    }
}
