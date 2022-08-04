package banco_relacional.teste.services.interfaces;

import banco_relacional.teste.entities.Student;

import java.util.List;

public interface StudentService{
    Student insert(Student student);
    List<Student> findAll();
    Student save(Student student);
}
