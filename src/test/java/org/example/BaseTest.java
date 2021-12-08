package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    BrowserManager browserManager=new BrowserManager();
    @BeforeMethod
    public void setUpBrowser()// create method for open browser
    {
        browserManager.openBrowser();

    }
    @AfterMethod
    public void tearBrowser()//create method for close browser
    {
        browserManager.closeBrowser();
    }

}
