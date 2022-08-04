package banco_relacional.teste.controllers;

import banco_relacional.teste.entities.Course;
import banco_relacional.teste.services.interfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Course> findById(@PathVariable Long id) {
        return courseService.findById(id);
    }

    @PostMapping
    public Course insert(@RequestBody Course course) {
        return courseService.insert(course);
    }
}
