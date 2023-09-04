/**
 * 
 */
package sEdwardsExercise2;
import java.util.*;
/**
 * @author ShaneEdwards
 *         
 *         Due: 9/26/2022
 *        
 *         This program takes a 5 digit number, separates the digits and finds the sum.
 *        
 *         This is my own work, with the following exceptions: 
 *         None
 *
 */
public class SEdwardsExercise2a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int fifthDigit;
		int sumNumber;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 5 digit number and I will seperate each digit and show the sum ");
		number = input.nextInt();
		
		firstDigit = number/10000; // lose the last digit to get the first
		secondDigit = number/1000%10; // keep the last digit as the remainder from dividing by 10
		thirdDigit = number/100%10;
		fourthDigit = number/10%10;
		fifthDigit = number%10;
		
		sumNumber = firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
		
		System.out.println(firstDigit + "+" + secondDigit + "+" + thirdDigit + "+" + fourthDigit + "+" + fifthDigit + "=" + sumNumber );
		
		

	}

}
