package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserManager // create method inherit browser manager
{
    public static void clickOnElement(By by)// create click method .this method will execute when fire click event
    {
        driver.findElement(by).click();
    }
    public static void typeText(By by,String text)//  create type text method for type text as input in text box
    {
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by)//get text method for get data
    {
        return driver.findElement(by).getText();
    }
    public static String currentTimeStamp() //current time stamp method
    {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);

    }
    public static void waitForClickabInSEle(By by,int timeInSeconds)//create method wait for clickable
    {
        WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public static void waitForVisible(By by,int timeInSeconds)// create method wait for visible
    {
        WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public void selectDay(By by,String text)
    {
        Select select_d=new  Select( driver.findElement(by));
        select_d.selectByVisibleText(text);
    }
    public void selectMonth(By by,String m)
    {
        Select select_m=new  Select( driver.findElement(by));
        select_m.selectByValue(m);
    }
    public void selectYear(By by,int y)
    {
        Select select_y=new  Select( driver.findElement(by));
        select_y.selectByIndex(y);
    }

}
