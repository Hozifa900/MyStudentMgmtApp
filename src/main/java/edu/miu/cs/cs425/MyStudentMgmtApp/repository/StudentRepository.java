package edu.miu.cs.cs425.MyStudentMgmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
