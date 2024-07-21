package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.MethodHandels;

public class HomePage extends MethodHandels {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By registerLink = By.linkText("Register") ;
    private final By notebooksLink = By.xpath("(//a[@href=\"/notebooks\"])[1]") ;
    private final By computersLink = By.linkText("Computers") ;
    private final By addToCartButton = By.cssSelector(".button-2:first-of-type") ;

    public RegisterPage clickOnRegisterLink(){
        click(registerLink);
        return new RegisterPage(driver) ;
    }

    public void hoverOverComputersLink(){
        hoverOver(computersLink);
    }
    public void clickOnNotebooksLink(){
        click(notebooksLink);
    }



    public ProductPage clickOnAddToCartButton( int index ){
        scroll(addToCartButton , index);
        click2(addToCartButton , index);
        return new ProductPage(driver) ;
    }




}
