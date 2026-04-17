package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegisterPositiveTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);

        //click on register link
        click(By.cssSelector("a.ico-register"));
        //choose gender
        click(By.id("gender-female"));
        //enter first name
        type(By.name("FirstName"), "Arina");
        //enter last name
        type(By.name("LastName"), "Poluyanskaya");
        //enter email
        type(By.name("Email"), "arina.poluyanskaya" + i + "@yandex.ru");
        //enter password
        type(By.name("Password"), "password");
        //confirm password
        type(By.name("ConfirmPassword"), "password");
        //click on register button
        click(By.name("register-button"));
        Assert.assertTrue(isElementPresent(By.cssSelector("a.ico-logout")));
    }

    @Test
    public void existedUserRegisterNegativeTest(){

        //click on register link
        click(By.cssSelector("a.ico-register"));
        //choose gender
        click(By.id("gender-female"));
        //enter first name
        type(By.name("FirstName"), "Arina");
        //enter last name
        type(By.name("LastName"), "Poluyanskaya");
        //enter email
        type(By.name("Email"), "arina.poluyanskaya@yandex.ru");
        //enter password
        type(By.name("Password"), "password");
        //confirm password
        type(By.name("ConfirmPassword"), "password");
        //click on register button
        click(By.name("register-button"));
        Assert.assertTrue(isAlertPresent());
    }

}
