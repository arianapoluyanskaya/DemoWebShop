package com.demowebshop.tests;

import com.demowebshop.core.TestBase;
import com.demowebshop.data.UserData;
import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User()
                .setEmail(UserData.email)
                .setPassword(UserData.password));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addItemToCartPositiveTest(){

        int itemNumber = 2;

        app.getItem().clickOnAddToCartButton(itemNumber);
        app.getItem().addedItemName = app.getItem().getItemNameByNumber(itemNumber);
        app.getItem().clickOnShoppingCartLink();
        String cartItemName = app.getItem().getCartItemName();
        Assert.assertEquals(cartItemName, app.getItem().addedItemName);

    }



    @AfterMethod
    public void postConditions() {
        app.getItem().deleteAddedItem();
    }

}
