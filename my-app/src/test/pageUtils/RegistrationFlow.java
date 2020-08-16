package test.pageUtils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import test.pageObjects.EAAppHomePageObjects;
import test.pageObjects.EAAppRegisterPage;

public class RegistrationFlow {
    WebDriver driver;
    public RegistrationFlow(WebDriver driver){
        this.driver = driver;
    }

    public void RegisterUser(String un , String pwd, String cPwd , String email){
        EAAppHomePageObjects hpo = new EAAppHomePageObjects(driver);
        EAAppRegisterPage rp = new EAAppRegisterPage(driver);
        hpo.RegisterLink().click();
        rp.GetUserName().sendKeys(un);
        rp.GetPassword().sendKeys(pwd);
        rp.GetConfirmPassword().sendKeys(cPwd);
        rp.GetEmail().sendKeys(email);
        rp.GetRegisterButton().click();
    }

    public void UserNameRequiredValidation(){
        EAAppRegisterPage rp = new EAAppRegisterPage(driver);
        String unValidation = rp.GetUserNameValidation().getText();
        Assert.assertEquals(unValidation,"The UserName field is required.");
    }

    public void PasswordRequiredValidation(){
        EAAppRegisterPage rp = new EAAppRegisterPage(driver);
        String pwdValidation = rp.GetPwdValidation().getText();
        Assert.assertEquals(pwdValidation,"The Password field is required.");
        String confirmValidation = rp.GetConfirmPwdValidation().getText();
        Assert.assertEquals(confirmValidation,"The password and confirmation password do not match.");
    }
    public void ConfirmPwdRequiredValidation(){
        EAAppRegisterPage rp = new EAAppRegisterPage(driver);
        String confirmValidation = rp.GetConfirmPwdValidation().getText();
        Assert.assertEquals(confirmValidation,"The password and confirmation password do not match.");
    }
    public void EmailIsRequiredValidation(){
        EAAppRegisterPage rp = new EAAppRegisterPage(driver);
        String emailValidation = rp.GetEmailValidation().getText();
        Assert.assertEquals(emailValidation,"The Email field is required.");
    }
}
