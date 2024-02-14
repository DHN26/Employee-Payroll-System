package com.employee;

abstract public class Employee {
	private String name;
	private int id;
	
	public abstract double calculateSalary();
	public abstract String getEmpType();
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Salary=" + calculateSalary() +", Employee type="+getEmpType()+ "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
}
