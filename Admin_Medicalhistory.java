package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Admin_Medicalhistory {
  @Test
  public void hair() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[3]/a")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[3]/ul/li[1]/a")).click();
		
  }
  @Test
  public void skin() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[3]/a")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[3]/ul/li[2]/a")).click();
		
  }
  @Test
  public void hair_and_skin() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[3]/a")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[3]/ul/li[3]/a")).click();
		
  }
}
