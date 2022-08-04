package banco_relacional.teste.repositories;

import banco_relacional.teste.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
