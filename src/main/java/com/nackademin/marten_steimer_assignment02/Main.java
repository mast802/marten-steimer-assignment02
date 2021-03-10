package com.nackademin.marten_steimer_assignment02;

public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		
		System.out.println(bc.addition(2, 3));
		System.out.println(bc.subtraction(3, 2));
		System.out.println(bc.multiplication(4, 2));
		System.out.println(bc.division(10, 20));

	}

}
