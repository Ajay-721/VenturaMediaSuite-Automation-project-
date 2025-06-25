package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class servicesandcontacttest {
  @Test
  public void view_services() {
	        WebDriver ab=new ChromeDriver();
			ab.get("https://venturamedsuite.infomedica.in/");
			ab.manage().window().maximize();
			ab.findElement(By.linkText("Sign In")).click();
			ab.findElement(By.id("form3Example3")).sendKeys("aradhya@gmail.com");
			ab.findElement(By.id("form3Example4")).sendKeys("123");
			ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
			ab.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[4]/a")).click();
			ab.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[4]/ul/li[1]/a")).click();
			JavascriptExecutor cd = (JavascriptExecutor) ab;
			  for (int i = 0; i < 35; i++) {
			  cd.executeScript("window.scrollBy(0, 200)");

			   try {
			    Thread.sleep(1000);
			   } catch (InterruptedException e) {
			    e.printStackTrace();
			   }
			
			
			
	}
    
    	 
     }
  @Test
  public void team_member_view() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("aradhya@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[4]/a")).click();
		ab.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[4]/ul/li[2]/a")).click();
		JavascriptExecutor cd = (JavascriptExecutor) ab;
		  for (int i = 0; i < 35; i++) {
		  cd.executeScript("window.scrollBy(0, 200)");

		   try {
		    Thread.sleep(1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		
		
		
}
  }
	@Test
  public void contact_view() {
	    WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("aradhya@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		
		ab.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[5]/a")).click();
		//get in touch
		ab.findElement(By.id("user_name")).sendKeys("aradhya");
		ab.findElement(By.id("user_email")).sendKeys("aradhya@gmail.com");
		ab.findElement(By.id("phone-no")).sendKeys("9037105608");
		ab.findElement(By.id("subject")).sendKeys("for enquiry");
		ab.findElement(By.id("message")).sendKeys("thankyou");
		ab.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/form/div/div[6]/input")).click();
		
  }
  }

  

