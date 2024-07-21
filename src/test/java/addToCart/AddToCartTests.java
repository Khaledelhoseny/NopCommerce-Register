package addToCart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class AddToCartTests extends BaseTests {

    @Test
    public void testSuccessfulAddToCart() throws InterruptedException {
        homePage.hoverOverComputersLink();
        homePage.clickOnNotebooksLink();
        ProductPage productPage =  homePage.clickOnAddToCartButton(1);
        productPage.clickOnAddToCart();
        String actualeResult =  productPage.getSuccessfullToastMessage();
        String expectedResult = "The product has been added to your shopping cart" ;
        Assert.assertEquals( actualeResult , expectedResult);
        String actualCartQuantity = productPage.getCartQuantity() ;
        String expectedCartQuantity = "(2)" ;
        Assert.assertEquals( actualCartQuantity , expectedCartQuantity);
    }

}
