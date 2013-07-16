package com.beingjavaguys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beingjavaguys.domain.Student;
import com.beingjavaguys.domain.StudentImpl;

@Controller
public class Home {
	
	@Autowired
	private Student student;

	@RequestMapping("/hello")
		public ModelAndView hello(){
		
		return new ModelAndView("hello","name",student.getStudentDetails());
		}
}
