package com.mthree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mthree.model.Student; //service is dependent of dao that is why service is injected into DAO. business class is taking help of DAO class at some point? - going to do with data in this call DAO data access object
import com.mthree.dao.StudentDao;
import com.mthree.dao.IDao;

@Component(value = "service")
public class RenameService implements IService {
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Autowired //Enables automatic dependency injection and initializes empdao
	private IDao empDao; //loose coupling is achieved through interface
	// private EmployeeDao empdao; because initializes here, via independence injection// @Autowire not take place
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class) //As existing transaction is not present in main method, a new transaction will be started at the service layer
	@Override
	public void saveStudents(List<Student> list) {
	//	System.out.println("Inside service layer");//logging here simplest form of logging taken out, every thing happening but logging not taking place
		for(Student e:list) {
		empDao.saveStudent(e);// working because of independence injection
		}
	}

	@Override
	public void modifyStudents(List<Student> list) {
	System.out.println("Inside service layer");
	}

	@Override
	public List<Student> getAllStudents() {
		return empDao.getAllStudents();
	}

	@Override
	public Student getStudentById(int empid) {
		return empDao.getStudentById(empid);
	}

	@Override
	public String getStudentNameById(int empid) {
		return empDao.getStudentNameById(empid);
	}

	@Override
	public int getStudentCount() {
		return empDao.getStudentCount();
	}

}
