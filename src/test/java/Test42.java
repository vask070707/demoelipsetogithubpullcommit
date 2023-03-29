/*Test 43: List webELement */



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test42 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();	
	    driver.get("http://www.gmail.com");
	    Thread.sleep(5000);
	    List<WebElement> l = driver.findElements(By.xpath("//*['@name=identifier']"));// xpath for username field texxtbox
	    l.get(1).click();
	    l.get(0).sendKeys("Test");
	    Thread.sleep(5000);
	    //l.get(1).click();
	    driver.close();

	}

}
