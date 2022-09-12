package com.jpasample.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.jpasample.model.Comment;
import com.jpasample.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

	private final CommentRepository repository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		var comment = new Comment();
		comment.setComment("こんにちは");
		repository.save(comment);
		
		var testComment = new Comment();
		testComment.setComment("テストコメント");
		repository.save(testComment);
	}
	
}
