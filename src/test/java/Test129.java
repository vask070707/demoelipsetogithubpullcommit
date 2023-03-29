// PROGRAM 129 - basically using action class directoy we are sending values to the text box.
// this helps to avoid the locatin of element using xpath and send keys



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test129 
{

	public static void main(String[] args) throws Exception 
	{
		// open browser, launch site AND CLOSE BANNER
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch site
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		// Define object to Actions class
		Actions act = new Actions(driver);
		act.sendKeys("havidurai@gmail.com").perform(); // similar to send keys but no need to locate element for text box
		WebElement e1=driver.findElement(By.xpath("//span[text()='Next']/parent::button[@type='button']"));
		act.click(e1).perform();// similar to click
		Thread.sleep(5000);
		act.sendKeys("@Test1234").perform();
	// below xpath for NEXT button
		WebElement e2=driver.findElement(By.xpath("//span[text()='Next']/parent::button[@type='button']"));
		act.click(e2).perform();  
		// given elemnet

	}

}
