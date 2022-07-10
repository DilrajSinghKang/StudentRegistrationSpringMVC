package com.mthree.dao;

import java.util.List;

import com.mthree.model.Student;

public interface IDao {

	void saveStudent(Student emp);
	void modifyStudent(Student emp);
	// behind screen fire these following commands
	public List<Student> getAllStudents(); 	 // select * from employee
	public Student getStudentById(int empid);  // select * from employee where id=empid
	public String getStudentNameById(int empid);// select fname from employee where id=empid
	int getStudentCount();						 // select count(*) from employee

}
