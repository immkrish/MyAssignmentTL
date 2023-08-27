package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String titlename =driver.getTitle();
		
		System.out.println(titlename);
		Thread.sleep(2000);
		
		driver.close();
	}

}
