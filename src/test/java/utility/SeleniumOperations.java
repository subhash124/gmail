package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumOperations
{
	
	static WebDriver driver;
	public static void lunch() {
		 ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		
		
	}
	public static void openurl(String str) {
		driver.get(str);
	}
	
	public static void click(String str) {
		
		
		driver.findElement(By.xpath(str)).click();
	}
	public static void sendkey(String str, String str1) {
		
		driver.findElement(By.xpath(str)).sendKeys(str1);
	}


}
