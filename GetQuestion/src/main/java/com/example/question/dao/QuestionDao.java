package com.example.question.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.question.beans.Questions;

public interface QuestionDao extends CrudRepository<Questions, Integer>{

}
