package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_availability_test {

	public static void main(String[] args) {
		 WebDriver ab=new ChromeDriver();
			ab.get("https://venturamedsuite.infomedica.in/");
			ab.manage().window().maximize();
			ab.findElement(By.linkText("Sign In")).click();
			ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
			ab.findElement(By.id("form3Example4")).sendKeys("123");
			ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
            ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[8]/a")).click();
            ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[8]/ul/li/a")).click();
            ab.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/a")).click();
            ab.findElement(By.name("dates[]")).sendKeys("26-06-2025");
            ab.findElement(By.id("timeInput")).sendKeys("10:00");
            ab.findElement(By.name("totime[]")).sendKeys("03:00");
            ab.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/div[2]/button[2]")).click();
	}

}
