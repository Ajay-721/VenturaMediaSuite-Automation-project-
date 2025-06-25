package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_appointment {

	public static void main(String[] args) {
		 WebDriver ab=new ChromeDriver();
			ab.get("https://venturamedsuite.infomedica.in/");
			ab.manage().window().maximize();
			ab.findElement(By.linkText("Sign In")).click();
			ab.findElement(By.id("form3Example3")).sendKeys("reshmi@gmail.com");
			ab.findElement(By.id("form3Example4")).sendKeys("123");
			ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
            ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[7]/a")).click();
            ab.findElement(By.xpath("/html/body/div[2]/aside/div/div[2]/ul/li[7]/ul/li/a")).click();
            //approve click button test
            ab.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td[7]/form/button")).submit();
             // Reshedule click button test
            ab.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/table/tbody/tr[4]/td[7]/a")).click();
            ab.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div[2]/form/div[4]/button")).submit();
	}

}
