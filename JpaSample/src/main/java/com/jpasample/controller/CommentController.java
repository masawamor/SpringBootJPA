package com.jpasample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpasample.model.Comment;
import com.jpasample.repository.CommentRepository;

@Controller
public class CommentController {
	
	private final CommentRepository repositoty;
	
	public CommentController(CommentRepository repositry) {
		this.repositoty = repositry;
	}
	
	@GetMapping("/")
	public String getAllComments(@ModelAttribute Comment comment, @ModelAttribute Model model) {
		model.addAttribute("", repositoty.findAll());
		return "list";
	}
	
	@PostMapping("/add")
	public String addComment(@ModelAttribute Comment comment, BindingResult result, Model model) {
		model.addAttribute("comments", repositoty.findAll());
		if (result.hasErrors()) {
			return "list";
		}
		repositoty.save(comment);
		return "redirect:/";
	}
}
