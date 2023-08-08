package edu.miu.cs.cs425.MyStudentMgmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
