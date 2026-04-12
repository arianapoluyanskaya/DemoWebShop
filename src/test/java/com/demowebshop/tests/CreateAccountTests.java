package com.demowebshop.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegisterPositiveTest(){
        int i = (int)((System.currentTimeMillis()/1000)%3600);

        //click on register link
        click();
        //choose gender
        driver.findElement(By.id("gender-female")).click();
        //enter first name
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Arina");
        //enter last name
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Poluyanskaya");
        //enter email
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("arina.poluyanskaya" + i + "@yandex.ru");
        //enter password
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("password");
        //confirm password
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("password");
        //click on register button
        driver.findElement(By.name("register-button")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector("a.ico-register")));
    }

    public void click() {
        driver.findElement(By.cssSelector("a.ico-register")).click();
    }

    @Test
    public void existedUserRegisterNegativeTest(){

        //click on register link
        click();
        //choose gender
        driver.findElement(By.id("gender-female")).click();
        //enter first name
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Arina");
        //enter last name
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Poluyanskaya");
        //enter email
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("arina.poluyanskaya@yandex.ru");
        //enter password
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("password");
        //confirm password
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("password");
        //click on register button
        driver.findElement(By.name("register-button")).click();
        Assert.assertTrue(isAlertPresent());
    }

    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.alertIsPresent());
        if(alert==null) {
            return false;
        } else {
            return true;
        }
    }

}
