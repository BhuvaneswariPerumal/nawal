package com.nawalRepo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NawalController {
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	public String getAll() {
		return "Welcome my boy";
	}

}
