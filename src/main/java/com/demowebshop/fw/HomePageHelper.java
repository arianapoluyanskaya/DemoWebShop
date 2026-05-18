package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoImgPresent(){
        return isElementPresent(By.cssSelector(".header-logo img[alt='Tricentis Demo Web Shop']"));
    }
}
