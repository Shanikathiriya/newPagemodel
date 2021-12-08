package org.example;

import org.openqa.selenium.By;

public class ProductMailFriend extends Utils
{
    String emailText1="sunny.m.kathiriya+"+currentTimeStamp()+"@gmail.com";
    By emailFriend=By.xpath("//input[@id='FriendEmail']");


    By comment=By.xpath("//textarea[@id='PersonalMessage']");
    By sendEmailButton=By.xpath("//button[@name='send-email']");

    public void  ReferProductToFriend()
    {

        typeText(emailFriend,emailText1);   //type a friend email



        typeText(comment,"Nice Product");//type comment in comment box

        clickOnElement(sendEmailButton);//click on send email button




    }
}
