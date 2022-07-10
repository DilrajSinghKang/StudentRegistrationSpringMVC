package com.mthree.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mthree.model.Student;

public class StudentVlidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Student.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("Inside validate of Employee Validator");
		ValidationUtils.rejectIfEmpty(errors, "fname", "fname.error");
	}

}
