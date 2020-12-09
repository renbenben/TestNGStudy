package com.lc.testChuanCan02;

import java.util.List;
import java.util.Random;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG11 {
	
	@DataProvider
	public Object[][] randomIntegers(ITestContext context){
		
		String[] groups = context.getIncludedGroups();
		
		int size = 2 ; 
		
		for(String group : groups) {
			System.out.println("group=="+group);
			if(group.equals("functional-test")) {
				size = 10 ;
				break;
			}
		}
		
		Object[][] result = new Object[size][];
		Random r = new Random();
		
		for(int i = 0 ; i < size ; i++) {
			result[i] = new Object[] {new Integer(r.nextInt())};
		}
		return result;
		
	}
	
	
	@Test(dataProvider = "randomIntegers",groups = {"unit-test","functional-test"})
	public void random(Integer n) {
		System.out.println("n="+n);
	}
	
	
	
	
}
