package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleaseCommentResult extends Utils
{
    public void verifyUserHAsSuccessFullyCommentAdded()
    {
        //print message successfully added comment
        String actualS2= getTextFromElement(By.xpath("//div[@class='notifications']/div"));
        // System.out.println(actualS2);
        String expectedS2="News comment is successfully added.";
        Assert.assertTrue(actualS2.equals(expectedS2),"News comment not added");



    }
    public void addd()
    {
        System.out.println("krishani");
    }
}
