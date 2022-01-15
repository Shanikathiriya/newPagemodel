package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    HomePage homePage=new HomePage();
   RegistrationPage registrationPage=new RegistrationPage();
   RegistrationResultPage registrationResultPage=new RegistrationResultPage();
   Computers computers=new Computers();
   Desktops desktops=new Desktops();
   BuildYourOwnComputer buildYourOwnComputer=new BuildYourOwnComputer();
   ProductMailFriend productMailFriend=new ProductMailFriend();
   ReferProductResult referProductResult=new ReferProductResult();
   NavigateToDesktopResultPage navigateToDesktopResultPage=new NavigateToDesktopResultPage();
   NewReleaseDetails newReleaseDetails=new NewReleaseDetails();
   NewReleaseCommentResult newReleaseCommentResult=new NewReleaseCommentResult();

    @Test
    public void verifyRegisterUserShouldBeAbleToReferProduct()
    {
        homePage.clickOnRegisterButton();
        registrationPage.registrationDetails();

        homePage.clickOnComputerMenu();
        computers.clickOnDeskTop();
        desktops.clickOnBuildYourOwnButton();
        buildYourOwnComputer.clickOnMailFriendButton();
        productMailFriend.ReferProductToFriend();
        referProductResult.verifyUserHAsSuccessFullySendEmail();


    }


    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registrationPage.registrationDetails();
        registrationResultPage.verifyUserHAsSuccessFullyRegistered();


    }
    @Test
    public void verifyUserVisibleToNavigateDesktopPage()

    {
       homePage.clickOnComputerMenu();
       computers.clickOnDeskTop();
       navigateToDesktopResultPage.verifyUserHAsSuccessFullyNavigateDesktopPage();


    }
    @Test
    public void verifyUserShouldBeAbleToNewsCommentSuccessfullyAdd()
    {
        homePage.clickOnNewsDetails();
        newReleaseDetails.newsCommentAdd();
        newReleaseCommentResult.verifyUserHAsSuccessFullyCommentAdded();

    }





}
