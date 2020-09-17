package Fipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import libraries.screenshot_function;

public class flipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromeDriver.exe");
		//WebDriver driver = new ChromeDriver();
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		System.out.println("title of page is "+ driver.getTitle());
		Thread.sleep(2000);
		
		
//		WebElement usermobile= driver.findElement(By.className("_2zrpKA _1dBPDZ"));
//		usermobile.sendKeys("9646289871");
//		Thread.sleep(1000);
//		
//		WebElement loginPass= driver.findElement(By.className("_2zrpKA _3v41xv _1dBPDZ"));
//		loginPass.sendKeys("Qwer@2021");
//		Thread.sleep(1000);
//		
//		WebElement loginClick= driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]"));
//		loginClick.click();
//		Thread.sleep(1000);
//		
//		System.out.println("loged in successfully");
		
		WebElement searchBar= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("Muscle Tech Phase 8 ");
		Thread.sleep(1000);
	
		WebElement searchClick= driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
		searchClick.click();
		System.out.println("title of page is "+ driver.getTitle());
		
		WebElement productClick= driver.findElement(By.xpath("//img[@data-image-index='2']"));
		productClick.click();
		System.out.println("title of product page is "+ driver.getTitle());
		
//		for(int i=4;i<9;i++)
//		{
//			WebElement productImg1= driver.findElement(By.xpath("//div[@id='altImages']//li["+i+"]//span[1]//span[1]//span[1]//input[1]"));
//			productImg1.click();
//			Thread.sleep(2000);
//			screenshot_function.captureScreenShot(driver,"Product_img_"+(i-3));
//		}
		
		WebElement flavour= driver.findElement(By.xpath("//span[@class='a-size-base'][contains(text(),'Banana Bliss')]"));
		//flavour.getText();
		flavour.click();
		//System.out.println("Product flavour is "+ flavour.getText());
		System.out.println("title of page is "+ driver.getTitle());
		
		
		
		
		
		driver.quit();
		
		
		
		
		
//		
		
		
        
	   

	}

}
