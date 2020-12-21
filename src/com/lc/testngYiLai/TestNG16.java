package com.lc.testngYiLai;

import org.testng.annotations.Test;

public class TestNG16 {
  

	@Test
	public void test_method1() {
		System.out.println("TestNG16测试类的test_method1方法；第一个测试方法");
		//throw new RuntimeException();
	}
	
	
	@Test
	public void test_method2() {
		System.out.println("TestNG16测试类的test_method2方法；第二个测试方法");
	}
	
	
	@Test(dependsOnMethods = {"test_method1","test_method2"})
	public void test_method3() {
		System.out.println("TestNG16测试类的test_method3方法；第三个测试方法");
	}
	
	
}
