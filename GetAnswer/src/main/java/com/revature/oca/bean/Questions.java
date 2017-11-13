package com.revature.oca.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Questions implements Serializable{

	private static final long serialVersionUID = 8782607346120328938L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OCA_QUESTION_SEQ")
	@SequenceGenerator(sequenceName = "oca_question_seq", allocationSize = 1, name = "OCA_QUESTION_SEQ")
	private int id;
	
	@Column(name = "QUESTION")
	private String question;
	
	@Column(name = "ANSWER")
	private String answer;
	
	public Questions () {
		
	}

	public Questions(int id, String question, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "OcaQuestion [questionId=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
}
