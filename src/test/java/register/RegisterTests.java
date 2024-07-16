package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterTests extends BaseTests {

    @Test
    public void testSuccessfulRegister () throws InterruptedException {
       RegisterPage registerPage =  homePage.clickOnRegisterLink() ;
        Thread.sleep(3000);
        registerPage.clickOnMaleOption("Male");
    }

}
