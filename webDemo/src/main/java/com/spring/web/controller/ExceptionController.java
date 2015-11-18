package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	@RequestMapping("/error/500")
	public String generalError() {
		return "error/general";
	}

	@RequestMapping("/error/404")
	public String notFoundError() {
		return "error/404";
	}

}
