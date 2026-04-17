package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest(){

        click(By.cssSelector("a.ico-login"));

        //enter email
        type(By.name("Email"), "arina.poluyanskaya@yandex.ru");
        //enter password
        type(By.name("Password"), "password");

        //click on login button
        click(By.cssSelector("input.login-button"));
        Assert.assertTrue(isElementPresent(By.cssSelector("a.ico-logout")));

    }

}
