package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
      WebElement  username= driver.findElement(By.id("username"));
      username.sendKeys("Demosalesmanager");
      WebElement  password = driver.findElement(By.id("password"));
      password.sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      String Welcome =driver.getTitle();
      System.out.println(Welcome);
      driver.findElement(By.partialLinkText("/SFA")).click();
      String Myhome =driver.getTitle();
      System.out.println(Myhome);
          
      driver.findElement(By.linkText("Leads")).click();
      
      String Myleadpage =driver.getTitle();
      System.out.println(Myleadpage);
        
      driver.findElement(By.partialLinkText("Create")).click();
      String createLead = driver.getTitle();
      System.out.println(createLead);
      WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
      companyName.sendKeys("TestLeaf");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Krish");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chellam");
      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KC");
      driver.findElement(By.name("departmentName")).sendKeys("TSG");
      driver.findElement(By.className("inputBox")).sendKeys("Technical");
      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("krish18.krish18@gmail.com");
     WebElement dropDown= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
     Select s = new Select(dropDown);
     s.selectByVisibleText("New York");
     driver.findElement(By.name("submitButton")).click();
     String newLeadAdded =driver.getTitle();
     System.out.println(newLeadAdded);
     
      
      
      
      
      		
		
	}

}
