package com.cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class question1 {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		//WebElement username=driver.findElement(By.id("input-user-name"));
        //username.sendKeys("standard_user");
        //WebElement passkey=driver.findElement(By.id("input-password"));
        //passkey.sendKeys("secret_sauce");
		WebElement Username=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		Username.sendKeys("standard_user");
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.sendKeys("secret_sauce");
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		Login.click();
		WebElement addtocart =driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        addtocart.click();
        WebElement cart =driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        cart.click();
        WebElement checkout =driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkout.click();
        WebElement fname=driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        fname.sendKeys("Beno");
        WebElement lname=driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        lname.sendKeys("Solomon");
        WebElement code=driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
        code.sendKeys("641008");
        WebElement touch=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        touch.click();
        String title=driver.getTitle();
		String exptit="Swag Labs";
		String url=driver.getCurrentUrl();
		String expurl="https://www.saucedemo.com/checkout-step-two.html";
		Assert.assertEquals(title,exptit);
		Assert.assertEquals(url,expurl);
        
                                                           


	}

}
