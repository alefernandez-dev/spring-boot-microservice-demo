package alexdev.student.web;

import java.io.Serializable;

public record StudentSchoolResponse(
        String firstname,
        String lastname,
        String phone,
        SchoolResponse school
) implements Serializable {
    public static record SchoolResponse(String name, String address, String phone) implements Serializable {}

}
