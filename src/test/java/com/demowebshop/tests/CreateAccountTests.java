package com.demowebshop.tests;

import com.demowebshop.core.TestBase;
import com.demowebshop.data.UserData;
import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test
    public void newUserRegisterPositiveTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);

        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(new User()
                .setFirstName(UserData.firstName)
                .setLastName(UserData.lastName)
                .setEmail(UserData.emailPrefix + i + UserData.emailDomain)
                .setPassword(UserData.password));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isLogOutButtonPresent());
    }


    @Test
    public void existedUserRegisterNegativeTest(){
        
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm(new User()
                .setFirstName(UserData.firstName)
                .setLastName(UserData.lastName)
                .setEmail(UserData.email)
                .setPassword(UserData.password));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isErrorMessagePresent());
    }

    /*public boolean isErrorMessagePresent() {
        return driver.findElement(By.cssSelector(".message-error")).getText().contains("The specified email already exists");
    }*/

}
