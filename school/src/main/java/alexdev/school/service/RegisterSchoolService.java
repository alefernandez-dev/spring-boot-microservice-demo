package alexdev.school.service;

import alexdev.school.domain.RegisterSchoolUseCase;
import alexdev.school.domain.School;
import alexdev.school.domain.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class RegisterSchoolService implements RegisterSchoolUseCase {

    private final SchoolRepository repository;

    @Override
    public void register(School school) {
        repository.save(school);
    }
}
