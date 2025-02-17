package register;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.RegisterResultPage;
import readFile.ReadDataFromJson;

import java.io.FileNotFoundException;

public class RegisterTests extends BaseTests {

    @Test
    public void testSuccessfulRegister () throws InterruptedException, FileNotFoundException {
        readDataFromJson = new ReadDataFromJson() ;
        RegisterPage registerPage =  homePage.clickOnRegisterLink() ;
        registerPage.clickOnGenderOption(readDataFromJson.readJsonData().Gender);
        registerPage.insertFirstName(readDataFromJson.readJsonData().FirstName);
        registerPage.insertLastName(readDataFromJson.readJsonData().LastName);
        registerPage.selectDay(readDataFromJson.readJsonData().Day);
        registerPage.selectMonth(readDataFromJson.readJsonData().Month);
        registerPage.selectYear(readDataFromJson.readJsonData().Year);
        registerPage.insertEmail(readDataFromJson.readJsonData().Email);
        registerPage.insertCompanyName(readDataFromJson.readJsonData().CompanyName);
        registerPage.clickOnCheckBox(readDataFromJson.readJsonData().NewsLetter);
        registerPage.insertPassword(readDataFromJson.readJsonData().Password);
        registerPage.insertConfirmPassword(readDataFromJson.readJsonData().ConfirmPassword);
        RegisterResultPage registerResultPage = registerPage.clickOnRegister();
        String actualResult =  registerResultPage.getRegistrationCompletedMessage();
        String expectedResult = "Your registration completed" ;
        Assert.assertEquals(actualResult , expectedResult );
    }

}
