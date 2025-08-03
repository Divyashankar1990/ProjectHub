package pageObjects.loginPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPageElements  {

    public String userIdValue = "mngr630006";
    public String passwordValue = "manemam";

    public SelenideElement userId=$x("//input[@name='uid']");
    public SelenideElement userPassword =$x("//input[@name='password']");
    public SelenideElement loginButton=$x("//input[@name='btnLogin']");
    public SelenideElement resetButton=$x("//input[@name='btnReset']");
    public SelenideElement loginPageTitle=$x("//h2[contains(text(),'Guru99 Bank')]");


}
