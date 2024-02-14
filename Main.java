package com.employee;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello and Welcome to Employee Payroll System🙏");
		int n = 0;

		PaymentSystem pay = new PaymentSystem();
		FullTimeEmployee emp1;
		PartTimeEmployee emp2;
		System.out.println("These are the services I provide😁 : ");
		while (n <= 3) {
			System.out.println("1-->Insertion 2-->Deletion 3-->Displaying. Others for exit.");
			n = scan.nextInt();

			if (n == 1) {
				System.out.println("It seems you hired new employee😜. Is this person work as Fulltime or Parttime employee?");
				String res = scan.next();
				System.out.println("Tell me the details of the new sheep😂");
				if (res.equals("ft")) {
					emp1 = new FullTimeEmployee(scan.next(), scan.nextInt(), scan.nextDouble());
					pay.addEmployee(emp1);
				} else {
					emp2 = new PartTimeEmployee(scan.next(), scan.nextInt(), scan.nextDouble(), scan.nextDouble());
					pay.addEmployee(emp2);
				}
				System.out.println("Employee added successfully!");

			}

			else if (n == 2) {
				System.out.println("Ohh ohh, someone got fired it seems😥. Tell me the id of this person:(");
				int removeId = scan.nextInt();
				boolean val = pay.removeEmployee(removeId);
				if (val)
					System.out.println("Employee deleted successfully!");
				else
					System.out.println("Employee doesnot exist!");
			}

			else if (n == 3) {
				System.out.println("You want to see how big your empire is! Let me show you!!");
				pay.displayEmployee();
			}
		}

		System.out.println("Thank you for your time:)");

	}

}
