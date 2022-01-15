package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest extends Utils  // create base test class which is extend utils
{
    BrowserManager browserManager=new BrowserManager();
    @BeforeMethod
    public void setUpBrowser() // create method for open browser
    {
        browserManager.openBrowser();

    }
    @AfterMethod

    public void closeBrowser(ITestResult result){
        if (!result.isSuccess()){
            captureScreenshot(result.getName());
        }

        browserManager.closeBrowser();
    }

}
