package com.employee;

public class PartTimeEmployee extends Employee{
	private double hoursWorked;
	private double hoursRate;
	
	public PartTimeEmployee(String name, int id, double hoursWorked, double hoursRate)
	{
		super(name,id);
		this.hoursRate=hoursRate;
		this.hoursWorked=hoursWorked;
	}
	
	public double calculateSalary()
	{
		return hoursRate*hoursWorked;
	}

	@Override
	public String getEmpType() {
		return "PartTime";
	}
}
