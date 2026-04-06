package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    @Test
    public void findElementByTagNameTest() {
        //поиск элемента по By.tagName
        WebElement element = driver.findElement(By.tagName("h2"));
        System.out.println(element.getText());

        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println(label.getText());

    }

    @Test
    public void findElementById(){
        //поиск элемента по By.id
        WebElement searchterms = driver.findElement(By.id("small-searchterms"));
        System.out.println(searchterms.getDomAttribute("id"));
    }

    @Test
    public void findElementByClassName(){
        //поиск элемента по By.className
        WebElement searchBoxText = driver.findElement(By.className("search-box-text"));
        System.out.println(searchBoxText.getText());

    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();

    }

}
