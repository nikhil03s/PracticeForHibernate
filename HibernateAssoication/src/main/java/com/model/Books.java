package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	@Column(name = "book_id")
	private Integer id;
	
	private String book_name;
	

	public Books() { System.out.println("Created Books");	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", book_name=" + book_name + "]";
	}
}
