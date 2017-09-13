/**
 * 
 */
package group.Pizza_Ordering_App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author abprashanth
 *
 */
public class Play {

	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","/home/abprashanth/resources/geckodriver");
		WebDriver ffDriver = new FirefoxDriver();
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("www.google.com");
		String content = chromeDriver.getCurrentUrl();
		System.out.println(content);
		chromeDriver.close();
		
		
	}
}
