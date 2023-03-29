// CORRECTION program

PROGRAM 10 : Objective is to check whether its a secured URL or not. for this if the url starts with https its a secured else unsecured url
// get current url gets the url of the webpage which is already opened.



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		//2.SWD code to launch IE browser
	RemoteWebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.co.in"); // it will launch the page in the browser
		
		String x = driver.getCurrentUrl();// get current url gets the url of the webpage which is already opened
		Thread.sleep(7000);
		//corrected by Team lead - vas
		if(x.startsWith("https"))
		{
		System.out.println("Secured site");
		}
		else
		{
			System.out.println("Unsecured site");
		}
		driver.close();

	} }
