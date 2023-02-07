package savari;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Savari {
	public WebDriver driver;
	public void url() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vcred\\Downloads\\chromedriver_win32 (22)\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.savaari.com/");
	driver.manage().window().maximize();}
//login
	public void login() throws Throwable {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"sv_header\"]/div/div[2]/div/a[3]/div")).click();
	//driver.findElement(By.xpath("//button[@class='theme-button-register']")).click();
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("v.c.redy@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='hori-vertical-center']")).click();
	}
		
//oneway
	/*public void oneway() {
		//driver.findElement(By.xpath("//input[@id='fromCityList']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/p")).click();
	//driver.quit();
	
	}*/
	
	public static void main(String[] args) throws Throwable{
		Savari o=new Savari();
		o.url();
		o.login();
		//o.admin();
	
	
	
}}
