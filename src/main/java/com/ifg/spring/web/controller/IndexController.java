package com.ifg.spring.web.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ifg.spring.model.Role;
import com.ifg.spring.model.User;
import com.ifg.spring.service.AccountService;

@Controller
public class IndexController {
	private static final Logger logger = Logger.getLogger(IndexController.class);

	
	@Autowired
	private AccountService accountService;

	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public ModelAndView index() {
		try {
			ModelAndView model = new ModelAndView();
			model.setViewName("index");
			
			
			
			
			model.setViewName("index");
			return model;
		} catch (Exception e) {
			logger.info("Exception:",e);			
			ModelAndView model = new ModelAndView();
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			User user = (User) authentication.getPrincipal();
			String role = "";
			for (Role r : user.getRoles()) {
				role = r.getName();
			}
			model.addObject("role", role);
			model.setViewName("index");
			return model;
		}
	}

}
