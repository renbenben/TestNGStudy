package com.lc.tesgFenZu;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNG14 {
	
	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("我还是测试方法setuDB；在测试组之前运行");
	}
	
	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("我还是测试方法cleanDB；在测试组之后运行");
	}
	
	@Test(groups = "selenium-test")
	public void runSelenium() {
		System.out.println("我是测试类的 方法：runSelenium ");
	}
	
	@Test(groups = "selenium-test")
	public void runSelenium1() {
		System.out.println("我是测试类的 方法：runSelenium1 ");
	}
	
	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("我是测试类的方法：testConnectOracle");
	}
	
	@Test(groups = "database")
	public void testConnectOracle1() {
		System.out.println("我是测试类的方法：testConnectOracle1");
	}
	

	
}
