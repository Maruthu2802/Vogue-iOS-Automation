package com.Tests;

import Base.Baseclass;
import com.automate.customannotations.FrameworkAnnotation;
import com.automate.enums.CategoryType;
import com.automate.pages.HomeScreen;
import com.automate.pages.LandingAndSignInScreen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Credentials;

public class HomeScreenRelated_Tests extends Baseclass {

    HomeScreen homeScreen;
    LandingAndSignInScreen landingAndSignInScreen;


    @BeforeMethod
    public void initialize() {
        landingAndSignInScreen = new LandingAndSignInScreen();
        homeScreen = new HomeScreen();
    }


    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.SMOKE})
    @Test(priority = 23, description = "VD_TC_344_Verify when user click on comment section and with writing anything & click on done keyboard should get hide")
    public void validateCommentingInGroupChat() {
        landingAndSignInScreen.signInFlow(Credentials.subscribedUsername, Credentials.subscribedPassword);
        homeScreen.postCommentInGroupChat();
    }

    @FrameworkAnnotation(author = "Maruthu", category = {CategoryType.SMOKE})
    @Test(priority = 24, description = "VD_TC_260-Posts landing UI for author")
    public void validateIconsOnContributorePage() {
        landingAndSignInScreen.signInFlow(Credentials.contributorUsername,Credentials.contributorPassword);
        homeScreen.validateAllFollwingPostTab();

    }


    @AfterMethod
    public void signOut(){
        homeScreen.signOut();
    }

}
