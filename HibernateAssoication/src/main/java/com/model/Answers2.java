package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answers2 {
	
	@Id
	@Column(name = "anser_id")
	private Integer id;
	private String answer;
	@OneToOne
	private Questions questions;
	
	
	public Answers2()
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
		return "Answers2 [id=" + id + ", answer=" + answer + ", questions=" + questions + "]";
	}

	
}
