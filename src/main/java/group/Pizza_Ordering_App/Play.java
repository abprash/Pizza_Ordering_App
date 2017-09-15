/**
 * 
 */
package group.Pizza_Ordering_App;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		WebDriver ffDriver = new FirefoxDriver();
		//WebDriver chromeDriver = new ChromeDriver();
		ffDriver.get("https://google.com");
		//lets click a button
		List<WebElement> inputElements = ffDriver.findElements(By.tagName("input"));
		System.out.println(inputElements);
		WebDriverWait wait = new WebDriverWait(ffDriver, 15);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Register')]")));
		for(WebElement element : inputElements){
			//System.out.println(element.getClass());
			String attribute  = element.getAttribute("value");
			if(attribute.equals("Google Search"))
			{
				element.click();
			}
		}
		String content = ffDriver.getCurrentUrl();
		String source = ffDriver.getPageSource();
		Navigation navigator = ffDriver.navigate();
		Set<String> windowHandles = ffDriver.getWindowHandles();
		//navigator.to("https://facebook.com");
		
		//System.out.println(content);
		System.out.println("--------------");
		//System.out.println(source);
		//System.out.println(windowHandles);
		//ffDriver.close();
		
	}
}
