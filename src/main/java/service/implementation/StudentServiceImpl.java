package service.implementation;

import entity.Student;
import org.springframework.stereotype.Service;
import repo.StudentRepo;
import services.StudentService;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents(){
        return this.studentRepo.findAll();
    }
}
