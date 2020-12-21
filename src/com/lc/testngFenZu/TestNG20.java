package com.lc.testngFenZu;

import org.testng.annotations.Test;

public class TestNG20 {
  
	@Test(priority = 1)
	public void method01() {
		System.out.println("我是 method01 ");
	}
	
	@Test(priority = 3)
	public void method02() {
		System.out.println("我是 method02 ");
	}
	
	@Test(priority = 2)
	public void method03() {
		System.out.println("我是 method03 ");
	}
}
