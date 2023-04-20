package com.task.functions;

import java.util.Scanner;
/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
Also decide to allow student to sit if he/she has medical cause.
Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/

public class StudentAttendence {
	public void eligibility(double percentage) {
		if (percentage < 75) {
			System.out.println("your attendence percentage is less than 75%.");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("do you have any medical cause ( Y or N ):");
			char medicalCause = sc.next().charAt(0);
			if (medicalCause == 'Y' || medicalCause == 'y') {
				if( percentage >= 50){
				System.out.println("you are allowed to sit in exam");
				}else {
					System.out.println("you are not allowed to sit in exam");
				}
			} else if ((medicalCause == 'N' || medicalCause == 'n')) {
				System.out.println("you are not allowed to sit in exam");
			} else {
				System.out.println("check your input ");
			}
		} else {
			System.out.println("you are allowed to sit in exam");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of classes held:");
		int classesHeld = sc.nextInt();
		System.out.println("Enter Number of  classes attended:");
		int classeAsttended = sc.nextInt();
		if (classeAsttended <= classesHeld) {
			double percentage = (classeAsttended*100/classesHeld);
			System.out.println("your attendence percentage is " + percentage + "%");
			StudentAttendence attendence = new StudentAttendence();
			attendence.eligibility(percentage);
		} else {
			System.out.println("check your input ");
		}
	}

}
