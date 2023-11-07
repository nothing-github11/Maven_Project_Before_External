package com.Array_Problem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class YourTest{
	
	@Test
	public void test1(){
		int[] a1 = {22,49,50,39,38};
		MobileApp m = new MobileApp();
		Assert.assertEquals(1, m.CheckMaxArray1(a1));
	}
	
	@Test
	public void test2(){
		int[] a2 = {1,2,47,-4,-2};
		MobileApp m = new MobileApp();
		Assert.assertEquals(1, m.CheckMaxArray2(a2));
	}
	
	@Test
	public void test3(){
		int[] a3 = {-9,-2,-3,-4,-6};
		MobileApp m = new MobileApp();
		Assert.assertEquals(1, m.CheckMaxArray3(a3));
	}
}
