package com;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import dev.failsafe.internal.util.Assert;

public class Ticket
{
	
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/railways/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String chk = "https://www.makemytrip.com/railways/";
		
		  if(chk.equalsIgnoreCase(driver.getCurrentUrl()))
		  System.out.println("Navigated to correct webpage");
		  else
		  System.out.println("Didn't navigate to correct webpage");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement w =driver.findElement(By.id("toCity"));
		w.sendKeys("Lucknow");

		
		WebElement from =driver.findElement(By.id("fromCity"));
		from.sendKeys("Delhi");
		
		Thread.sleep(2000);
		
		WebElement f1 =driver.findElement(By.id("react-autowhatever-1-section-0-item-0"));
		f1.click();
		
		Thread.sleep(2000);
		
		WebElement to =driver.findElement(By.id("toCity"));
		to.sendKeys("Lucknow");
		
		Thread.sleep(2000);
		
		WebElement t1 =driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]"));
		t1.click();
		
		Thread.sleep(2000);		
		
		WebElement td =driver.findElement(By.id("travelDate"));
		td.click();
		
		Thread.sleep(2000);
		
		WebElement td1 =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]"));
		td1.click();
		
		Thread.sleep(2000);
		
		WebElement tf = driver.findElement(By.xpath("//*[@id=\"travelFor\"]"));
		tf.sendKeys("");
		
		Thread.sleep(2000);
		
		WebElement i = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/ul"));
		List<WebElement> links = i.findElements(By.tagName("li"));
		for (WebElement option : links) {
		    if("Third AC".equals(option.getText()))
		    {  option.click();   
		    break;}
		}
		
		Thread.sleep(2000);
		
		WebElement butt = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a"));
		butt.click();
		
		
		
		
	}

	
}