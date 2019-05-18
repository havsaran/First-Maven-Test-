package LoginPage;


import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest1 {
	  @Test
	  public void third() {
		  
		  //System.out.println("First testcase");
		  Assert.assertEquals("10", "10", "strings are not matching");
		  //System.out.println("First testcase is passed");
	  }
		  @Test
		  public void fourth() {
			  
			  //System.out.println("second testcase");
			  Assert.assertEquals(20, 20);
			  //System.out.println("second testcase is passed");
		  }
}
