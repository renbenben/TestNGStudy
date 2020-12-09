package com.lc.testChuanCan;



import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class testNG07 {
 
	@Test(dataProvider = "reange-provider")
	public void testNG07_01(int n,int lower,int upper,boolean expected) {
		System.out.println("n:"+n+";lower:"+lower+";upper:"+upper+";expected:"+expected);
	}
	
	@DataProvider(name = "reange-provider")
	public Object[][] rangeData(){
		int lower = 5 ;
		int upper = 10 ;
		
		return new Object[][] {
			{lower-1,lower,upper,false},
			{lower,lower,upper,true},
			{lower+1,lower,upper,true},
			{upper,lower,upper,true},
			{upper+1,lower,upper,false},
			
		};
	}
	
	@Test(dataProvider = "tstNG08Data1",dataProviderClass = testNG08.class)
	public void testNG07_02(String name,String sex,int age) {
		System.err.println("---------------------------------------------------------");
		System.out.println("我是tstNG07类的testNG07——02方法：");
		System.out.println("name:"+name+";sex:"+sex+";age:"+age);
		
	}
}
