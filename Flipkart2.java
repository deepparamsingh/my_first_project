package Fipkart;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.screenshot_function;

public class Flipkart2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		//HtmlUnitDriver driver=new HtmlUnitDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window= "+parent);
		
		System.out.println("title of page is "+ driver.getTitle());
		Thread.sleep(1000);
		
		
		WebElement usermobile= driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		sendKeys(driver, usermobile, 10, "9646289871");
		
		WebElement loginPass= driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		sendKeys(driver, loginPass, 10, "Qwer@2021");
	
		
		
		WebElement loginClick= driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]"));
		clickOn(driver, loginClick, 5);
		
		System.out.println("loged in successfully");
		

		System.out.println("---------------------------------------------------------\n");
		Thread.sleep(1000);


		WebElement searchProduct= driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		sendKeys(driver, searchProduct, 10, "optimum nutrition protein");
		
		WebElement searchClick= driver.findElement(By.xpath("//button[@type='submit' and @class='vh79eN']"));
		clickOn(driver, searchClick, 5);
		
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getTitle());
		System.out.println("------------product page-----------------\n");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement productsselect= driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]"));
		clickOn(driver,productsselect , 5);
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getTitle());
		System.out.println("-----------select product page------------------\n");
		
		
		//------------------switch to window ---------------
		
		Set<String> allWindows=driver.getWindowHandles();
		int count= allWindows.size();
		
		System.out.println("Total Window "+count);

		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				
				
				driver.switchTo().window(child);
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				((JavascriptExecutor)driver).executeScript("scroll(0,400)");
				
		
				WebElement Checkpincode= driver.findElement(By.xpath("//span[@class='_2aK_gu']"));
				clickOn(driver, Checkpincode , 5);
			
				
				WebElement pincode= driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
				sendKeys(driver, pincode, 10, "110098");
				//screenshot_function.captureScreenShot(driver,"pincode");
				
				//WebElement select_weight=driver.findElement(By.linkText("4.54 kg"));
				//clickOn(driver, select_weight, 5);
				//screenshot_function.captureScreenShot(driver,"weight");		
				
				 WebElement flavour=driver.findElement(By.xpath("//a[contains(text(),'Rocky Road')]"));
				 clickOn(driver,flavour , 5);
				 driver.getCurrentUrl();
				// screenshot_function.captureScreenShot(driver,"flavour");
		
				 WebElement addtoCart=driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
				 clickOn(driver,addtoCart, 15);
				 System.out.println("Add to cart URL : = "+driver.getCurrentUrl());
				 
				 Thread.sleep(2000);

				 WebElement placeOrder=driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
				 clickOn(driver, placeOrder,15);
				 System.out.println("Place oredr URL : "+driver.getCurrentUrl());
				 
				
				 WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
				 WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
				 WebElement pin=driver.findElement(By.xpath("//input[@name='pincode']"));
				 WebElement locality=driver.findElement(By.xpath("//input[@name='addressLine2']"));
				 WebElement address=driver.findElement(By.xpath("//textarea[@name='addressLine1']")); 
				 WebElement landMark=driver.findElement(By.xpath("//input[@name='landmark']"));
				 WebElement altPhone=driver.findElement(By.xpath("//input[@name='alternatePhone']"));
				 
				 
				 sendKeys(driver, name, 10, "paramdeep Singh");
				 sendKeys(driver, phone, 10, "9646289871");
				 sendKeys(driver, pin, 10, "147001");
				 sendKeys(driver, locality, 10, "Patiala");
				 sendKeys(driver, address, 10, "Flamingo, Saviour Park, Mohan Nagar");
				 sendKeys(driver, landMark, 10, "DLF Cyber City");
				 sendKeys(driver, altPhone, 10, "9876543210");
				 
				 
				 WebElement deliveryTime=driver.findElement(By.xpath("//label[@class='_8J-bZE _2s38SO _29FFjj _3lyfHx _1Icwrf']//label[1]//div[1]"));
				 clickOn(driver, deliveryTime,5);
				 
				
				 WebElement deliveryHereBtn=driver.findElement(By.xpath("//button[@class='_2AkmmA EqjTfe _7UHT_c']"));
				 clickOn(driver, deliveryHereBtn,5);
				 System.out.println("Addess save : "+driver.getCurrentUrl());
				 
				
				 WebElement productIncrease=driver.findElement(By.xpath("//button[text()='+']"));
				 clickOn(driver, productIncrease, 10);
				 
				Thread.sleep(1000);
				 
				 WebElement continueBtn=driver.findElement(By.xpath("//button[@class='_2AkmmA _2Q4i61 _7UHT_c']"));
				 clickOn(driver, continueBtn, 10);
				 System.out.println("Continue  : "+driver.getCurrentUrl());
				 
				 WebElement UpiBtn=driver.findElement(By.xpath("//span[contains(text(),'UPI (PhonePe')]"));
				 clickOn(driver, UpiBtn, 5);
				 
				 WebElement UpiOption=driver.findElement(By.xpath("//div[contains(text(),'Your UPI ID')]"));
				 clickOn(driver, UpiOption, 5);
				 System.out.println("UPI Option  : "+driver.getCurrentUrl());
				
				
				 WebElement UpiValue=driver.findElement(By.xpath("//input[@name='upi-id']"));
				 sendKeys(driver, UpiValue, 10, "deepparamsingh@okaxis");		 
				 
				 WebElement UpiVerify=driver.findElement(By.xpath("//div[@class='_2lVOlz']"));
				 clickOn(driver, UpiVerify, 5);
				 System.out.println("verify  : "+driver.getCurrentUrl());
				 
			}
		}
	   

	}
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
}
