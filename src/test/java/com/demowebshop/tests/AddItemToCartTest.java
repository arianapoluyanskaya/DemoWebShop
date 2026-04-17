package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        click(By.cssSelector("a.ico-login"));
        type(By.name("Email"), "arina.poluyanskaya@yandex.ru");
        type(By.name("Password"), "password");
        click(By.cssSelector("input.login-button"));
    }

    @Test
    public void addItemToCartPositiveTest(){
        //click on AddToCart
        click(By.xpath("(//input[@value='Add to cart' and contains(@class,'product-box-add-to-cart-button')])[2]"));
        String secondProductName = driver.findElement(By.xpath("(//h2[contains(@class,'product-title')]/a)[2]")).getText();
        //click on ShoppingCart link
        click(By.cssSelector("a.ico-cart"));
        //Verify the item in the ShoppingCart
        String cartProduct = driver.findElement(By.cssSelector("td.product a.product-name")).getText();
        Assert.assertEquals(cartProduct, secondProductName);

    }

}
