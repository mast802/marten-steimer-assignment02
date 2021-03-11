package com.nackademin.marten_steimer_assignment02;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	
	// Testing of method addition
	@Test
	public void testAddition() {
		double tmp1 = 0.0;
		double tmp2 = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero
		LOG.info("Testing the method addition with the zero values: "+ tmp1 + " and " + tmp2);
		assertEquals(bc.addition(tmp1, tmp2),expectedValue,0);

		
		//Positive numbers
		for(int i = 0; i<10; i++) {
			tmp1 = random.nextDouble() * random.nextInt(1000);
			tmp2 = random.nextDouble() * random.nextInt(1000);
			expectedValue = tmp1 + tmp2;
			LOG.info("Testing the method addition with the positive values: "+ tmp1 + " and " + tmp2);
			assertEquals(bc.addition(tmp1, tmp2),expectedValue,0);
		}
		
		//Negative numbers
		for(int i = 0; i<10; i++) {
			tmp1 = -(random.nextDouble() * random.nextInt(1000));
			tmp2 = -(random.nextDouble() * random.nextInt(1000));
			expectedValue = tmp1 + tmp2;
			LOG.info("Testing the method addition with the negative values: "+ tmp1 + " and " + tmp2);
			assertEquals(bc.addition(tmp1, tmp2),expectedValue,0);
		}
		
		
		
}
	// Testing of method subtraction	
	@Test
	public void testSubtraction() {
		double tmp1 = 0.0;
		double tmp2 = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero
		LOG.info("Testing the method addition with the zero values: "+ tmp1 + " and " + tmp2);
		assertEquals(bc.subtraction(tmp1, tmp2),expectedValue,0);
		
		
		//Positive numbers
		for(int i = 0; i<10; i++) {
			tmp1 = random.nextDouble() * random.nextInt(1000);
			tmp2 = random.nextDouble() * random.nextInt(1000);
			expectedValue = tmp1 - tmp2;
			LOG.info("Testing the method subtraction with the positive values: "+ tmp1 + " and " + tmp2);
			assertEquals(bc.subtraction(tmp1, tmp2),expectedValue,0);
		}
		

		//Negative numbers
		for(int i = 0; i<10; i++) {
			tmp1 = -(random.nextDouble() * random.nextInt(1000));
			tmp2 = -(random.nextDouble() * random.nextInt(1000));
			expectedValue = tmp1 - tmp2;
			LOG.info("Testing the method subtraction with the negative values: "+ tmp1 + " and " + tmp2);
			assertEquals(bc.subtraction(tmp1, tmp2),expectedValue,0);
		}
	}
	
	// Testing of method multiplication
	@Test
	public void testMultiplication() {
		double tmp1 = 0.0;
		double tmp2 = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero
		expectedValue = tmp1 * tmp2;
		LOG.info("Testing the method multiplication with the zero values: "+ tmp1 + " and " + tmp2);
		assertEquals(bc.multiplication(tmp1, tmp2),expectedValue,0);
		
		
		//Positive numbers
		for(int i = 0; i<10; i++) {
			tmp1 = random.nextDouble() * random.nextInt(1000);
			tmp2 = random.nextDouble() * random.nextInt(1000);
			expectedValue = tmp1 * tmp2;
			LOG.info("Testing the method multiplication with the positive values: "+ tmp1 + " and " + tmp2);
			assertEquals(bc.multiplication(tmp1, tmp2),expectedValue,0);
		}
		

		//Negative numbers
		for(int i = 0; i<10; i++) {
			tmp1 = -(random.nextDouble() * random.nextInt(1000));
			tmp2 = -(random.nextDouble() * random.nextInt(1000));
			expectedValue = tmp1 * tmp2;
			LOG.info("Testing the method multiplication with the negative values: "+ tmp1 + " and " + tmp2);
			assertEquals(bc.multiplication(tmp1, tmp2),expectedValue,0);
		}
	}
	
	// Testing of method division
	@Test
	public void testDivision() {
		double tmp1 = 0.0;
		double tmp2 = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero
		expectedValue = tmp1 / tmp2;
		LOG.info("Testing the method multiplication with the zero values: "+ tmp1 + " and " + tmp2);
		assertEquals(bc.division(tmp1, tmp2),0,0);
		
		
		//Positive numbers
		for(int i = 0; i<10; i++) {
			tmp1 = random.nextDouble() * random.nextInt(1000);
			tmp2 = random.nextDouble() * random.nextInt(1000);
//			
//			It's possible that tmp2 is generated as 0.0, that could be solved by uncomment below three rows
//			if(tmp2 == 0.0)
//				expectedValue = 0;
//			else
				expectedValue = tmp1 / tmp2;
			LOG.info("Testing the method division with the positive values: "+ tmp1 + " and " + tmp2);
			assertEquals(bc.division(tmp1, tmp2),expectedValue,0);
		}
		

		//Negative numbers
		for(int i = 0; i<10; i++) {
			tmp1 = -(random.nextDouble() * random.nextInt(1000));
			tmp2 = -(random.nextDouble() * random.nextInt(1000));
//			It's possible that tmp2 is generated as 0.0, that could be solved by uncomment below three rows
//			if(tmp2 == 0.0)
//				expectedValue = 0;
//			else
				expectedValue = tmp1 / tmp2;
			LOG.info("Testing the method division with the negative values: "+ tmp1 + " and " + tmp2);
			assertEquals(bc.division(tmp1, tmp2),expectedValue,0);
		}
	}
	

}
