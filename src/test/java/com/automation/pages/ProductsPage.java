package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BaseClass{
    public ProductsPage(WebDriver driver) {}

    @FindBy(xpath = "//a[text()=' Products']")
    WebElement productsButton;

    @FindBy(xpath = "//h2[text()='All Products']")
    WebElement allProductsHeader;

    @FindBy(id = "search_product")
    WebElement searchInput;

    @FindBy(id = "submit_search")
    WebElement searchButton;

    @FindBy(xpath = "//h2[text()='Searched Products']")
    WebElement searchedProductsHeader;

    @FindBy(className = "product-image-wrapper")
    WebElement searchResult;

    public void clickProductsButton() {
        productsButton.click();
    }

    public boolean isAllProductsHeaderVisible() {
        return allProductsHeader.isDisplayed();
    }

    public void searchProduct(String productName) {
        searchInput.sendKeys(productName);
        searchButton.click();
    } 

    public boolean isSearchedProductsHeaderVisible() {
        return searchedProductsHeader.isDisplayed();
    }

    public boolean areSearchResultsVisible() {
        return searchResult.isDisplayed();
    }
}
