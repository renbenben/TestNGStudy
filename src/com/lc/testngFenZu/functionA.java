package com.lc.testngFenZu;

import org.testng.annotations.Test;

public class functionA {
 
	@Test(groups = {"functest"},priority = 2 )
	public void testMethod1() {
		System.out.println("我是functionA测试类的testMethod1方法");
	}
	
	@Test(groups = {"function2"})
	public void testMethod2() {
		System.out.println("我是functionA测试类的testMethod2方法");
	}
	
}
