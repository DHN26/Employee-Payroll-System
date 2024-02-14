package com.employee;

import java.util.ArrayList;

public class PaymentSystem {
	private ArrayList<Employee> employeeList;

	public PaymentSystem() {
		employeeList=new ArrayList<>();
	}
	
	public void addEmployee(Employee employee)
	{
		employeeList.add(employee);
	}
	

	
	public boolean removeEmployee(int id)
	{
		boolean val=false;
		for(Employee emp: employeeList)
		{
			if(emp.getId()==id)
			{
				employeeList.remove(emp);
				val=true;
				break;
			}
		}
		return val;
	}
	
	public void displayEmployee()
	{
		for(Employee emp : employeeList)
		{
			System.out.println(emp);
		}
	}
	
}

//public void removeEmployee(int id)
//{
//	Employee employeeToRemove=null;
//	for(Employee emp : employeeList)
//	{
//		if(emp.getId()==id)
//		{
//			employeeToRemove=emp;
//			break;
//		}
//	}
//	
//	if(employeeToRemove!=null)
//	{
//		employeeList.remove(employeeToRemove);
//	}
//}
//
