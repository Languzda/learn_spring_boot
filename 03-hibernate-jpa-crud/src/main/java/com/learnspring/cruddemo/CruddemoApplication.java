package com.learnspring.cruddemo;

import com.learnspring.cruddemo.dao.StudentDAO;
import com.learnspring.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new Student object");
		Student tempStudent = new Student("Paul", "Doe", "paul@lov.com");

		System.out.println("Saving Student Object");
		studentDAO.save(tempStudent);

		System.out.println("Saved student: " + tempStudent.getId());

	}

}
