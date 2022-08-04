package banco_relacional.teste.entities;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @EnabledOnOs(OS.LINUX)
    @EnabledIfEnvironmentVariable(named = "USER", matches = "thiago_projuris")
    @Test
    void groupedAssertions() {
        Student student = new Student(1L, "Thiago", "Joinville");
        student.setCourse(new Course(1L, "Artes", "5B"));

        assertAll("Testing Student class",
                () -> assertEquals("Thiago", student.getName()),
                () -> assertEquals("Joinville", student.getCity()),
                () -> assertEquals("Artes", student.getCourse().getCourseName()));
    }
}