package banco_relacional.teste.services.implementations;

import banco_relacional.teste.entities.Student;
import banco_relacional.teste.repositories.StudentRepository;
import banco_relacional.teste.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student insert(Student student) {
        Student result = studentRepository.save(student);
        return result;
    }

    @Override
    public List<Student> findAll() {
        List<Student> result = studentRepository.findAll();
        return result;
    }

    @Override
    public Student save(Student student) {
        return null;
    }
}
