package method_with_return_type_without_parameter;

import java.util.Scanner;

public class Method3 {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	int add(){
		System.out.println("enter value of 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		return c;
	}
	public static void main(String[]args) {
		Method3 object = new Method3();
		System.out.println("sum = "+object.add());
	}
}
