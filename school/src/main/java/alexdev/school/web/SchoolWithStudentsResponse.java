package alexdev.school.web;

import java.io.Serializable;
import java.util.List;

public record SchoolWithStudentsResponse(String name, String address, String phone, List<StudentResponse> students)
        implements Serializable {
    public static record StudentResponse(Long id, String firstname, String lastname) implements Serializable {}
}
