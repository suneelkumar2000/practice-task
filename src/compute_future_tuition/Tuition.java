package compute_future_tuition;
/*compute future tuition
Suppose that the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year.*/
public class Tuition {
	public static void main(String[] args) {
		int totalCost = 0;		
		int tuition = 10000;
		int tuitionTenthYear = 0;
		int increasAmount;

		for (int year = 1; year <= 14; year++) {
			increasAmount= (int) (tuition * 0.05);
			tuition = tuition+increasAmount;

			if (year == 10)
				tuitionTenthYear = tuition; 
			if (year > 10) 
				totalCost = totalCost+ tuition; 
		}
		System.out.println("Tuition in ten years: $" + tuitionTenthYear);
		
		System.out.println("Total cost for four years'worth of tuition after the tenth year: $" + totalCost);
	}
}
