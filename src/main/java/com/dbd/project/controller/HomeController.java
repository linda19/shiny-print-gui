package com.dbd.project.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dbd.project.config.SpringMongoConfig;
import com.dbd.project.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String logMeIn(@ModelAttribute(value = "loginEmail") String theEmail,
			@ModelAttribute(value = "loginPassword") String thePassword,
			BindingResult result,
			Model model) {
		
		if(theEmail.equals("adm") && thePassword.equals("adm")) {
			return "admin";
		} else {

			ApplicationContext ctx = 
					new AnnotationConfigApplicationContext(SpringMongoConfig.class);
			MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

			Query identifyQuery = new Query();
			identifyQuery.addCriteria(Criteria.where("email").is(theEmail).and("password").is(thePassword));

			User loginStudent = mongoOperation.findOne(identifyQuery, User.class);

			if(loginStudent.getRole().equals("student") && loginStudent != null)
				return "student";
			else
				if(loginStudent.getRole().equals("admin") && loginStudent != null )
					return "admin";
			
			else return "home";			

		}
		
	}
	
}
