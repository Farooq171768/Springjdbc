package cgg.spring.jdbc.dao;

import java.util.List;

import cgg.spring.jdbc.entities.Student;

public interface StudentDao {

	int insert(Student student) ;
	int change(Student student);
	int delete(int studentId);
	Student getStudent(int studentId);
	List<Student> getAllStudents();
}
