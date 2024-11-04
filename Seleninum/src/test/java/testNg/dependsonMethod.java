package testNg;


import org.testng.annotations.Test;

public class dependsonMethod {
	
  @Test
  public void Login() {
	  System.out.println("login into application");
  }
  
  @Test(dependsOnMethods = "Login")
  public void dashbord() {
	  System.out.println("dashbord page");
  }
  
  @Test(dependsOnMethods = "dashbord")
  public void Logout() {
	  System.out.println("logout from the application");
  }
  
}
