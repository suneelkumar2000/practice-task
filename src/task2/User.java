package task2;

import java.util.Scanner;

/*
 To alert the user if an answer is entered again. 
 Hint: use an array list to store answers. 
 Here is a sample run:
 What is 5 + 9? 12
 Wrong answer. Try again. What is 5 + 9? 34
 Wrong answer. Try again. What is 5 + 9? 12
 You already entered 12
 Wrong answer. Try again. What is 5 + 9? 14
 You got it!
 */
public class User {
	public static void main(String args[]) {
		System.out.println("what is 5+9?");
		int number1 = 5, number2 = 9, loop = 1, i = 1,n=100;
		int userAns, realAns, newUserAns = 0;
		realAns = number1 + number2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your ans:");
		userAns = sc.nextInt();
		int array[] = new int[n];
		do {

			if (userAns == realAns) {
				System.out.println("you are right");
				loop = 0;
			} else if (newUserAns == realAns) {
				System.out.println("you are right");
				loop = 0;
			} else {

				System.out.println("Wrong answer. Try again. What is 5 + 9?");
				newUserAns=sc.nextInt();
				if (newUserAns == userAns) {
					System.out.println("You already entered " + userAns);
				} else {
					for (int j = 0; j < i; j++) {
						if (newUserAns==array[j]) {
							System.out.println("You already entered " + newUserAns);
						}
					}array[i]=newUserAns;
				}
				i++;
			}
		} while (loop == 1);

	}
}
