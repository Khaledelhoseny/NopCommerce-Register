package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodHandels{

    protected WebDriver driver ;
    Actions actions ;
     WebDriverWait wait ;
    public MethodHandels (WebDriver driver){
        this.driver = driver ;
    }

    protected WebElement webElement(By locator){
        return driver.findElement(locator) ;
    }

    protected WebElement webElements(By locator , int index){
        return driver.findElements(locator).get(index) ;
    }
    private void waitElement( By locator ){
        wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)) ;

    }
    protected void click(By locator){
        waitElement(locator);
        webElement(locator).click();
    }
    protected void click2(By locator , int index){
        waitElement(locator);
        webElements(locator , index -1 ).click();
    }

    protected void sendKeys( By locator , String text){
        waitElement(locator);
        webElement(locator).sendKeys(text);
    }

    protected String getText( By locator){
        waitElement(locator);
        return webElement(locator).getText();
    }

    protected void hoverOver( By locator){
        actions = new Actions(driver);
        actions.moveToElement(webElement(locator)).build().perform();
    }


    protected void scroll( By locator , int index ){
        actions = new Actions(driver) ;
        actions.scrollToElement(webElements(locator , index-1)).build().perform();
    }






}
