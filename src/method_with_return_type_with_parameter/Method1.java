package method_with_return_type_with_parameter;

import java.util.Scanner;

public class Method1 {
	int c;
	int add(int a,int b) {
		c=a+b;
		return c;
	}
	public static void main(String[]args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of 2 numbers: ");
		i=sc.nextInt();
		j=sc.nextInt();
		Method1 object = new Method1();
		System.out.println("sum = "+object.add(i, j));
		
	}
}
