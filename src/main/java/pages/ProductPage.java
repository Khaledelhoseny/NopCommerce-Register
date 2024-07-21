package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class ProductPage extends MethodHandels {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCartButton = By.cssSelector(".add-to-cart-button") ;
    private final By successfullToastMessage = By.cssSelector(".content");
    private final By cartQuantity = By.cssSelector(".cart-qty");


    public void clickOnAddToCart(){
        click(addToCartButton);
    }

    public String getSuccessfullToastMessage(){
       return getText(successfullToastMessage);
    }

    public String getCartQuantity(){
        return getText(cartQuantity) ;
    }


}
