package test.pageUtils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import test.pageObjects.EAAppHomePageObjects;

public class HomePageAssertions {
    WebDriver driver;
    public HomePageAssertions(WebDriver driver){
        this.driver = driver;
    }
    public void HomePageAssertion(){
        EAAppHomePageObjects hpo = new EAAppHomePageObjects(driver);
        String aboutHeaderText = hpo.AboutHeader().getText();
        Assert.assertEquals(aboutHeaderText,"About");

        String coursesHeaderText = hpo.CourseHeader().getText();
        Assert.assertEquals(coursesHeaderText,"Courses");

        String sourceCodeHeaderText = hpo.SourceCodeHeader().getText();
        Assert.assertEquals(sourceCodeHeaderText,"Source Code");
    }
}
