package Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkTest {
	
	public static String text;
	static final long watingTime = 1000;
	
	public WebDriver driver;
	
	public void LinkTesting() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Files needed for Testing Automation\\chromedriver_win32\\chromedriver.exe");
	 
	 ChromeOptions options = new ChromeOptions(); 
	 options.addArguments("disable-infobars"); 
	 driver = new ChromeDriver(options);
	 driver.manage().window().maximize();
	
		driver.get("https://sumo.tv2.no");
		
		Thread.sleep(watingTime);
		
		driver.findElement(By.xpath("//a[text()='Se alle pakkene våre']")).click();
		Thread.sleep(watingTime);
		driver.findElement(By.xpath("//a[contains(text(),'Brukervilkår')]")).click();
		Thread.sleep(watingTime);
		
		
		 text = driver.findElement(By.xpath("//h1[@class='page__title container']")).getText();
		System.out.println(text);
		
		
		
//		
//		driver.get("https://sumo.tv2.no/");
//		driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[contains(text(),'Meny')]")).click();
	Thread.sleep(watingTime);
		driver.findElement(By.xpath("//span[contains(text(),'Søk')]")).click();
		Thread.sleep(watingTime);
		driver.findElement(By.xpath("//span[contains(text(),'Søk')]")).click();
		Thread.sleep(watingTime);
//		driver.findElement(By.xpath("//span[contains(text(),'Få tilgang')]")).click();
//		driver.findElement(By.xpath("//div[@class='commercial-page__category commercial-page__category--sport']//a[@class='button2 button--secondary']")).click();
			
		Thread.sleep(watingTime);
		
	driver.quit();	
	}
	
	
}
