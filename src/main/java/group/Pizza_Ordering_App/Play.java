/**
 * 
 */
package group.Pizza_Ordering_App;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author abprashanth
 *
 */
public class Play {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","/home/abprashanth/resources/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/home/abprashanth/resources/chromedriver");
		WebDriver ffDriver = new FirefoxDriver();
		WebDriver chromeDriver = new ChromeDriver();
		ffDriver.get("https://www.google.com");
		String content = ffDriver.getCurrentUrl();
		String source = ffDriver.getPageSource();
		Navigation navigator = ffDriver.navigate();
		navigator.to("https://facebook.com");
		Set<String> windowHandles = ffDriver.getWindowHandles();
		//System.out.println(content);
		//System.out.println(source);
		System.out.println("--------------");
		//System.out.println(windowHandles);
		ffDriver.close();
		
		
	}
}
