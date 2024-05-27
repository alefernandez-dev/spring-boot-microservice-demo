package alexdev.student.web;

import java.io.Serializable;

public record RegisterStudentRequest(String firstname, String lastname, String phone, Long schoolId)
        implements Serializable {}
