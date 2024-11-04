package testNg;

import org.testng.annotations.Test;

public class Groups {
  @Test(groups = "smoketest")
  public void test1() {
	  System.out.println("test1");
  }
  @Test(groups = "regerestiontest")
  public void test2() {
	  System.out.println("test2");
  }
  @Test(groups = {"smoketest","regerestiontest"})
  public void test3() {
	  System.out.println("test3");
  }
  @Test(groups = "regerestiontest")
  public void test4() {
	  System.out.println("test4");
  }
  @Test(groups = "smoketest")
  public void test5() {
	  System.out.println("test5");
  }
}
