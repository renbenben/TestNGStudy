package com.lc.testngTaoJian;

import org.testng.annotations.Test;

public class testNG03 {
  @Test
  public void testNG_03() {
	  System.out.println("我是testNG04类的testNG03——003方法");
	  
  }
  
  @Test
  public void aatestNG_04() {
	  System.out.println("我是testNG04类的testNG03——04方法"+(1/0));
  }
}
