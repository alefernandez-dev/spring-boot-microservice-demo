package alexdev.school.web;

import java.io.Serializable;

public record RegisterSchoolRequest(String name, String address, String phone)
        implements Serializable {}
