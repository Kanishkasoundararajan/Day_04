package com.example.flower;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class samplecase1 {

	
	public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
       driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Kanishka");
       driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727821tuee037@skct.edu.in");
       driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Harsh");
       driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("harsha123@gmail.com");
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1500)","");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("heloo");
       driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
       driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
       
    }
}
