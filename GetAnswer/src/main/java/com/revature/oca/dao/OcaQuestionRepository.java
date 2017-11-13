package com.revature.oca.dao;

import org.springframework.data.repository.CrudRepository;

import com.revature.oca.bean.Questions;

public interface OcaQuestionRepository extends CrudRepository<Questions, Integer> {

}