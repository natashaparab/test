package com.jpmorgan.banking.Java_app;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
 
@RunWith(Parameterized.class)
public class LeapYearTest {
	
	@Parameter(0)
	public int input;
	
	@Parameter(1)
	public boolean expected;
	
	@Parameters(name =" year {0} is a leap year ? {1}")
	public static List<Object[]> testData() {
		Object[][] data = new Object[][] {{2017, false}};
		return Arrays.asList(data);
	}

	@Test
	private void isLeapYearTest_nonCenturyNonLeapYearFalse() {
		// TODO Auto-generated method stub
		//Assert.assertFalse(LeapYear.isLeapYear());
		assertThat(LeapYear.isLeapYear(input), is(expected));
	}
	
	

}
