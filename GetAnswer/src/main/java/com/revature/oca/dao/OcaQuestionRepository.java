package com.revature.oca.dao;

import org.springframework.data.repository.CrudRepository;

import com.revature.oca.bean.OcaQuestion;

public interface OcaQuestionRepository extends CrudRepository<OcaQuestion, Integer> {

}