package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.MethodHandels;

import java.util.Objects;

public class RegisterPage extends MethodHandels {
    public Select select ;
    public RegisterPage( WebDriver driver ){
        super(driver);
    }

    private final By maleOption = By.xpath("//input[@value=\"M\"]") ;
    private final By feMaleOption = By.xpath("//input[@value=\"F\"]") ;
    private final By firstName =By.xpath("//input[@id=\"FirstName\"]") ;
    private final By lastName =By.xpath("//input[@id=\"LastName\"]") ;
    private final By daysList =By.xpath("//select[@name=\"DateOfBirthDay\"]") ;
    private final By monthList =By.xpath("//select[@name=\"DateOfBirthMonth\"]") ;
    private final By yearList =By.xpath("//select[@name=\"DateOfBirthYear\"]") ;
    private final By email = By.id("Email");
    private final By companyName = By.id("Company");
    private final By checkBox =By.xpath("//input[@type='checkbox']") ;
    private final By password = By.id("Password") ;
    private final By confrimPassword = By.id("ConfirmPassword") ;
    private final By registerButton = By.id("register-button") ;

    public void clickOnGenderOption (String gender) {
        if(Objects.equals(gender, "Male")){
            click(maleOption);
        }else {
            click(feMaleOption);
        }
    }

    public void insertFirstName(String text){
        sendKeys(firstName , text);
    }
    public void insertLastName(String text){
        sendKeys(lastName , text);
    }

    public void selectDay( int index){
        select = new Select(webElement(daysList)) ;
        select.selectByIndex(index);
    }
    public void selectMonth( String text){
        select = new Select(webElement(monthList)) ;
        select.selectByVisibleText(text);
    }
    public void selectYear( String text){
        select = new Select(webElement(yearList)) ;
        select.selectByVisibleText(text);
    }

    public void insertEmail(String text){
        sendKeys(email,text);
    }
    public void insertCompanyName(String text){
        sendKeys(companyName,text);
    }

    public void clickOnCheckBox(boolean newsLetter){
      boolean isSelected = webElement(checkBox).isSelected();
      if(isSelected == !newsLetter){
          click(checkBox);
      }
    }

    public void insertPassword(String text){
        sendKeys(password,text);
    }
    public void insertConfirmPassword(String text){
        sendKeys(confrimPassword,text);
    }

    public RegisterResultPage clickOnRegister(){
        click(registerButton);
        return new RegisterResultPage(driver) ;
    }



}
