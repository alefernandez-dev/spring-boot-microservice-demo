package alexdev.student.web;

import alexdev.student.domain.*;
import alexdev.student.dto.StudentSchool;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final RegisterStudentUseCase registerStudentUseCase;
    private final ListAllStudentsUseCase listAllStudentsUseCase;
    private final GetStudentsBySchoolUseCase getStudentsBySchoolUseCase;
    private final GetStudentSchoolUseCase getStudentSchoolUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestBody RegisterStudentRequest registerStudentRequest) {
        Student newStudent = Student.builder()
                .firstname(registerStudentRequest.firstname())
                .lastname(registerStudentRequest.lastname())
                .phone(registerStudentRequest.phone())
                .schoolId(registerStudentRequest.schoolId())
                .build();
        registerStudentUseCase.register(newStudent);
    }

    @GetMapping
    public ResponseEntity<List<StudentResponse>> list() {
        List<StudentResponse> studentsResponse = listAllStudentsUseCase.list().stream()
                .map(this::studenToStudentResponse).toList();
        return ResponseEntity.ok(studentsResponse);
    }

    @GetMapping("/{studentId}/school")
    public ResponseEntity<StudentSchoolResponse> getSchool(@PathVariable Long studentId) {
        StudentSchool studentSchool = getStudentSchoolUseCase.get(studentId);
        return ResponseEntity.ok(new StudentSchoolResponse(
                studentSchool.firstname(),
                studentSchool.lastname(),
                studentSchool.phone(),
                new StudentSchoolResponse.SchoolResponse(
                        studentSchool.school().name(),
                        studentSchool.school().address(),
                        studentSchool.school().phone()
                )
        ));
    }

    @GetMapping("/school/{schoolId}")
    public ResponseEntity<List<StudentResponse>> studentsBySchoolId(@PathVariable Long schoolId) {
        List<StudentResponse> studentResponses = getStudentsBySchoolUseCase.get(schoolId).stream()
                .map(this::studenToStudentResponse).toList();
        return ResponseEntity.ok(studentResponses);
    }

    private StudentResponse studenToStudentResponse(Student student) {
        return new StudentResponse(
                student.getId(),
                student.getFirstname(),
                student.getLastname(),
                student.getPhone(),
                student.getSchoolId()
        );
    }

}
