/**
 * Assignment 2
 * Author: Mårten Steimer
 * Date: 2021-03-12 
 *  
 */

package com.nackademin.marten_steimer_assignment02;

public class BasicCalculator implements BasicOperations {

	@Override
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	@Override
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	@Override
	public double division(double firstNumber, double secondNumber) {
		if(secondNumber == 0) {
			System.out.print("It's not allowed do divide with ");
			return 0.0;
		} else {
		return firstNumber / secondNumber;
		}
	}

}
