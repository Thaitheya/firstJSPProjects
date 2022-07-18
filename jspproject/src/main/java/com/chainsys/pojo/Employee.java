package com.chainsys.pojo;

import java.io.Serializable;


public class Employee implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String name;
    private String city;
    private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}