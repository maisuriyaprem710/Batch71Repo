package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {
	SoftAssert sa = new SoftAssert();
  @Test(priority = 2 )
  public void test5() {
	  
	  System.out.println("before 1st assert");
	  String a = "abc" , b = "abc";
	  Assert.assertEquals(a,b);
	  System.out.println("after 1st assert");
  }
  
  @Test(priority = 1 )
  public void test6() {
	  System.out.println("before 2nd assert");
	  sa.assertTrue(2>6);
	  System.out.println("after 2nd assert");
	  sa.assertAll();
	  
  }
}
