package com.revature.oca.web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.oca.bean.Questions;
import com.revature.oca.dao.OcaQuestionRepository;

@RestController
public class GetCorrectAnswer {
	@Autowired
	DataSource dataSource;

	@Autowired
	OcaQuestionRepository ocaQuestionRepository;

	@Transactional(readOnly = true)
	@PostMapping("/getAnswer")
	public Questions getAnswer(@RequestBody Questions ocaQuestion) {
		return ocaQuestionRepository.findOne(ocaQuestion.getId());	//I have no idea what this is or where I access it
	}
}
