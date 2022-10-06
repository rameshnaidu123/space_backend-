package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class Order_create_preprod {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://odin2-preprod.nnnow.com/products");
        WebElement element1=driver.findElement(By.cssSelector("[alt='U.S. Polo Assn. Boys Linen Short Sleeve Shirt']"));
        Actions act=new Actions(driver);
        act.moveToElement(element1).click().build().perform();
        // driver.findElement(By.xpath("//div[text()='Boys Linen Short Sleeve Shirt']/following-sibling::a//i[@class='icomoon-bag1']")).click();
        String parentid= driver.getWindowHandle();
        Set<String> ids=driver.getWindowHandles();
        for(String childId:ids){
            if(!parentid.equals(childId)){
                driver.switchTo().window(childId);
            }

        }

        driver.findElement(By.xpath("//div[@class='nw-sizeblock-list nwc-custom-scrollbar']//button[3]")).click();
        driver.findElement(By.cssSelector("[class='nwc-btn nwc-ripple-container nwc-btn-primary nw-pdp-addtobag']")).click();
        driver.findElement(By.cssSelector("[class='nwc-btn nwc-ripple-container nwc-btn-primary nw-pdp-addtobag']")).click();
        driver.findElement(By.xpath("//div[@class='nw-loginv2-container']/form//following-sibling::div/input[@tabindex='0']")).sendKeys("7660932298");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//form[@class='nw-sublogin2-form']//div/input[@type='password']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
        driver.findElement(By.xpath("//button[text()='CHANGE']")).click();
        driver.findElement(By.xpath("//div[@class='nwc-grid-col nw-addresslist-list']//div[6]")).click();
        driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
       // driver.findElement(By.xpath("//div[@class='nw-paymentview-options']/div/div/following-sibling::div//label[@for='CASH_ON_DELIVERY']//i")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[text()='PLACE ORDER']")).click();

        System.out.println("new changes for git");










    }


}
