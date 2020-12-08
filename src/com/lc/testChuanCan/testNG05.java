package com.lc.testChuanCan;

import org.testng.annotations.Test;

public class testNG05 {
  @Test(parameters  = {"xml-file","hostname"})
  public void testNG05_01(String xmlfile,String hostname) {
	  System.out.println("我是testNG05 类的testNG05——01方法,\n我传递参数是\nxml-file:"+xmlfile+"\nhostname:"+hostname);
	 
	  System.out.println();
  }
  
}
