package com.anu;

//tutorial - https://technologyconversations.com/2013/12/20/test-driven-development-tdd-example-walkthrough/
public class StringCalculator {

	public static void main(String[] args) {
		

	}
	//Requirement 1: The method can take 0, 1 or 2 numbers separated by comma (,).
	public static void add(String numbers) {
		String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
            }
        }
	}

}
