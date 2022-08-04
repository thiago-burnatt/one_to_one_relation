package banco_relacional.teste.controllers;

import banco_relacional.teste.entities.Student;
import banco_relacional.teste.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping
    public Student insert(@RequestBody Student student) {
        student.setCourse(student.getCourse());
        return studentService.insert(student);
    }
}
