/**
 * Assignment 2
 * Author: Mårten Steimer
 * Date: 2021-03-12 
 *  
 */

package com.nackademin.marten_steimer_assignment02;

public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		
		AdvancedCalculator ac = new AdvancedCalculator();
		
		
		System.out.println(bc.addition(2, 3));
		System.out.println(bc.subtraction(3, 2));
		System.out.println(bc.multiplication(4, 2));
		System.out.println(bc.division(10, 20));
		
		System.out.println(ac.absoluteValue(7));
		System.out.println(ac.square(8));
		System.out.println(ac.squareRoot(5));
		System.out.println(ac.logarithm(6));
		System.out.println(ac.powerOf(2, 3));

	}

}
