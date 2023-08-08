package edu.miu.cs.cs425.MyStudentMgmtApp.service.impl;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Classroom;
import edu.miu.cs.cs425.MyStudentMgmtApp.repository.ClassroomRepository;
import edu.miu.cs.cs425.MyStudentMgmtApp.service.ClassroomService;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    private ClassroomRepository classroomRepository;

    ClassroomServiceImpl(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    @Override
    public Classroom saveClassroom(Classroom classroom) {
        try {
            return classroomRepository.save(classroom);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }

}
