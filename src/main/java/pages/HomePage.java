package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class HomePage extends MethodHandels {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By registerLink = By.linkText("Register") ;

    public RegisterPage clickOnRegisterLink(){
        click(registerLink);
        return new RegisterPage(driver) ;
    }



}
