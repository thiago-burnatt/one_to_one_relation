package banco_relacional.teste.repositories;

import banco_relacional.teste.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
