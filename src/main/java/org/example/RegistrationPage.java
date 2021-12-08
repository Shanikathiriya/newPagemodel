package org.example;

import org.openqa.selenium.By;


public class RegistrationPage extends Utils
{

     By firstName=By.xpath("//input[@id='FirstName']");

     By lastName=By.xpath("//input[@name='LastName']");

     By day=By.name("DateOfBirthDay");
     By month=By.name("DateOfBirthMonth");
     By year=By.name("DateOfBirthYear");
    // String emailText="krishnasanghani0+" +currentTimeStamp()+ "@gmail.com";
     By email1=By.name("Email");



     By newsLetter=By.id("Newsletter");

     By passWord=By.id("Password");

     By registerButton=By.name("register-button");
     By confirmPassword=By.id("ConfirmPassword");



   public void registrationDetails()
   {

     typeText(firstName,"krishna");
     typeText(lastName,"sanghani");
     selectDay(day,"15");
     selectMonth(month,"10");
     selectYear(year,5);

     typeText(email1,"krishnasanghani0+" +currentTimeStamp()+ "@gmail.com");
     clickOnElement(newsLetter);
     typeText(passWord,"Krishna1234567");
     typeText(confirmPassword,"Krishna1234567");
     waitForClickabInSEle(registerButton,20);
     clickOnElement(registerButton);



   }

}
