package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MethodHandels{

    protected WebDriver driver ;
    WebDriverWait wait ;
    public MethodHandels (WebDriver driver){
        this.driver = driver ;
    }

    public WebElement webElement(By locator){
        return driver.findElement(locator) ;
    }
    public void waitElement( By locator ){
        wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(webElement(locator))) ;

    }
    public void click(By locator){
        waitElement(locator);
        webElement(locator).click();
    }

    public void sendKeys( By locator , String text){
        waitElement(locator);
        webElement(locator).sendKeys(text);
    }







}
