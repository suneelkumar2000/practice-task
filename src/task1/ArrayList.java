package task1;

import java.util.Random;
import java.util.Scanner;
/*Write a program that randomly fills in 0s and 1s
 into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 the most 1s.) Here is a sample run of the program:
 Enter the array size n: 4
 The random array is
 0011
 0011
 1101
 1010
 The largest row index: 2
 The largest column index: 2, 3

Sample Output:
Enter the array size n: 4
0 0 0 0 
1 0 1 0 
0 1 0 0 
0 1 0 0 

Row sums: [0, 2, 1, 1]
Column
*/
public class ArrayList {
	public static void main(String args[]) {
		{
			int size, i, j, sumRow = 0, sumCol = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the array size: ");
			size = sc.nextInt();

			int array[][] = new int[size][size];
			Random random = new Random();

			System.out.println("The elements of the array are : ");

			for (i = 0; i < size; i++) {
				for (j = 0; j < size; j++) {
					array[i][j] = random.nextInt(2);
				}
			}
			System.out.println("Elements of the array are: ");
			for (i = 0; i < size; i++) {
				for (j = 0; j < size; j++) {

					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			for (i = 0; i < size; i++) {
				sumRow = 0;
				for (j = 0; j < size; j++) {
					sumRow = sumRow + array[i][j];
				}
				System.out.println("Sum of  row " + (i + 1) + ": " + sumRow);
			}
			for (i = 0; i < size; i++) {
				sumCol = 0;
				for (j = 0; j < size; j++) {
					sumCol = sumCol + array[j][i];
				}
				System.out.println("Sum of  column " + (i + 1) + ": " + sumCol);
			}
		}
	}
}