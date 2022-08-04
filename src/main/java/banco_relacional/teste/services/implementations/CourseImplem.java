package banco_relacional.teste.services.implementations;

import banco_relacional.teste.entities.Course;
import banco_relacional.teste.repositories.CourseRepository;
import banco_relacional.teste.services.interfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseImplem implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course insert(Course course) {
        Course result = courseRepository.save(course);
        return result;
    }

    @Override
    public List<Course> findAll() {
        List<Course> result = courseRepository.findAll();
        return result;
    }

    @Override
    public Optional<Course> findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Course save(Course course) {
        return null;
    }
}
