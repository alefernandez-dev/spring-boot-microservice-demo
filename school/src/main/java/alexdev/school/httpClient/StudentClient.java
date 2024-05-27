package alexdev.school.httpClient;

import alexdev.school.dto.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "students", url = "${application.config.student-url}")
public interface StudentClient {

    @GetMapping("/school/{schoolId}")
    public List<Student> getStudentsBySchoolId(@PathVariable Long schoolId);

}
