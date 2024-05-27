package alexdev.student.web;

import java.io.Serializable;

public record StudentResponse(Long id, String firstname, String lastname, String phone, Long schoolId)
        implements Serializable {}
