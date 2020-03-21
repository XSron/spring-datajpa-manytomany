package edu.mum.cs.cs425.manytomany;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.manytomany.model.Classroom;
import edu.mum.cs.cs425.manytomany.model.Student;
import edu.mum.cs.cs425.manytomany.service.IStudentService;

@SpringBootApplication
public class ManytomanyApplication implements CommandLineRunner {
	@Autowired
	private IStudentService studentService;
	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Classroom c1 = new Classroom("M0002", "Mclaughin");
		Classroom c2 = new Classroom("V0001", "Verill Hall");
		
		Student s1 = new Student("AAA", Arrays.asList(c1, c2));
		Student s2 = new Student("BBB", Arrays.asList(c1));
		studentService.saveStudent(Arrays.asList(s1, s2));
	}

}
