package org.phone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Covid {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arthi Yuvaraj\\Desktop\\New folder\\Ama\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://covidindia.org/");
	   WebElement th=driver.findElement(By.xpath("(//th)[1]"));
	   System.out.println(th.getText());

	   List<WebElement> td=driver.findElements(By.xpath("//td[@class='column-1']"));
	   for (WebElement webElement : td) {
		   System.out.println(webElement.getText());
	      }
	   WebElement th1=driver.findElement(By.xpath("(//th)[2]"));
	   System.out.println(th1.getText());

	   List<WebElement> td2=driver.findElements(By.xpath("//td[@class='column-2']"));
	   for (WebElement webElement1 : td2) {
		   System.out.println(webElement1.getText());
		}





	    
	}

}
