package com.milko.training.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(path = "/",  method = RequestMethod.GET)
	public String hello() {
		return "Hello world";
	}
}
