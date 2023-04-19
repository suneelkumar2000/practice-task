package com.student.grade_calculator;

import java.util.Scanner;

public class StudentResult {
	void result(float avg) {
		if (avg > 90) {
			System.out.println("A Grade");
		} else if (avg > 80 && avg <= 90) {
			System.out.println("B Grade");
		} else if (avg > 70 && avg <= 80) {
			System.out.println("C Grade");
		} else if (avg > 60 && avg <= 70) {
			System.out.println("D Grade");
		} else if (avg >= 50 && avg <= 60) {
			System.out.println("E Grade");
		} else {
			System.out.println("FAIL");
		}
	}

	public static void main(String[] args) {
		float studentTotal = 0, avg;
		int subjects;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of subjects:");
		subjects = sc.nextInt();
		float[] marks = new float[subjects];
		System.out.println("enter your subjects mark:");
		for (int i = 0; i < subjects; i++) {
			marks[i] = sc.nextFloat();

		}
		for (int i = 0; i < subjects; i++) {
			if (marks[i] >= 0 && marks[i] <= 100) {
				studentTotal = studentTotal + marks[i];
				if (i == subjects - 1) {
					StudentResult object = new StudentResult();
					avg = studentTotal / subjects;
					System.out.println("average mark = " + avg);
					object.result(avg);
				}
			} else {
				System.out.println("Invalid marks");
				break;
			}
		}
	}
}
