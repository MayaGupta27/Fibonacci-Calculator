/**
* This program calculates n numbers of the fibonacci sequence using recursion
* At the end it displays the amount of time it took to perform the calculation
* and the number of times the method fibonacci was called
* @author Maya Gupta and Sravya Patakota
*/

import java.util.Scanner;

public class FibonacciCalculator {
	private static int count = 0;
	
	public static void main( String [] args )
	{
		//Beginning Time
		long beginningTime = System.currentTimeMillis();

		//Creates a new scanner to ask the reader what number they would like to calculate to
		Scanner intReader = new Scanner(System.in);
		System.out.println( "Input what value you would like the fibonnaci calcultor to calculate up to: ");
		int valueToCalculate = intReader.nextInt();
		
		//Displays fibonacci values from 0 - valueToCalculate
		for ( int counter = 0; counter <= valueToCalculate; counter++ )
			System.out.printf( "Fibonacci of %d is: %d\n", counter, fibonacci( counter ) );
		
		//End time
		long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - beginningTime;
		
		//Displays the number of times the method was called and the time it took
		System.out.println( "\n" + "The method fibonacci was called " + count + " times" );
		System.out.println( "To perform this calculation it took " + totalTime + " milliseconds" );
	}
	
	//Recursive declaration of method fibonacci
	public static int fibonacci( int number )
	{
		count += 1;
		
		if (number == 1 || number == 0) {
			return number;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}
}
