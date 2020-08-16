package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EAAppHomePageObjects {
    WebDriver driver;
    public EAAppHomePageObjects(WebDriver driver){
        this.driver = driver;
    }

    By homePageLink = By.linkText("Home");
    By aboutPageLink = By.linkText("About");
    By registerLink = By.linkText("Register");
    By aboutHeader = By.xpath("//div[1]//h2[1]");
    By coursesHeader = By.xpath("//div[@class='row']//div[2]//h2[1]");
    By sourceCodeHeader = By.xpath("//div[3]//h2[1]");

    public WebElement HomePageLink(){
        return driver.findElement(homePageLink);
    }

    public WebElement AboutPageLink(){
        return driver.findElement(aboutPageLink);
    }

    public WebElement AboutHeader(){
        return driver.findElement(aboutHeader);
    }

    public WebElement CourseHeader(){
        return driver.findElement(coursesHeader);
    }
    public WebElement SourceCodeHeader(){
        return driver.findElement(sourceCodeHeader);
    }

    public WebElement RegisterLink(){
        return driver.findElement(registerLink);
    }
}
