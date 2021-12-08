package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{

        By registerButton= By.xpath("//a[@href='/register?returnUrl=%2F']");
        By newReleaseCommentButton= By.xpath("//div[@class='buttons']/a[@href='/nopcommerce-new-release']");
        By computerMenu= By.xpath("//a[@href='/computers']");

        public void clickOnRegisterButton()
        {

            clickOnElement(registerButton);
        }
        public void clickOnNewsDetails()
        {
            clickOnElement(newReleaseCommentButton);
        }
        public void clickOnComputerMenu()
        {
            clickOnElement(computerMenu); //click on computers category

        }
}
