package ventura_test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignupAdminTest {
	static String[][]credentials= {
			{"Ajay Devan M","9037105608","Thiruvanthapuram,kerala","medicity clinic",
				"90665522","ajaydevan721@gmail.com","ajay@123"},//valid signup
			{"Ajay235","9037105608","Thiruvanthapuram,kerala","medicity clinic",
					"90665522","ajay@gmail.com","ajay@098"},//entering name field with numbers and special characters
			{ "","","","","","",""},// blankdata
		    {"Ajay235","9037105608","Thiruvanthapuram,kerala","medicity clinic",
				"90665522","ajay@gmail.com",""},// signup without password
		    {"Ajay235","9037105608","Thiruvanthapuram,kerala","medicity clinic",
					"abcd345","ajay@gmail.com","ajay@890"},//medical regno with alphabets
		    {"Ajay235","9037105608","Thiruvanthapuram,kerala","892729292",
						"abcd345","ajay@gmail.com","ajay@890"},//clinicname with numbers
			{  "Ajay235","9037105608","Thiruvanthapuram,kerala","876528w28290",
				"abcd345","ajay@$%^gmail.com","ajay@890"}//email field with special characters
	};
	
  
  public void Signup (String name,String num,String add,String clname,String mednum,String email,String password) {
	  WebDriver ab=new ChromeDriver();
		ab.get("https://venturamedsuite.infomedica.in/");
		ab.findElement(By.id("docName")).sendKeys(name);
		ab.findElement(By.id("docContact")).sendKeys(num);
		ab.findElement(By.id("docAddress")).sendKeys(add);
		ab.findElement(By.id("clinicName")).sendKeys(clname);
		ab.findElement(By.id("medRegNum")).sendKeys(mednum);
		ab.findElement(By.id("email")).sendKeys(email);
		ab.findElement(By.id("password")).sendKeys(password);
		WebElement checkbox= ab.findElement(By.id("terms"));
		checkbox.click();
		ab.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/div/div[1]/form/div[6]/button")).click();
		
		
  }
  @Test(priority=1)
   
  public void valid_Signup() {
	  Signup(credentials[0][0],credentials[0][1],credentials[0][2],credentials[0][3],credentials[0][4],credentials[0][5],credentials[0][6]);
  }
  @Test(priority=2)
  public void invalid_Signup() {
	  Signup(credentials[1][0],credentials[1][1],credentials[1][2],credentials[1][3],credentials[1][4],credentials[1][5],credentials[1][6]);
  }
  @Test(priority=3)
  public void blankdata_Signup() {
	  Signup(credentials[2][0],credentials[2][1],credentials[2][2],credentials[2][3],credentials[2][4],credentials[2][5],credentials[2][6]);
}
  @Test(priority=4)
  public void blankpassword_Signup() {
	  Signup(credentials[3][0],credentials[3][1],credentials[3][2],credentials[3][3],credentials[3][4],credentials[3][5],credentials[3][6]);
}
  @Test(priority=5)
  public void medregwith_alphabets_Signup() {
	  Signup(credentials[4][0],credentials[4][1],credentials[4][2],credentials[4][3],credentials[4][4],credentials[4][5],credentials[4][6]);
}
  @Test(priority=6)
  public void clinicname_invalid_Signup() {
	  Signup(credentials[5][0],credentials[5][1],credentials[5][2],credentials[5][3],credentials[5][4],credentials[5][5],credentials[5][6]);
}
  @Test(priority=7)
  public void email_specialchar_invalid_Signup() {
	  Signup(credentials[6][0],credentials[6][1],credentials[6][2],credentials[6][3],credentials[6][4],credentials[6][5],credentials[6][6]);
}
}
