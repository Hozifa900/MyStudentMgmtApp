package edu.miu.cs.cs425.MyStudentMgmtApp.service.impl;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Course;
import edu.miu.cs.cs425.MyStudentMgmtApp.repository.CourseRepository;
import edu.miu.cs.cs425.MyStudentMgmtApp.service.CourseService;

@Service
public class CourseRepositoryImpl implements CourseService {
    private CourseRepository courseRepository;

    CourseRepositoryImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course saveCourse(Course course) {
        try {
            return courseRepository.save(course);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
