package com.automation.testcases;

import com.automation.pages.BaseClass;
import com.automation.pages.ProductsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProduct extends BaseClass {

    @Test
    public void searchProductTest() {
        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);

        productsPage.clickProductsButton();
        Assert.assertTrue(productsPage.isAllProductsHeaderVisible(), "All Products header not visible");

        productsPage.searchProduct("T-shirt");
        Assert.assertTrue(productsPage.isSearchedProductsHeaderVisible(), "Searched Products header not visible");

        Assert.assertTrue(productsPage.areSearchResultsVisible(), "No search results found");
    }
}
