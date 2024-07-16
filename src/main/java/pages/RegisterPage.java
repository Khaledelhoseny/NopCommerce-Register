package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandels;

public class RegisterPage extends MethodHandels {
    public RegisterPage( WebDriver driver ){
        super(driver);
    }


    private final By maleOption = By.xpath("//input[@value=\"M\"]") ;
    private final By feMaleOption = By.xpath("//input[@value=\"F\"]") ;


    public void clickOnMaleOption (String gender) {
        if(gender == "Male"){
            click(maleOption);
        }else {
            click(feMaleOption);
        }
    }



}
