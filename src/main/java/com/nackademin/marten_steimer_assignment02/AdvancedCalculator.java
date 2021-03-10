package com.nackademin.marten_steimer_assignment02;

public class AdvancedCalculator implements AdvancedOperations {

	@Override
	public double square(double number) {
		return number * number;
	}

	@Override
	public double logarithm(double number) {
		if(number <= 0) {
			System.out.print("Logarithm: The value must be greater than ");
			return 0.0;
		} else {
			return Math.log(number);
		}
	}
		

	@Override
	public double powerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	@Override
	public double squareRoot(double number) {
		if(number < 0) {
			System.out.print("Square root: The value must be equal or greater than ");
			return 0.0;
		} else {
			return Math.sqrt(number);
		}
	}

	@Override
	public double absoluteValue(double number) {
		return Math.abs(number);
	}

}
