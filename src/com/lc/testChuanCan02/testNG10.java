package com.lc.testChuanCan02;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class testNG10 {
	
  @DataProvider(name = "data1")
  public Object[][] testNG10_01(Method method) {
	  Object[][] data01 = null;
	  
	  if(method.getName().equals("testNG10_02")) {
		  data01 = new Object[][] {{"我是测试方法a","我是测试方法a"}};
	  }else if(method.getName().equals("testNG10_03")) {
		  data01 = new Object[][] {{"我是测试方法b","我是测试方法b"}};
	}
	  
	  return data01;
  }
  
  
  @Test(dataProvider = "data1")
  public void testNG10_03(String name1,String name2) {
	  System.out.println("name1:"+name1+";name2:"+name2);
	  
	  
  }
}
