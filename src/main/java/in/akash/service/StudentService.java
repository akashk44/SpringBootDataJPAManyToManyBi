package in.akash.service;

import in.akash.entity.Student;
import in.akash.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student savestudent(Student student)
    {
        return studentRepository.save(student);
    }

    public Student findbyid(Integer Id)
    {
        return studentRepository.findById(Id).get();
    }

}
