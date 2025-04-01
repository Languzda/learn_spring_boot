package com.learnspring.cruddemo;

import com.learnspring.cruddemo.dao.StudentDAO;
import com.learnspring.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudents(studentDAO);

//			readStudent(studentDAO);
//			readAllStudents(studentDAO);
//			readStudentByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudent(studentDAO);
//			readAllStudents(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int deleted = studentDAO.deleteAll();
		System.out.println("Deleted students: " + deleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId=3;
		System.out.println("Deleted student with id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student studentToUpdate = studentDAO.findById(1);
		studentToUpdate.setFirstName("Scooby");
		studentDAO.update(studentToUpdate);
		System.out.println("Updated student: " + studentToUpdate);
	}

	private void readStudentByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Joe");

		students.forEach(System.out::println);
	}

	private void readAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();

		students.forEach(System.out::println);
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new Student object");
		Student tempStudent = new Student("Paul", "Doe", "paul@lov.com");

		System.out.println("Saving Student Object");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		System.out.println("Saved id student: " + theId);

		Student student = studentDAO.findById(theId);
		System.out.println(student);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		System.out.println("Creating 3 Student object..");
		Student tempStudent1 = new Student("Paul1", "Doe", "paul1@lov.com");
		Student tempStudent2 = new Student("Paul2", "Doe", "paul2@lov.com");
		Student tempStudent3 = new Student("Paul3", "Doe", "paul3@lov.com");

		System.out.println("Saving Student Objects");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		System.out.println("Saved student: " + tempStudent1.getId());
		System.out.println("Saved student: " + tempStudent2.getId());
		System.out.println("Saved student: " + tempStudent3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new Student object");
		Student tempStudent = new Student("Paul", "Joe", "paul@lov.com");

		System.out.println("Saving Student Object");
		studentDAO.save(tempStudent);

		System.out.println("Saved student: " + tempStudent.getId());

	}

}
