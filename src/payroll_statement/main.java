package payroll_statement;

import java.util.Scanner;

/*Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
A sample run is shown below:
Enter employee's name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.5
Deductions:
Federal Withholding (20.0%): $19.5
State Withholding (9.0%): $8.77
Total Deduction: $28.27
Net Pay: $69.22*/
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee’s name: ");
		String name = input.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();

		double grossPay, federal, state, totalDeduction,NetPay;
		
		System.out.println("Employee Name: " + name );
		System.out.println("Hours Worked: " + hoursWorked );
		System.out.println("Pay Rate: $" + hourlyPayRate) ;
		grossPay = hoursWorked * hourlyPayRate;
		System.out.println("Gross Pay: $" + grossPay);
		
		System.out.println("Deductions:");
		federal = grossPay * federalTaxRate;
		System.out.println("Federal Witholding (20.0%): $" +federal);
		state = grossPay * stateTaxRate;
		System.out.println("State Witholding (9.0%): $" +state);
		totalDeduction = federal + state;
		System.out.println("Total Deduction: $" + totalDeduction);
		NetPay=grossPay - totalDeduction;
		System.out.printf("Net Pay: $" + NetPay);
	}
}
