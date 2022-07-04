package com.greatlearning.student.controller;

import org.springframwork.beans.factory.annotation.Autowired;
import org.springframeworkstereotype.Controller;
import org.springframework.ui.model;
import org springframework.webbind annotation.Requestmapping

import com.greatlearning.student.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
 
	@Autowired
	private BookService bookService;
	
	@RequestMapping("\list")
	public Sring find all(Model model)
	
	{
		list<student>studentList=StudentService.findAll();
		model.addAttribute(bookList,bookList);
		{
			System.out.println(s);
		}
		Return "Students";
		@Requestmapping("/save")
		public String save(@Requestparam("name")String name,@Requestparam(Department)String department,
				@requestparam("Country")String country)
		Student s=new Student(name ,department, country)
		studentservice.save(s);
		return"redirect:student/list";
	   }
       @RequestMapping("/addstudent")
       public String addstudent()
         return "bookform";
		
		@Transactional
		public void save(Student student)
		{
			Transaction tr= session.beginTransaction;
			tr. commit();
		}
	}
}
