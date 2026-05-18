package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {
    public String addedItemName;

    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton(int itemNumber) {
        click(By.xpath("(//input[@value='Add to cart' and contains(@class,'product-box-add-to-cart-button')])["+ itemNumber +"]"));
    }

    public void clickOnShoppingCartLink() {
        click(By.cssSelector("a.ico-cart"));
    }

    public String getCartItemName() {
        return driver.findElement(By.cssSelector("td.product a.product-name")).getText();
    }

    public String getItemNameByNumber(int itemNumber) {
        return driver.findElement(By.xpath("(//h2[contains(@class,'product-title')]/a)[" + itemNumber + "]")).getText();
    }

    public void deleteAddedItem() {
        click(By.xpath("//tr[.//a[text()='" + addedItemName + "']]//input[@name='removefromcart']"));
        click(By.name("updatecart"));
    }
}
