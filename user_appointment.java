package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class user_appointment {
  @Test
  public void Add_slot() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("aradhya@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[3]/a")).click();
		ab.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[3]/ul/li[1]/a")).click();
		ab.findElement(By.name("username")).sendKeys("aradhya");
		ab.findElement(By.name("email")).sendKeys("aradhya@gmail.com");
		ab.findElement(By.name("contact")).sendKeys("9946158146");
		WebElement dropdown=ab.findElement(By.name("doctor_id"));
		Select drpdwn = new Select(dropdown);
		drpdwn.deselectByIndex(1);
		
		
  }
}
