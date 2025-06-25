package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Admin_patients_test {
  @Test
  public void View_patients() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[2]/a")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		JavascriptExecutor js= (JavascriptExecutor)ab;
		js.executeScript("window.scrollby(0,500)");
		ab.close();
  }
  @Test
  public void all_appoinments() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[2]/a")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
	    ab.close();
  }
  @Test
  public void evaluate_risk_Scenario() {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
		ab.findElement(By.id("form3Example4")).sendKeys("123");
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[2]/a")).click();
		ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[2]/ul/li[3]/a")).click();
        ab.close();
}
}
