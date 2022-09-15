package com.jpasample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewfileController {

	@GetMapping("/")
	public String newfile() {
		return "newfile";
	}
}
