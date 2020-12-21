package com.lc.testngFenZu;

import org.testng.annotations.Test;

public class common {
  

	@Test(groups = {"functest","checkintest"},priority = 1)
	public void login() {
		System.out.println("common测试类的login方法");
	}
	
	@Test(groups = {"functest","checkinitest"},priority = 4)
	public void quit() {
		System.out.println("common测试类的quit方法");
	}
	
	@Test(groups = {"checkinitest"})
	public void init() {
		System.out.println("common测试类的init方法");
	}
	
}
