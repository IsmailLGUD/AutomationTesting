package LaunchingInstalling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		String Title = driver.getTitle();
		System.out.println("Page tittle is : " +Title);
		String URL =driver.getCurrentUrl();
		System.out.println("URL : " + URL);
		driver.close();

	}

}
