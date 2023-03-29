


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Test127 
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Open browser and launch site
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.htm1") ;
		Thread.sleep(5000);
		//Get screenshot of complete page
		Test127 obj=new Test127(); // object is mandatory for the class eg 127 here
		String fp=obj.fullPageScreenshot (driver) ;
		System.out.println(fp); // printing in console the location of the screenshot C:\Selenium Installers\Myworkspace2\Seleni_Learn\target\24-Jun-2021-05-29-10.png
		driver .close();
		}
	 public String fullPageScreenshot(RemoteWebDriver driver) throws Exception
		{
		SimpleDateFormat sf=new SimpleDateFormat ("dd-MMM-yyyy-hh-mm-ss") ;// date format
		Date dt=new Date(); // assigning date to variable dt
		
				String fn=System.getProperty("user.dir")+"\\target\\"+sf.format(dt)+".png";
				File dest=new File(fn); // 24-Jun-2021-05-29-10.png - empty file created upto here

				AShot as=new AShot(); // ashot is a class to take full screenshot

				ShootingStrategy shs=ShootingStrategies.viewportPasting(1000) ; // shotin strategy is a sub class for ashot

				Screenshot ss=as.shootingStrategy(shs).takeScreenshot (driver) ;

				ImageIO.write(ss.getImage(),"PNG",dest) ; // writing to destination

				return(dest.getAbsolutePath());

	}

}
