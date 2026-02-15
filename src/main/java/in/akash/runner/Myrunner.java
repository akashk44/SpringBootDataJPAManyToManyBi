package in.akash.runner;

import in.akash.entity.Course;
import in.akash.entity.Student;
import in.akash.service.Courseservice;
import in.akash.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Myrunner implements ApplicationRunner {

    @Autowired
    Courseservice courseservice;

    @Autowired
    StudentService studentService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

       // saveStudentWithCourse();
       // saveCourseWithStudent();
        deletebycourseid();


    }

    private void deletebycourseid() {
        courseservice.deletebyid(101);
    }

    private void saveCourseWithStudent() {

        Course course = new Course();
        course.setCourseId(102);
        course.setCoursename("javac");

        Student student1 = new Student();
        student1.setName("ajit");
        student1.getCourses().add(course);

        Student student2 = new Student();
        student2.setName("Akshit");
        student2.getCourses().add(course);

        course.getStudents().add(student1);
        course.getStudents().add(student2);

        courseservice.savecourse(course);

    }

    private void saveStudentWithCourse() {

        Student student = new Student();
        student.setName("akash");

        Course javacouse = new Course();
        javacouse.setCoursename("Java");
        javacouse.setCourseId(101);

        Course pythoncourse = new Course();
        pythoncourse.setCoursename("python");
        pythoncourse.setCourseId(102);

        Course springbootcourse = new Course();
        springbootcourse.setCoursename("Springboot");
        springbootcourse.setCourseId(103);

        student.getCourses().add(javacouse);
        student.getCourses().add(pythoncourse);
        student.getCourses().add(springbootcourse);
        System.out.println(studentService.savestudent(student));

    }
}
