package alexdev.school.web;

import java.io.Serializable;

public record SchoolResponse(Long id, String name, String address, String phone)
        implements Serializable {}
