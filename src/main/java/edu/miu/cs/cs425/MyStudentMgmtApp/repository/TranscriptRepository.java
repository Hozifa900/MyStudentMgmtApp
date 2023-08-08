package edu.miu.cs.cs425.MyStudentMgmtApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Transcript;

public interface TranscriptRepository extends JpaRepository<Transcript, Long> {

}
