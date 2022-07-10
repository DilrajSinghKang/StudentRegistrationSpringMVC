package com.mthree.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mthree.model.Student;

@Component(value = "dao") //if comment not registered as spring, empDao not aware of it
public class StudentDao implements IDao {
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	@Autowired
	private JdbcTemplate template;
	@Transactional(propagation = Propagation.REQUIRES_NEW)//REQUIRED)//SUPPORTS)//As there is an existing transaction, which is started at the service layer, this method will support the same transaction
	@Override
	public void saveStudent(Student stu) {
		System.out.println("Employee will get persisted" + stu);
//		System.out.println("Inside Dao layer"); taken away yet to put in separate module
		String insert = "Insert into student(id,fname,age,mobile,address) values (?,?,?,?,?)";
		template.update(insert,stu.getId(),stu.getFname(),stu.getAge(),stu.getMobile(),stu.getAddress());
	}

	@Override
	public void modifyStudent(Student stu) {
		System.out.println("Inside Dao layer");
	}

	@Override
	public List<Student> getAllStudents() {
		String select = "SELECT * FROM Student";
		List<Student> employees = template.query(select, new StudentRowMapper());
				//BeanPropertyRowMapper<Employee>(Employee.class));//directly give list of employee
		return employees;	//return is list of employees
	}

	@Override
	public Student getStudentById(int empid) {
		String select = "SELECT * FROM Student where ID=?";
		return template.queryForObject(select,new Object[]{empid},new StudentRowMapper());
	}

	@Override
	public String getStudentNameById(int empid) {
		String select = "SELECT fname FROM Student where ID=?";
		return template.queryForObject(select, String.class, empid);
	}

	@Override
	public int getStudentCount() {
		String select = "SELECT count(*) FROM Student";
		return template.queryForObject(select, Integer.class);
	}

}

