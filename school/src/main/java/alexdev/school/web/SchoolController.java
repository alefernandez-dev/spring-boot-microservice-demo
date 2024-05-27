package alexdev.school.web;

import alexdev.school.domain.*;
import alexdev.school.dto.SchoolStudents;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/school")
public class SchoolController {

    private final RegisterSchoolUseCase registerSchoolUseCase;
    private final ListAllSchoolsUseCase listAllSchoolsUseCase;
    private final GetStudentsBySchoolUseCase getStudentsBySchoolUseCase;
    private final GetSchoolByIdUseCase getSchoolByIdUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody RegisterSchoolRequest registerSchoolRequest) {
        School newSchool = School.builder()
                .name(registerSchoolRequest.name())
                .address(registerSchoolRequest.address())
                .phone(registerSchoolRequest.phone())
                .build();
        registerSchoolUseCase.register(newSchool);
    }

    @GetMapping
    public ResponseEntity<List<SchoolResponse>> list() {
        List<SchoolResponse> studentsResponse = listAllSchoolsUseCase.list().stream()
                .map(this::schoolToSchoolResponse).toList();
        return ResponseEntity.ok(studentsResponse);
    }

    @GetMapping("/{schoolId}")
    public ResponseEntity<SchoolResponse> find(@PathVariable Long schoolId) {
        School school = getSchoolByIdUseCase.find(schoolId);
        return ResponseEntity.ok(schoolToSchoolResponse(school));
    }

    @GetMapping("/{schoolId}/students")
    public ResponseEntity<SchoolWithStudentsResponse> findSchoolWithStudents(@PathVariable Long schoolId) {
        SchoolStudents schoolStudents = getStudentsBySchoolUseCase.get(schoolId);
        return ResponseEntity.ok(new SchoolWithStudentsResponse(
                schoolStudents.name(),
                schoolStudents.address(),
                schoolStudents.phone(),
                schoolStudents.students()
                        .stream()
                        .map(s -> new SchoolWithStudentsResponse.StudentResponse(
                                s.id(),
                                s.firstname(),
                                s.lastname()
                        ))
                        .toList()
        ));
    }

    private SchoolResponse schoolToSchoolResponse(School school) {
        return new SchoolResponse(
                school.getId(),
                school.getName(),
                school.getAddress(),
                school.getPhone()
        );
    }

}
