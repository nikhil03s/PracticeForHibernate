package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Questions {
	
	@Id
	@Column(name = "question_id")
	private Integer id;
	private String question;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Answers answer;
	
	public Questions()
	{
		System.out.println("Created Question");
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answers getAnswer() {
		return answer;
	}
	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Questions [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}

}
