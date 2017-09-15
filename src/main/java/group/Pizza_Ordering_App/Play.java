/**
 * 
 */
package group.Pizza_Ordering_App;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author abprashanth
 *
 */
public class Play {

	public static void main(String[] args){
		
		//basic steps in selenium
		//browse to a site
		//interact with some element
		//get results
		//conclude with results
		
		System.setProperty("webdriver.gecko.driver","/home/abprashanth/resources/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/home/abprashanth/resources/chromedriver");
		//WebDriver ffDriver = new FirefoxDriver();
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://google.com");
		//lets click a button
		WebElement submitButton = chromeDriver.findElement(By.ById.id("_fZl"));
		submitButton.click();
		String content = chromeDriver.getCurrentUrl();
		String source = chromeDriver.getPageSource();
		Navigation navigator = chromeDriver.navigate();
		Set<String> windowHandles = chromeDriver.getWindowHandles();
		//navigator.to("https://facebook.com");
		
		//System.out.println(content);
		System.out.println("--------------");
		System.out.println(source);
		//System.out.println(windowHandles);
		chromeDriver.close();
		
	}
}
