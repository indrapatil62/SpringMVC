package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@Controller
public class ContactController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value="/")
	public String form1() {

		return "index";
	}

	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String process(@ModelAttribute Student st, Model m) {
		int id = this.studentService.createStudent(st);
		m.addAttribute("msg", "Record Added Successfully");
		return "contact";
	}

}