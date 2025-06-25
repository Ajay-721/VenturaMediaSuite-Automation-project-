package ventura_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sigin_test {
	static String[][]credentials= {
			{"reshmi@gmail.com","123"},//valid admin
			{"nisha@gmail.com","123"},//valid staff
			{"aradhya@gmail.com","123"}//valid user
	};
  public void signin(String email,String pass) {
	    WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.manage().window().maximize();
		ab.findElement(By.linkText("Sign In")).click();
		ab.findElement(By.id("form3Example3")).sendKeys(email);
		ab.findElement(By.id("form3Example4")).sendKeys(pass);
		ab.findElement(By.xpath("/html/body/section/div/div/div/div/form/div[5]/button")).click();
		ab.close();
  }
  @Test(priority = 1)
  public void signin_admin() {
      signin(credentials[0][0], credentials[0][1]);
  }

  @Test(priority = 2)
  public void signin_staff() {
      signin(credentials[1][0], credentials[1][1]);
  }

  @Test(priority = 3)
  public void signin_user() {
      signin(credentials[2][0], credentials[2][1]);
  }
}
