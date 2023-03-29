/* Test 35 - getX, getY , getheight(), getwidth() */



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test35{

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch site and locate an hidden element
		
		driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality" + "explicit-show-hide/default.aspx");
		
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.linkText("1"));
		
		int x = e.getLocation().getX();
		int Y = e.getLocation().getY();
		System.out.println(x+" " +Y); 
		
		int x1 = e.getSize().getWidth();
		int Y1 = e.getSize().getHeight();
		System.out.println(x1+" " +Y1);
		
		int x2 = e.getRect().getX();
		int Y2 = e.getRect().getY();
		System.out.println(x2+" " +Y2); 
		
		int x3 = e.getRect().getWidth();
		int Y3 = e.getRect().getHeight();
		System.out.println(x3+" " +Y3);
		
		
		
		driver.close();
	}

	}
