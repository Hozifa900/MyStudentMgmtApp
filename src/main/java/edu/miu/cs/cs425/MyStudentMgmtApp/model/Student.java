package edu.miu.cs.cs425.MyStudentMgmtApp.model;

import java.time.LocalDate;
import java.util.List;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private Long transcriptId;
    @NonNull
    private String studentNumber;
    @NonNull
    private String firstName;
    private String middleName;
    @NonNull
    private String lastName;
    private double cgpa;
    private LocalDate dateOfEnrollment;
    @OneToOne
    @JoinColumn
    private Transcript transcript;
    @ManyToMany
    private List<Course> course;
    @ManyToOne
    @JoinColumn
    private Classroom classroom;

    public Student() {

    }

    public Student(Long studentId, Long transcriptId, String studentNumber, String firstName, String middleName,
            String lastName,
            double cgpa) {
        super();
        this.studentId = studentId;
        this.transcriptId = transcriptId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
    }

    // getters and setters
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // toString method
    @Override
    public String toString() {
        return "StudentModel [studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName
                + ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + "]";
    }

}