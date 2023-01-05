package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Parent {

	public static Properties metaprop;
	public static WebDriver driver;
	
	public Base_Parent() {
		
		try {
			FileInputStream files= new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\nexttechmeta\\config\\MetaConfig.Properties");
			
			 metaprop=new Properties();
			metaprop.load(files);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void metaBrowserinit() {
		
		String metaBrowser= metaprop.getProperty("Browser1");
		
		if(metaBrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Test_Data.implicitlyWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Test_Data.pageLoadWait));
			
		}
		
		else if (metaBrowser.equalsIgnoreCase("FireFox")) {
			
			
			
		}
		
		
		
		
	}
	
	public static void metaLaunchURL(String URL) {
		
		driver.get(metaprop.getProperty("URL1"));
		
		
	}
}
