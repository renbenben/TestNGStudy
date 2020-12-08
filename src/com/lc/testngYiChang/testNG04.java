package com.lc.testngYiChang;

import org.testng.annotations.Test;

public class testNG04 {
  @Test(expectedExceptions = ArithmeticException.class)
  public void testNG04_01() {
	  int  a = 0 ; 
	  int  b = 1 ; 
	  System.out.println("我是testNG04类的testNG04——01方法,我在异常之前打印。");

	  System.out.println("我是b/a  "+b/b);
	  
	  
	  System.out.println("我是testNG04类的testNG04——01方法,我在异常之后打印。");
  }
  
 
}
