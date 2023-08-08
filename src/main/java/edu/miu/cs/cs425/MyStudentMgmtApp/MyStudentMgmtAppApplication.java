package edu.miu.cs.cs425.MyStudentMgmtApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs.cs425.MyStudentMgmtApp.model.Student;
import edu.miu.cs.cs425.MyStudentMgmtApp.service.StudentService;

@SpringBootApplication

public class MyStudentMgmtAppApplication implements CommandLineRunner {
	private StudentService studentService;

	MyStudentMgmtAppApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		Student student = new Student(1L, null, "000-61-0001", "Anna", "Lynn", "Smith", 3.45);
		Student studentSaved = studentService.saveStudent(student);
		System.out.println(studentSaved);
		System.out.println("after saving student");
		// throw new UnsupportedOperationException("Unimplemented method 'run'");
	}

}
