package alexdev.student.service;

import alexdev.student.domain.ListAllStudentsUseCase;
import alexdev.student.domain.Student;
import alexdev.student.domain.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListAllStudentsService implements ListAllStudentsUseCase {

    private final StudentRepository repository;

    @Override
    public List<Student> list() {
        return (List<Student>) repository.findAll();
    }
}
