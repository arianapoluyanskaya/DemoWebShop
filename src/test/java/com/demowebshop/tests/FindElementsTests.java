/*package com.demowebshop.tests;

import com.demowebshop.core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElementsTests extends TestBase {

    @Test
    public void isLogoImgPresentTest(){
        System.out.println("Logo image is " + app.getisLogoImgPresent());
        //Assert.assertTrue(isLogoImgPresent());
    }

    @Test
    public void findElementByTagNameTest() {
        // Find element by tag name
        WebElement element = app.driver.findElement(By.tagName("h2"));
        System.out.println(element.getText());

        WebElement label = app.driver.findElement(By.tagName("label"));
        System.out.println(label.getText());

    }

    @Test
    public void findElementById(){
        // Find element by ID
        WebElement searchterms = app.driver.findElement(By.id("small-searchterms"));
        System.out.println(searchterms.getDomAttribute("id"));
    }

    @Test
    public void findElementByClassName(){
        // Find element by class name
        WebElement searchBoxText = app.driver.findElement(By.className("search-box-text"));
        System.out.println(searchBoxText.getText());

    }

    @Test
    public void findElementByLinkTextAndPartialLinkTextTest() {

        // 1. link text
        WebElement register = app.driver.findElement(By.linkText("Register"));
        System.out.println(register.getText());

        // 2. link text
        WebElement login = app.driver.findElement(By.linkText("Log in"));
        System.out.println(login.getText());

        // 3. link text
        WebElement shopping_cart = app.driver.findElement(By.linkText("Shopping cart"));
        System.out.println(shopping_cart.getText());

        // 4. link text
        WebElement wishlist = app.driver.findElement(By.linkText("Wishlist"));
        System.out.println(wishlist.getText());

        // 5. link text
        WebElement books = app.driver.findElement(By.linkText("Books"));
        System.out.println(books.getText());

        // 6. link text
        WebElement computers = app.driver.findElement(By.linkText("Computers"));
        System.out.println(computers.getText());

        // 7. partial link text
        WebElement reg = app.driver.findElement(By.partialLinkText("Reg"));
        System.out.println(reg.getText());

        // 8. partial link text
        WebElement log = app.driver.findElement(By.partialLinkText("Log"));
        System.out.println(log.getText());

        // 9. partial link text
        WebElement shopping = app.driver.findElement(By.partialLinkText("Shopping"));
        System.out.println(shopping.getText());

        // 10. partial link text
        WebElement wish = app.driver.findElement(By.partialLinkText("Wish"));
        System.out.println(wish.getText());

        // 11. partial link text
        WebElement book = app.driver.findElement(By.partialLinkText("Book"));
        System.out.println(book.getText());

        // 12. partial link text
        WebElement comp = app.driver.findElement(By.partialLinkText("Comp"));
        System.out.println(comp.getText());
    }

   /* @Test
    public void findElementByCssSelectorTest() {

        // 1. by id
        WebElement search_input = driver.findElement(By.cssSelector("#small-searchterms"));
        System.out.println(search_input.getAttribute("value"));

        // 2. by class
        WebElement header_logo = driver.findElement(By.cssSelector(".header-logo"));
        System.out.println(header_logo.isDisplayed());

        // 3. by tag
        WebElement first_link = driver.findElement(By.cssSelector("a"));
        System.out.println(first_link.getText());

        // 4. by attribute
        WebElement register = driver.findElement(By.cssSelector("[href='/register']"));
        System.out.println(register.getText());

        // 5. by tag + class
        WebElement login = driver.findElement(By.cssSelector("a.ico-login"));
        System.out.println(login.getText());

        // 6. by tag + id
        WebElement newsletter_email = driver.findElement(By.cssSelector("input#newsletter-email"));
        System.out.println(newsletter_email.getAttribute("value"));

        // 7. by tag + attribute
        WebElement cart = driver.findElement(By.cssSelector("a[href='/cart']"));
        System.out.println(cart.getText());

        // 8. by parent + child
        WebElement books = driver.findElement(By.cssSelector(".top-menu a[href='/books']"));
        System.out.println(books.getText());

        // 9. by parent > child
        WebElement search_button = driver.findElement(By.cssSelector(".search-box > input"));
        System.out.println(search_button.getAttribute("value"));

        // 10. by multiple classes
        WebElement search_button_by_classes = driver.findElement(By.cssSelector(".button-1.search-box-button"));
        System.out.println(search_button_by_classes.getAttribute("value"));

        // 11. by attribute contains
        WebElement wishlist = driver.findElement(By.cssSelector("a[href*='wishlist']"));
        System.out.println(wishlist.getText());

        // 12. by attribute starts with
        WebElement top_menu_link = driver.findElement(By.cssSelector("a[href^='/apparel']"));
        System.out.println(top_menu_link.getText());

    }

} 
*/