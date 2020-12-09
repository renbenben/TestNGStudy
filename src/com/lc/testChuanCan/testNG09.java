package com.lc.testChuanCan;

import org.testng.annotations.Test;

public class testNG09 {
 
	@Test(dataProvider = "tstNG08Data1",dataProviderClass = testNG08.class)
	public void testNG07_02(String name,String sex,int age) {
		System.err.println("---------------------------------------------------------");
		System.out.println("我是tstNG07类的testNG07——02方法：");
		System.out.println("name:"+name+";sex:"+sex+";age:"+age);
		
	}
}
