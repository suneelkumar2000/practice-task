package method_without_return_type_with_parameter;

import java.util.Scanner;

public class Method2 {
	int c;
	void add(int a,int b) {
		c=a+b;
		System.out.println("sum = "+c);
	}
	public static void main(String[]args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of 2 numbers: ");
		i=sc.nextInt();
		j=sc.nextInt();
		Method2 object = new Method2();
		object.add(i, j);
	}
}
