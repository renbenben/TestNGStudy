package com.lc.testngYiLai;

import org.testng.annotations.Test;


public class TestNG17 {
 

	@Test(groups  = "group01")
	public void deployServer1() {
		System.out.println("TestNG17类的deployServer1方法");
		
	}
	@Test(groups = "group01")
	public void deployServer2() {
		System.out.println("TestNG17类的deployServer2方法");
		int a = 1 / 0 ;
	}
	
	
	@Test(groups = "group02")
	public void deployServer3() {
		System.out.println("TestNG17类的deployServer3方法");
	}
	
	
	
	@Test(dependsOnGroups   = {"group01","group02"})
	public void deployServer4() {
		System.out.println("TestNG17类的deployServer4方法");
	}
}
