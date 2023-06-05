package com.example.flower;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample3 {
	 public static void main( String[] args ) throws InterruptedException
	    {
	    	WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
	       String url="https://demo.wpeverest.com/user-registration/guest-registration-form/";
	       driver.get(url);
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Kanishka");
	       driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("S");
	       driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("kanishkasoundararajan30@gmail.com");
	       driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
	       driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("123kani");
	       driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("2003-11-30");
	       driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
           WebElement wb=driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]"));
           wb.click();
           WebElement m=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select/option[11]"));
           m.click();
           WebElement y=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input"));
           y.click();
           y.clear();
           y.sendKeys("2003");
           WebElement d=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[36]"));
           d.click();
           Thread.sleep(3000);
           WebElement i=driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]/option[103]"));
           i.click();
           WebElement ph=driver.findElement(By.name("phone_1665627880"));
           ph.sendKeys("0917901011");
           WebElement ec=driver.findElement(By.name("phone_1665627865"));
           ec.sendKeys("0919787537");
           WebElement dp=driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]"));
           dp.click();
           WebElement m1=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/select/option[6]"));
           m1.click();
           WebElement y1=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/input"));
           y1.click();
           y1.clear();
           y1.sendKeys("2023");
           WebElement d1=driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[16]"));
           d1.click();
           WebElement ls=driver.findElement(By.name("number_box_1665629930"));
           ls.sendKeys("3");
           WebElement r=driver.findElement(By.name("input_box_1665630010"));
           r.sendKeys("4");
           driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("listening");
           driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
           driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Shared Room\"]")).click();
           driver.findElement(By.xpath("//*[@id=\"radio_1665628131_Vegetarian\"]")).click();
           driver.findElement(By.xpath("//*[@id=\"select_1665628361\"]/option[2]")).click();
           driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
           Thread.sleep(15000);
           WebElement bt=driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button"));
           bt.click();
           //submit
           Thread.sleep(15000);
       	WebElement message_el=driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]/ul"));
       	String message=message_el.getText();
       	System.out.println(message);
       	
       	WebElement firstname=driver.findElement(By.xpath("//*[@id=\"first_name\"]")); 
       	firstname.sendKeys("kanishka");
       	boolean rs=firstname.isDisplayed();
       
       	WebElement email=driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
       	email.sendKeys("kanishkasoundararajan30@gmail.com");
       	boolean res=email.isDisplayed();
       	System.out.println(rs+" "+res);
           
           
           
           
	    }

}
