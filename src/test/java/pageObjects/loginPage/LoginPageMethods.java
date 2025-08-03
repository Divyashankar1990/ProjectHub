package pageObjects.loginPage;


public class LoginPageMethods extends LoginPageAssertions{
    // This class can contain methods related to login page actions
    // For example, methods to enter username, password, click login button, etc.

    public void enterUsername(String username) {
        // Code to enter username in the login field
        userId.setValue(username);
    }

    public void enterPassword(String password) {
        // Code to enter password in the password field
        userPassword.setValue(password);
    }

    public void clickLoginButton() {
        // Code to click the login button
        loginButton.click();
    }

    public void navigateToForgotPassword() {
        // Code to navigate to the forgot password page
    }
    public void resetLoginForm() {
        // Code to reset the login form
    }
}
