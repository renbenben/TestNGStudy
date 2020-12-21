package com.lc.testngFenZu;

import org.testng.annotations.Test;

public class functionB {
	 
	@Test(groups = {"functest"},priority = 3)
	public void testMethod3() {
		System.out.println("我是functionB测试类的testMethod3方法");
	}
	
	@Test(groups = {"functest2"})
	public void testMethod4() {
		System.out.println("我是functionB测试类的testMethod4方法");
	}
}
