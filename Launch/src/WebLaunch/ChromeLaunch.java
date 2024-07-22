package WebLaunch;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch 
{
	public static void main(String[] args)
	{
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//Launch the website
		wd.get("https://www.youtube.com/");
		
		//wd.quit();
		
		//just like this you can launch any website using the url.
		//wd.get("https://www.amazon.in/log-in/s?k=log+in");
		//wd.get("https://www.flipkart.com/");
		
		
	}

}
