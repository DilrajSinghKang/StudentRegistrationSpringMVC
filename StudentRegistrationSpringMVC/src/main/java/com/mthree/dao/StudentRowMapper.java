package com.mthree.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mthree.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNumber) throws SQLException {
		System.out.println("Inside mapRow" + rowNumber);
		int id = rs.getInt("id"); 
		String fname = rs.getString("fname");
		String age = rs.getString("age");
		String mobile = rs.getString("mobile");
		String address = rs.getString("address");
		Student e = new Student(id,fname,age,mobile,address);
		return e;
	}

}
/*
package com.mthree.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mthree.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNumber ) throws SQLException {
		System.out.println("Inside mapRow" + rowNumber);
		int id = rs.getInt("id"); 
		String fname = rs.getString("fname");
		String lname = rs.getString("lname");
		//Employee
		return null;
	}
}

*/