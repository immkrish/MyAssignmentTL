package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver cd = new ChromeDriver();
      cd.get("https://login.salesforce.com/");
      cd.manage().window().maximize();
      String Titlename = cd.getTitle();
      System.out.println(Titlename);
      cd.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
      cd.findElement(By.id("password")).sendKeys("Leaf$1234");
      cd.findElement(By.id("Login")).click();
      
      
      
      
      
      
	}

}
