package com.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.*;

@Entity
public class Students {
	
	@Id
	@Column(name = "stud_id")
	private Integer id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Books> books;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", books=" + books + "]";
	}

	public List<Books> getBooks() {
		return books;
	}

	public void setBooks(List<Books> books) {
		this.books = books;
	}

	public Students() {System.out.println("Created Student");}
	
}
