package org.fasttrackit.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductsGrid {

    @FindBy(css = ".product-name a")
    private List<WebElement> productNames;




    public Select getSortByList() {
        return new Select(sortByList);
    }

    @FindBy(css = ".sort-by select")
private WebElement sortByList;


    public List<WebElement> getProductNames() {
        return productNames;
    }

    @FindBy(className ="sort-by-switcher")
    private WebElement sortDirectionOnLink;

    public WebElement getSortDirectionOnLink() {
        return sortDirectionOnLink;}

    public List<WebElement> getProductPrices() {
        return productPrices;
    }

    @FindBy(xpath = "//div[@class = 'price-box']//*[@class!='old-price']//*[@class='price']")
            private List<WebElement> productPrices;

    public WebElement sortDirectionLink() {
        return setDescendingDirection;
    }

    @FindBy(css = "a[title ='Set Descending Direction']")
    private WebElement setDescendingDirection;
}
