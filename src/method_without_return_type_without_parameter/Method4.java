package method_without_return_type_without_parameter;

import java.util.Scanner;

public class Method4 {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	void add() {
		System.out.println("enter value of 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("sum = "+c);
	}
	public static void main(String[]args) {
		Method4 object = new Method4();
		object.add();
	}

}
