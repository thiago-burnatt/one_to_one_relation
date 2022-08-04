package banco_relacional.teste.services.interfaces;

import banco_relacional.teste.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Course insert(Course course);
    List<Course> findAll();

    Optional<Course> findById(Long id);

    Course save(Course course);
}
