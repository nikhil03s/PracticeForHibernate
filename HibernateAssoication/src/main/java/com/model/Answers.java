package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answers {
	
	@Id
	@Column(name = "anser_id")
	private Integer id;
	private String answer;
	
	public Answers()
	{
		System.out.println("Created Answer");
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answers [id=" + id + ", answer=" + answer + "]";
	}
	
}
