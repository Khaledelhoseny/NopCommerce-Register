package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class RegisterResultPage extends MethodHandels {
    public RegisterResultPage(WebDriver driver) {
        super(driver);
    }
    private final By registrationCompletedMessage = By.ByCssSelector.cssSelector(".result") ;
    public String getRegistrationCompletedMessage(){
        return getText(registrationCompletedMessage);
    }

}
