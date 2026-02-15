package in.akash.service;

import in.akash.entity.Course;
import in.akash.entity.Student;
import in.akash.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Courseservice {

    @Autowired
    CourseRepository courseRepository;

    public Course savecourse(Course course)
    {
        return courseRepository.save(course);
    }

    public Course findById(Integer Id)
    {
        return courseRepository.findById(Id).get();
    }

    public void deletebyid(Integer Id)
    {
        courseRepository.deleteById(Id);
    }

}
