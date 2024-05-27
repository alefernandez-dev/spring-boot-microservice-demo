package alexdev.school.service;

import alexdev.school.domain.ListAllSchoolsUseCase;
import alexdev.school.domain.School;
import alexdev.school.domain.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListAllSchoolsService implements ListAllSchoolsUseCase {

    private final SchoolRepository repository;

    @Override
    public List<School> list() {
        return (List<School>) repository.findAll();
    }
}
