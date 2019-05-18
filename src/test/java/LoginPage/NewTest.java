package LoginPage;



import org.testng.Assert;
import org.testng.annotations.Test;

import Link.LinkTest;



public class NewTest {
				
  @Test
  public void first() throws InterruptedException  {
	 
	  LinkTest LinkTestObj = new LinkTest();
	  LinkTestObj.LinkTesting();
	  	 
	
	  Assert.assertEquals("Vilkår for TV 2 Sumo", LinkTest.text);
	 
	 	  //System.out.println("Brukervilkår testcase is passed");
  }
	  @Test
	  public void second() {
		  
		  //System.out.println("second testcase");
		  Assert.assertEquals("sumo", "sumo");
		 // System.out.println("second testcase is passed");
	  }
  }

