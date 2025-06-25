package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class User_Homepage_test {
	@Test
  public void Homepage_Srollandviewtest() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("aradhya@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		JavascriptExecutor cd = (JavascriptExecutor) ab;
		  for (int i = 0; i < 35; i++) {
		  cd.executeScript("window.scrollBy(0, 200)");

		   try {
		    Thread.sleep(1000);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
		
		
		
}
		  
		  for (int i = 0; i < 35; i++) {
		  cd.executeScript("window.scrollBy(0, -200)");

		   try {
		    Thread.sleep(350);
		   } catch (InterruptedException e) {
		    e.printStackTrace();
		   }
}
}
	
	}