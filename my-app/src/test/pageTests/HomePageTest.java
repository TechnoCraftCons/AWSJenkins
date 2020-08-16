package test.pageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.pageObjects.EAAppHomePageObjects;
import test.pageUtils.HomePageAssertions;

public class HomePageTest {
    WebDriver driver;
    @BeforeMethod
    public void SetupTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nebiy\\OneDrive\\Desktop\\JulyChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://eaapp.somee.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void CleanUp(){
        driver.close();
    }
    @Test(groups = "Smoke")
    public void ClickAboutPage(){
        EAAppHomePageObjects hpo = new EAAppHomePageObjects(driver);
        HomePageAssertions hpa = new HomePageAssertions(driver);
        hpo.AboutPageLink().click();
        hpo.HomePageLink().click();
        hpa.HomePageAssertion();

    }
    @Test
    public void ClickHomePage(){
        EAAppHomePageObjects hpo = new EAAppHomePageObjects(driver);
        HomePageAssertions hpa = new HomePageAssertions(driver);
        hpo.HomePageLink().click();
        hpa.HomePageAssertion();

    }
}
