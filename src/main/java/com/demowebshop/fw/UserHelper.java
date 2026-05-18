package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import com.demowebshop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutButtonPresent() {
        return isElementPresent(By.cssSelector("a.ico-logout"));
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("a.ico-login"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("input.login-button"));
    }

    public void fillLoginForm(User user) {
        type(By.name("Email"), user.getEmail());
        type(By.name("Password"), user.getPassword());
    }

    public boolean isLogOutButtonPresent() {
        return isLogoutButtonPresent();
    }

    public void clickOnRegistrationButton() {
        click(By.name("register-button"));
    }

    public void fillRegisterForm(User user) {
        type(By.name("FirstName"), user.getFirstName());
        type(By.name("LastName"), user.getLastName());
        type(By.name("Email"), user.getEmail());
        type(By.name("Password"), user.getPassword());
        type(By.name("ConfirmPassword"), user.getPassword());
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("a.ico-register"));
    }

    public boolean isErrorMessagePresent() {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".message-error")))
                    .getText()
                    .contains("The specified email already exists");
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.cssSelector("a.ico-login"));
    }

    public void clickOnSignOutButton() {
        click(By.cssSelector("a.ico-logout"));
    }
}
