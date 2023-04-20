package com.task.functions;
/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
*/

import java.util.Scanner;

public class EmployeeBonus {
	public void bonus(double service) {
		if(service>5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your salary:");
			double salary = sc.nextDouble();
			double bonus = salary / 100 * 5;
			System.out.println("Your Bonus is "+bonus);
		}
		else {
			System.out.println("Sorry NO Bonus");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your year of service:");
		double service = sc.nextDouble();
		EmployeeBonus employee = new EmployeeBonus();
		employee.bonus(service);
	}

}
