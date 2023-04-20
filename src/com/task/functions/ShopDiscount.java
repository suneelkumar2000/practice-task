package com.task.functions;

import java.util.Scanner;

/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
*/

public class ShopDiscount {

	public double discount(double totalCost) {
		double total;
		total = totalCost - ((totalCost / 100) * 10);
		return total;
	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product quantity:");
		int quantity  = sc.nextInt();
		System.out.println("Enter the product cost:");
		double cost = sc.nextDouble();
		double totalCost= quantity*cost;
		ShopDiscount s = new ShopDiscount();
		if (totalCost > 1000) {
			System.out.println("Total Costs is "+totalCost);
			System.out.println("Total Costs with discount is "+s.discount(totalCost));
		}
		else {
			System.out.println("Total Costs is "+totalCost);
		}
		System.out.println(s);
	}

}
