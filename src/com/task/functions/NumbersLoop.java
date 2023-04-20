package com.task.functions;

import java.util.Scanner;

/*Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ).
Print average and product of all numbers.*/
public class NumbersLoop {
	public void loop() {
		int num, sum = 0, product = 1, counter = 0;
		float avg = 0;
		char c;
		String ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Number: ");
			ch = sc.next();
			c = ch.charAt(0);
			
			if (c == 'q') {
				break;
			} else {
				num = Integer.parseInt(ch);
				counter++;
			}
			sum = sum + num;
			product = product * num;
			System.out.print("Enter q to Exit else ");
		} while (c != 'q');
		avg = (sum /counter);
		System.out.println("Average : " + avg);
		System.out.println("Product : " + product);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumbersLoop nl=new NumbersLoop();
		nl.loop();
	}
}
