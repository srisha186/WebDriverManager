import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerdemo {

	public static void main(String[] args) {
		
		
		ChromeOptions co=new ChromeOptions();
		co.setHeadless(true);
		//no need to use webdriver driver=new chromedriver();, use create method
		WebDriver driver=WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
	}
	//WebDriverManager 4.2 older version
	/*WebDriverManager.chromedriver.setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com");
	System.out.println(driver.getTitle());*/
	//with 5.1 version use only create not setup
	
	
	
}
