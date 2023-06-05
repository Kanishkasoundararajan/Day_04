package com.example.flower;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample2 {
	
	public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
       driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("kanishka");
       driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
       driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("kani@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("kani3011");
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1500)","");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
    }

}
