package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EAAppRegisterPage {
    WebDriver driver;

    public EAAppRegisterPage(WebDriver driver){
        this.driver = driver;
    }

    By userName = By.xpath("//input[@id='UserName']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    By email = By.xpath("//input[@id='Email']");
    By register  = By.xpath("//input[@value='Register']");
    By userNameIsRequired = By.xpath("//ul/li[contains(text(),'The UserName field is required.')]");
    By passwordIsRequired = By.xpath("//ul/li[contains(text(),'The Password field is required.')]");
    By pwdAndConfirmPwdNotMatch = By.xpath("//ul/li[contains(text(),'The password and confirmation password do not match.')]");
    By emailIsRequired = By.xpath("//ul/li[contains(text(),'The Email field is required.')]");

    public WebElement GetUserName(){
        return driver.findElement(userName);
    }
    public WebElement GetPassword(){
        return driver.findElement(password);
    }
    public WebElement GetConfirmPassword(){
        return driver.findElement(confirmPassword);
    }
    public WebElement GetEmail(){
        return driver.findElement(email);
    }

    public WebElement GetRegisterButton(){
        return driver.findElement(register);
    }
    public WebElement GetUserNameValidation(){
        return driver.findElement(userNameIsRequired);
    }
    public WebElement GetPwdValidation(){
        return driver.findElement(passwordIsRequired);
    }
    public WebElement GetConfirmPwdValidation(){
        return driver.findElement(pwdAndConfirmPwdNotMatch);
    }
    public WebElement GetEmailValidation(){
        return driver.findElement(emailIsRequired);
    }

}

