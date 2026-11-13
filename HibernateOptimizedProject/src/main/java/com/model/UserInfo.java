package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class UserInfo {
	
	@Id
	private Integer id;
	private String name;

	public UserInfo()
	{
		System.out.println("Object Created");
	}

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
		return "UserInfo [id=" + id + ", name=" + name + "]";
	}
}
