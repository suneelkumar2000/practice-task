package com.task.functions;

import java.util.Scanner;
/*Ask user to enter age, gender( M or F ), marital status ( Y or N ) and then using
following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".
*/

public class EmployeeService {
	public void service(char gender, int age) {
		if (gender == 'M') {
			if ((age >= 20) && (age < 40)) {
				System.out.println("You may work Anywhere");
			} else if ((age >= 40) && (age < 60)) {
				System.out.println("You will be work in Urban areas only");
			} else {
				System.out.println("Error");
			}
		} else if (gender == 'F') {
			System.out.println("You will be work in Urban areas only");
		} else {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		System.out.println("Enter your gender (M or F):");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your marital status (Y or N):");
		char marital = sc.next().charAt(0);
		if (marital == 'Y') {
			EmployeeService es = new EmployeeService();
			es.service(gender, age);
		} else {
			System.out.println("Error");
		}
	}
}
