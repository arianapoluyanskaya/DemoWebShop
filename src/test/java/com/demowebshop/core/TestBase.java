package com.demowebshop.core;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    //@BeforeMethod
    @BeforeSuite
    public void setUp() {
        app.init();
    }

    //@AfterMethod(enabled = false)
    @AfterSuite
    public void tearDown() {
        // hier ist es richtig, schließe die Umgebung am Ende
        app.stop();
    }

    @BeforeMethod
    public void startTest(ITestResult result){
        // den Namen des tests mit in Logs speichern
        logger.info("Start test: {}", result.getMethod().getMethodName());
    }

    /*@AfterMethod
    public void stopTest(){
        logger.info("Stop test");
    }*/

    @AfterMethod(enabled = true)
    public void tearDown(ITestResult result) {
        if(result.isSuccess()) {
            logger.info("PASSED: {}", result.getMethod().getMethodName());
        } else {
            logger.error("FAILED: {}. Screenshot - > {}", result.getMethod().getMethodName(),
                    app.getUser().takeScreenshot());
        }
        logger.info("Stop test");
        logger.info("*****************************");
        // app.stop() hier war falsch. 
        // Es schließt den Browser/die Session nach jedem Test und die anderen Tests können es nicht nutzen.
        // Führt zu NoSuchSessionException
    }

}
