package com.dbd.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.dbd.project.dao.FileUploadDao;
import com.dbd.project.model.FileUpload;
import com.dbd.project.validator.FileUploadValidator;

/**
 * Handles the requests for application import feature.
 * 
 * @author anda
 */
public class FileUploadController extends SimpleFormController {
	@Autowired
	private FileUploadDao fileStorageDAOMongoImpl;
	@Autowired
	private FileUploadValidator validator;

	public FileUploadController() {
		setCommandClass(FileUpload.class);
		setCommandName("customerForm");
	}

	public ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		// cast the bean
		FileUpload bean = (FileUpload) command;

		// let's see if there's content there
		MultipartFile file = bean.getFile();
		validator.validate(bean, errors);
		// if we don;t have validation errors
		if (!errors.hasErrors()) {
			if (file == null) {
				return null;
			}
			fileStorageDAOMongoImpl.save(file.getInputStream(),
					file.getContentType(), file.getOriginalFilename());
		}
		// well, let's do nothing with the bean for now and return
		return super.onSubmit(request, response, command, errors);
	}

}
