package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class admin_userprofile_test {
  @Test
  public void profile_test() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/div/nav/div/div[2]/div/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/div/nav/div/div[2]/div/ul/li[1]/a/span")).click();
  }
  @Test
  public void account_settings_test() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/div/nav/div/div[2]/div/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/div/nav/div/div[2]/div/ul/li[2]/a/span"));
  }
}
