package alexdev.student.httpClient;

import alexdev.student.dto.School;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "schools", url = "${application.config.school-url}")
public interface SchoolClient {

    @GetMapping("/{schoolId}")
    School find(@PathVariable Long schoolId);

}
