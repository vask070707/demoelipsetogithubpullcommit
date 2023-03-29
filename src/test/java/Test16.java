/* PROGRAM 16 - example for NO such element exception -  Here in line 23,, wrong xpath is given, though syntax is correct, 
hence no such element exception  */



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://google.co.in");
		Thread.sleep(5000);
				//No such element exception
		driver.findElement(By.xpath("//*[@name='qTest']")).sendKeys("Abdul Kalam");// wrong xpath though syntax is correct, hence no such element exception 
				driver.close();		
		}

}
