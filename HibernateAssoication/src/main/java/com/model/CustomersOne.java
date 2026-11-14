package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CustomersOne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private String cname;
	
	private Products products;
	
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}

	public CustomersOne()
	{
		System.out.println("Object created for Customers");
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", products=" + products + "]";
	}

}
