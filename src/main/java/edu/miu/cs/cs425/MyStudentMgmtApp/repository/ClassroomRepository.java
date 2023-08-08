package edu.miu.cs.cs425.MyStudentMgmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

}
