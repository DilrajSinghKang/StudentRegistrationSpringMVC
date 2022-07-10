package com.mthree.model;
import com.mthree.service.IService;
import com.mthree.validation.StudentVlidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import org.eclipse.jdt.internal.compiler.env.IModule.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
public class StudentController {
	@Autowired //inject employee service inside employee controller
	private IService es;
	
	@RequestMapping(method = RequestMethod.GET, value = "/saveemp.htm")
	public String showEmpForm(Map<String, Student> map) {
		System.out.println("Inside showEmpForm of Employee controller");
		map.put("emp", new Student());
		return "empForm";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/saveemp.htm")
//	public String persistEmployee(int id, String fname, String lname, Map<String, Employee> map){
	public String persistStudent(@ModelAttribute("emp") Student e, BindingResult result, Map<String, Student> map) {
	System.out.println("Inside peersisStudent of Student Controller");
//		System.out.println(id + " " + fname + " " + lname);
//		Employee e = new Employee(id, fname, lname);
		System.out.println(e);
		map.put("stu", e);
		List<Student> list=new ArrayList<>();
		list.add(e);
		StudentVlidator val = new StudentVlidator();
		val.validate(e, result);
		if(result.hasErrors()) {
			return "empForm";
		}
		es.saveStudents(list);
		return "success";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/changeLocale.htm")
	public String selectLanguage(@RequestParam("lang") String language, HttpServletRequest req, Map<String, Student> map) {
		System.out.println("Inside select language of Employee Controller" +language);
		HttpSession session = req.getSession();
		session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,new Locale(language));
		map.put("stu", new Student());
		return "redirect:saveemp.htm";
	}
}
