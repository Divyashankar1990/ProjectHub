package testCases.loginSection;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.loginPage.LoginPageMethods;
import testUtility.TestClasses;

public class LoginTask extends TestClasses {
    LoginPageMethods loginPage= new LoginPageMethods();
    @Test
    public void loginTask(){
        loginPage.enterUsername(loginPage.userIdValue);
        loginPage.enterPassword(loginPage.passwordValue);
        loginPage.clickLoginButton();
            }
}
