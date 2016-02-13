package Application;


//  Created by Clayton Paplaczyk
//  Description: This .java file take an input integer file and outputs the minimum integer,
//               the sum of the negative integers, the sum of the odd integers,
//				 and the number of even integers in the sequence.

import java.util.Scanner;  // class located in the "java.util" directory, allows user to enter inputs
import java.io.FileInputStream;
import java.io.IOException;

public class Application {
  public static void main (String[] args) {

	  //allows files to be automatically inputed into Eclipse
	  /*try{
		  System.setIn(new FileInputStream("./test/input4.txt")); // inputs test .txt file
		  }catch(IOException e){
			  e.printStackTrace();
		  } */

	  	int num; 			// input integers
	  	int min = 0; 		// minimum integer
		int sumneg = 0; 	// sum of negative integers
		int sumodd = 0; 	// sum of odd integers
		int numofeven = 0; 	// number of even integers

		Scanner scan = new Scanner(System.in); //implementing scanner class

		do
		{
			num = scan.nextInt();     // reads an integer entered by a user
			
			if(num < min)		//saves the minimum integer to min
				min = num;

			if(num < 0)			//gets the sum of all negative integers
				sumneg += num;

			if(num % 2 != 0)	//gets the sum of all odd integers
				sumodd += num;

			if(num % 2 == 0)	//gets the number of even integers in the sequence
				numofeven++;

  		}while (num != 0);		//ends do while loop when '0' is entered by user
		
	//outputs
		System.out.println("The minimum integer is " + min);
		System.out.println("The sum of neg integers is " + sumneg);
		System.out.println("The sum of odd integers is " + sumodd);
		System.out.println("The number of even integers in the sequence is " + numofeven);


	}
} // class end