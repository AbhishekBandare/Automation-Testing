package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNgAssertion {
	String expected="The Internet";
	
  @Test
  public void assertion() {
	  SoftAssert soft=new SoftAssert();
	soft.assertEquals("The Internet", expected);
	System.out.println("after....");
	  soft.assertTrue(expected.equals("The Interne"));
	  System.out.println("true");
  }
}
