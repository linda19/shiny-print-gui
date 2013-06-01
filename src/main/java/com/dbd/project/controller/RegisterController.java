package com.dbd.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dbd.project.config.SpringMongoConfig;
import com.dbd.project.model.User;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		return "register";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String registerUsers(@ModelAttribute(value = "fullname") String theName, 
			@ModelAttribute(value = "email") String theEmail,
			@ModelAttribute(value = "password") String thePassword,
			BindingResult result,
			Model model) {

		User myStudent = new User();
		myStudent.setName(theName);
		myStudent.setEmail(theEmail);
		myStudent.setPassword(thePassword);
		myStudent.setRole("student");

		logger.info("Student- Name: " + theName + ", Email: " + theEmail + " , Password: " + thePassword);

		if (result.hasErrors()) {
			return "error";
		} else {
			ApplicationContext ctx = 
					new AnnotationConfigApplicationContext(SpringMongoConfig.class);
			MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
			mongoOperation.save(myStudent);

			return "home";
		}
	}

}
