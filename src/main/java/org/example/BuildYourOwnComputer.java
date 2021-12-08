package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils
{
    By emailFriendButton=By.xpath("//button[@class='button-2 email-a-friend-button']");


    public void clickOnMailFriendButton()
    {

        clickOnElement(emailFriendButton);// click on  email a friend
    }
}
