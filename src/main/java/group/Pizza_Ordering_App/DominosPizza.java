package group.Pizza_Ordering_App;

import java.net.MalformedURLException;
import java.net.URL;

public class DominosPizza {
	
	public static void main(String[] args){
		
	}
	
	public static void signInToDominos() throws MalformedURLException{
		URL dominos = new URL("https://dominos.com/en");
		String signInLinkAttribute = "href:/en/pages/customer/#/customer/login/";//element - "a", href = "/en/pages/customer/#/customer/login/"
		String inputEmailAttribute = "id:Email";//element - input, id="email"
		String passwordAttribute = "id:Password";
		
	}

}
