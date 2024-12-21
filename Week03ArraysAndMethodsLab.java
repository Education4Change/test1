//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6

//		int[] numbers = new int[6];
		
//		numbers[0] = 1;
//		numbers[1] = 5;
//		numbers[2] = 2;
//		numbers[3] = 8;
//		numbers[4] = 13;
//		numbers[5] = 6;
		
	// simpler way to write the array that is easier to list numerically or in print
		
		int[] numbers = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
	
		System.out.println("First element in the array: " + numbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println("Last element in the array: " + numbers[numbers.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?

//		System.out.println(numbers[6]);
		System.out.println("Printing position 6 in array creates an exception in thread main since out of bounds for the array.");
		
		// 5. Print out the element in the array at position -1, what happens?

//		System.out.println(numbers[-1]);
		System.out.println("Printing position -1 in array creates an exception in thread main since out of bounds for the array.");
		
		// 6. Write a traditional for loop that prints out each element in the array
	
		System.out.println("Traditional for loop for each element in array");
		
		for (int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array

		System.out.println("Enhanced for loop that prints out each element in array");
		
		for (int i: numbers) {
			System.out.println(i);
		}
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("Write loop that adds each element in the array to the sum, a new variable");
		
		int sum = 0;
		
		for (int i: numbers) {
			sum += i;
		}
			System.out.println(sum);
		
		
		// 9. Create a new variable called average and assign the average value of the array to it
		System.out.println("Average of array");
		int average = sum / numbers.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd

		System.out.println("Print odd numbers in array");
		
		for (int i: numbers) {
			if (i % 2 != 0) {
			System.out.println(i);
		}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array

		int sumOfLetters = 0;
		
		for (String name : names) {
			sumOfLetters += name.length();
		}

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		System.out.println("Write and test method with string name & returns nothing");
		
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		System.out.println("Write and test method to return greeting do not print in the method");
		
		
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		System.out.println("Compare methods 13 and 14");
		
		
		
	
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		System.out.println("Write and test method using string and an int");
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		System.out.println("Write and test method using an array of string and a string");
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		System.out.println("Write and test a method that takes an array of int");
		
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		System.out.println("Write and test a method that takes an array of double and returns the average");
		
		
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

		
		System.out.println("Write and test a method that takes an array of Strings using int and length");
		
		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

		System.out.println("Write and test method that takes array of strings and uses sum of letters and even numbers");
		
		
		
		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		System.out.println("Write and test method that takes a string and returns true if string is a palindrome");
		
		
		
		
		
		
		
		
		
	}
	

	
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	

}