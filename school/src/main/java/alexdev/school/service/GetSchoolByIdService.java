package alexdev.school.service;

import alexdev.school.domain.GetSchoolByIdUseCase;
import alexdev.school.domain.School;
import alexdev.school.domain.SchoolRepository;
import alexdev.school.exception.SchoolNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetSchoolByIdService implements GetSchoolByIdUseCase {

    private final SchoolRepository repository;

    @Override
    public School find(Long schoolId) {
        return repository.findById(schoolId)
                .orElseThrow(() -> new SchoolNotFoundException(schoolId));
    }
}
