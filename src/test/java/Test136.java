//Test136 - Using the action class pasue the screen using pause method



import java.time.Duration;

//Action class pause before click element

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test136 {

	public static void main(String[] args) throws Exception {
			
			//Open browser and launch site 
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.google.co.in"); 
		Thread.sleep(5000); 
		Actions act=new Actions(driver); 
		WebElement e=driver.findElement(By.linkText("Gmail")); 
		Duration d=Duration.ofMillis(2000); 
		act.moveToElement(e).pause(d).click(); 


	}

}
