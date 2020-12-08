package com.lc.testChuanCan;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG6 {

  //
  @Test(parameters = {"testKey","hostname"})
  public void textNG06_01(String testKey,String hostname) {
	  System.out.println("我是testNG6 类的testNG06——01方法,\n我传递参数是\ntestKey:"+testKey+"\nhostname:"+hostname);
	  System.err.println("-----------------------------");
  }
  
  @Parameters({"testKey","hostname"})
  @Test
  public void textNG06_02(String testKey,String hostname) {
	  System.out.println("我是testNG6 类的testNG06——02方法,\n我传递参数是\ntestKey:"+testKey+"\nhostname:"+hostname);
  }
  
  @Parameters({"testKey","hostname","testKey1"})
  @Test
  public void textNG06_03(String testKey,String hostname,String testKey1) {
	  System.out.println("我是testNG6 类的testNG06——03方法,\n我传递参数是\ntestKey:"+testKey+"\nhostname:"+hostname);
	  System.out.println("testKey1:"+testKey1);
  }
}
