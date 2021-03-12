/**
 * Assignment 2
 * Author: Mårten Steimer
 * Date: 2021-03-12 
 *  
 */

package com.nackademin.marten_steimer_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class AdvancedCalculatorTest {

	AdvancedCalculator ac = new AdvancedCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());
	
	
	// Testing of method square
	@Test
	public void testSquare() {
		double tmp = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero
		LOG.info("Testing the method square with value zero ");
		assertEquals(ac.square(tmp),expectedValue,0);
	
	
		//Positive numbers
		for(int i = 0; i<10; i++) {
			tmp = random.nextDouble() * random.nextInt(1000);
			expectedValue = tmp * tmp;
			LOG.info("Testing the method square with the positive value: "+ tmp);
			assertEquals(ac.square(tmp),expectedValue,0);
		}
			
		//Negative numbers
		for(int i = 0; i<10; i++) {
			tmp = -(random.nextDouble() * random.nextInt(1000));
			expectedValue = tmp * tmp;
			LOG.info("Testing the method square with the negative value: "+ tmp);
			assertEquals(ac.square(tmp),expectedValue,0);
		}
	}
	
	
	// Testing of method logarithm
	@Test
	public void testLogarithm() {
		double tmp = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero - must be greater than 0, if not 0 is expected
		LOG.info("Testing the method logarithm with value zero");
		assertEquals(ac.logarithm(tmp),expectedValue,0);
	
		//Negative numbers - must be greater than 0, if not 0 is expected
		tmp = -7.2;
		LOG.info("Testing the method logarithm with the negative value: "+ tmp);
		assertEquals(ac.logarithm(tmp),expectedValue,0);
	
		//Positive numbers
		for(int i = 0; i<10; i++) {
			tmp = random.nextDouble() * random.nextInt(1000);
			expectedValue = Math.log(tmp);
			LOG.info("Testing the method logarithm with the positive value: "+ tmp);
			assertEquals(ac.logarithm(tmp),expectedValue,0);
		}		
	}
	
	
	// Testing of method raised to the power of
	@Test
	public void testPowerOf() {
		double base = 0.0;
		double exp = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero
		expectedValue = Math.pow(base, exp);
		LOG.info("Testing the method powerOf with value zero ");
		assertEquals(ac.powerOf(base,exp),expectedValue,0);
		
	
		//Positive numbers
		for(int i = 0; i<10; i++) {
			base = random.nextDouble() * random.nextInt(1000);
			exp = random.nextDouble() * random.nextInt(1000);
			expectedValue =Math.pow(base, exp);
			LOG.info("Testing the method powerOf with the positive values: "+ base + " and " + exp);
			assertEquals(ac.powerOf(base, exp),expectedValue,0);
		}
			
		//Negative numbers
		for(int i = 0; i<10; i++) {
			base = -(random.nextDouble() * random.nextInt(1000));
			exp = -(random.nextDouble() * random.nextInt(1000));
			expectedValue =Math.pow(base, exp);
			LOG.info("Testing the method powerOf with the negative values: "+ base + " and " + exp);
			assertEquals(ac.powerOf(base, exp),expectedValue,0);
		}
	}
	
	
	// Testing of method squareRoot
	@Test
	public void testsquareRoot() {
		double tmp = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero 
		LOG.info("Testing the method squareRoot with value zero");
		assertEquals(ac.squareRoot(tmp),expectedValue,0);
	
		//Negative numbers - must be greater or equal to 0, if not 0 is expected
		tmp = -7.2;
		LOG.info("Testing the method squareRoot with the negative value: "+ tmp);
		assertEquals(ac.squareRoot(tmp),expectedValue,0);
	
		//Positive numbers
		for(int i = 0; i<10; i++) {
			tmp = random.nextDouble() * random.nextInt(1000);
			expectedValue = Math.sqrt(tmp);
			LOG.info("Testing the method squareRoot with the positive value: "+ tmp);
			assertEquals(ac.squareRoot(tmp),expectedValue,0);
		}		
	}

	
	// Testing of method absoluteValue
	@Test
	public void testabsoluteValue() {
		double tmp = 0.0;
		double expectedValue = 0.0;
		
		//Testing with zero
		expectedValue = Math.abs(tmp);
		LOG.info("Testing the method absoluteValue with value zero ");
		assertEquals(ac.absoluteValue(tmp),expectedValue,0);
	
	
		//Positive numbers
		for(int i = 0; i<10; i++) {
			tmp = random.nextDouble() * random.nextInt(1000);
			expectedValue = Math.abs(tmp);
			LOG.info("Testing the method absoluteValue with the positive value: "+ tmp);
			assertEquals(ac.absoluteValue(tmp),expectedValue,0);
		}
			
		//Negative numbers
		for(int i = 0; i<10; i++) {
			tmp = -(random.nextDouble() * random.nextInt(1000));
			expectedValue = Math.abs(tmp);
			LOG.info("Testing the method absoluteValue with the negative value: "+ tmp);
			assertEquals(ac.absoluteValue(tmp),expectedValue,0);
		}
	}
}
