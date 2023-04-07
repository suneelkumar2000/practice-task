package sales_job;

import java.util.Scanner;

/*(find the sales amount) You have just started a sales job 
 in a department store. Your pay consists of a base salary and a commission. The
 ]base salary is $5,000. The scheme shown below is used to determine the commission rate.
 Sales Amount --------- Commission Rate
 $0.01–$5,000 --------------- 8 percent
 $5,000.01–$10,000 ---------- 10 percent
 $10,000.01 and above ------- 12 percent
 Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
 you have to generate in order to make $30,000.*/
public class CommissionRate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter comission amount you want to earn");
		double target = input.nextDouble();

		double comission = 0;
		double sales = 0;

		while (comission < target) {

			comission = 0;
			if (sales >= 0) {
				if (sales >= 5000) {
					comission = comission+(5000 * 0.08);
				} else {
					comission = sales * 0.08;
				}

			}
			if (sales >= 5000) {
				if (sales >= 10000) {
					comission = comission+(5000 * 0.10);
				} else {
					comission = comission+((sales - 5000) * 0.10);
				}

			}
			if (sales >= 10000) {
				comission = comission+((sales - 10000) * 0.12);

			}

			sales = sales+1;

		}

		System.out.printf("The Sales required is $" + sales + " to make $"+target+" comission");
	}
}
