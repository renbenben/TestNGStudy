package com.lc.testngHuLue;

import org.testng.annotations.Test;

public class testNG12 {
	 
	@Test
	public void testNG12_01() {
		System.out.println("我是testNG12类的testNG12_01方法");
	}
	
	@Test(enabled = false)
	public void testNG12_02() {
		System.out.println("我是testNG12类的testNG12_02方法");
	}
	
	@Test(enabled = true)
	public void testNG12_03() {
		System.out.println("我是testNG12类的testNG12_03方法");
	}
}
