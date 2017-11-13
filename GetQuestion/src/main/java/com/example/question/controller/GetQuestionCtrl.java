package com.example.question.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.question.beans.Questions;
import com.example.question.dao.QuestionDao;

@RestController
public class GetQuestionCtrl {

	@Autowired
	DataSource dataSource;

	@Autowired
	QuestionDao QuestionRepository;

	@Transactional(readOnly = true)
	@PostMapping("/getQuestion")
	public Questions getScore(@RequestBody Questions question) {
		return QuestionRepository.findOne(question.getId());
	}

	@GetMapping("/getQuestion")
	public Questions getStringScore() {
		return QuestionRepository.findOne(1);
	}
}
