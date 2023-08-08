package edu.miu.cs.cs425.MyStudentMgmtApp.service.impl;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Student;
import edu.miu.cs.cs425.MyStudentMgmtApp.repository.StudentRepository;
import edu.miu.cs.cs425.MyStudentMgmtApp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);

    }

}
