package com.revature.oca.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class OcaQuestion implements Serializable{

	private static final long serialVersionUID = 8782607346120328938L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OCA_QUESTION_SEQ")
	@SequenceGenerator(sequenceName = "oca_question_seq", allocationSize = 1, name = "OCA_QUESTION_SEQ")
	private int questionId;
	
	@Column(name = "QUESTION")
	private String question;
	
	@Column(name = "ANSWER")
	private String answer;
	
	public OcaQuestion () {
		
	}

	public OcaQuestion(int questionId, String question, String answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
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
		return "OcaQuestion [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
	
	
}
