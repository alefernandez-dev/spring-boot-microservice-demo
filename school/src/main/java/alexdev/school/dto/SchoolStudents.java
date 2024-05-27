package alexdev.school.dto;

import alexdev.school.domain.School;

import java.util.List;

public record SchoolStudents(String name, String address, String phone, List<Student> students) {
    public static SchoolStudents createFrom(School school, List<Student> students) {
        return new SchoolStudents(school.getName(), school.getAddress(), school.getPhone(), students);
    }
}
