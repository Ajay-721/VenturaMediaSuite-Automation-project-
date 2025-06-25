package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout_test {

	public static void main(String[] args) {
		 WebDriver ab=new ChromeDriver();
			ab.get("https://venturamedsuite.infomedica.in/");
			ab.manage().window().maximize();
			ab.findElement(By.linkText("Sign In")).click();
			ab.findElement(By.id("form3Example3")).sendKeys("aradhya@gmail.com");
			ab.findElement(By.id("form3Example4")).sendKeys("123");
			ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
			ab.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/div[2]/ul/li[6]/a")).click();

	}

}
