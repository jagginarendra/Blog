package com.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

	@RequestMapping(method = RequestMethod.GET, value = "/testBlog")
	public String getMessage() {

		return "Hello from Spring Boot";
	}
}
