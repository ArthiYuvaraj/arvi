package org.phone;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Arthi Yuvaraj\\Desktop\\New folder\\Ama\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    WebElement text=driver.findElement(By.id("twotabsearchtextbox"));
    text.sendKeys("Iphone");
    WebElement search=driver.findElement(By.xpath("//input[@value='Go']"));
    search.click();
    List<WebElement>phone=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
    int number=phone.size();
    System.out.println("Number of iphone listed"+number);
    //WebElement min=driver.findElement(By.id("low-price"));
    //min.sendKeys("50000");
    WebElement go=driver.findElement(By.xpath("//input[@class='a-button-input']"));
    go.click();
    WebElement check=driver.findElement(By.xpath("//span[text()='iOS']"));
    check.click();
    //List<WebElement>fifty=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
    //int no=fifty.size();
    //System.out.println("Number of iphone above 50k"+no);
    List<WebElement>fift=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    System.out.println("number of iphones above 50 k");
    for (WebElement webElement : fift) {
    	String a=webElement.getText();
    	String b=a.replace(",","");
    	int c=Integer.parseInt(b);
	    if(c>50000) 
		System.out.println(a);
	}

    Set<WebElement>n=new LinkedHashSet<WebElement>();
    n.addAll(phone);
    int i=n.size();
    if(i==number) {
    System.out.println("There is no duplicate");
    }
    else
    {
    	System.out.println("Duplicates are there"+i);
    }
    
    
    
    
}
}