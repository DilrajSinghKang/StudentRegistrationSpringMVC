package com.mthree.service;

import java.util.List;

import com.mthree.model.Student;

public interface IService {	//Interface is public and abstract so void

	void saveStudents(List <Student> list);	 // method name saveEmployee
	void modifyStudents(List <Student> list);  //service level agreement,rule, syntax, rule

	public List<Student> getAllStudents(); 	 // select * from employee
	public Student getStudentById(int empid);  // select * from employee where id=empid
	public String getStudentNameById(int empid);// select fname from employee where id=empid
	int getStudentCount();						 // select count(*) from employee

}
//pointcut is subset
//joincut superset