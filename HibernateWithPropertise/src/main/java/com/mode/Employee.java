package com.mode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {
	
	@Id
	private Integer eid;
	private String ename;
	
	public Employee()
	{
		System.out.println("Object Created for Employee");
	}
	
	public Employee(Integer eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
