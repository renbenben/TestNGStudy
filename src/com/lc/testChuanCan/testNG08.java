package com.lc.testChuanCan;

import org.testng.annotations.DataProvider;


public class testNG08 {
  
  @DataProvider(name = "tstNG08Data1")
  public Object[][] testNG08Data() {
	  
	  return new Object[][] {
		  {"饭饭","女",20},
		  {"桶桶","男",21},
		  
	  };
  }
}
