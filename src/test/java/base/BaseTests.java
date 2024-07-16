package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import readFile.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTests {

    WebDriver driver ;
    protected HomePage homePage ;
    //import jdk.internal.net.http.hpack.Huffman;
    public ReadDataFromJson readDataFromJson  ;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver) ;
    }
    @BeforeMethod
    public void goHome() throws FileNotFoundException {
       readDataFromJson  = new ReadDataFromJson() ;
        driver.get(readDataFromJson.readJsonData().URL);
    }

//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }


}
