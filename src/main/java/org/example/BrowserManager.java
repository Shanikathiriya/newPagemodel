package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserManager extends BasePage // create browser manager class inherit base page class
{
    String browserName="chrome";
  //  String browserName=System.getProperty("Browser");

    public void openBrowser()// create method for open browser
    {


        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
            driver=new ChromeDriver();

        }
        else if(browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/msedgedriver.exe");
            driver=new EdgeDriver();

        }
        else
        {
            System.out.println("your browser name is wrong");
        }

        driver.get("https://demo.nopcommerce.com/");

    }

    public void closeBrowser()//create method for close browser
    {
        driver.close();
    }
}
