package pages;

import steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProgramsPage extends BasePageObject {

    @FindBy(xpath = "//*[@class='page-header']/*")
    public WebElement title;

    @FindBy(xpath = "//h3[contains(text(),'Страхование путешественников')]")
    public WebElement TravelInsurance;

    public AllProgramsPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectTravelInsurance(String itemName){
        TravelInsurance.findElement(By.xpath("//h3[contains(text(),'"+itemName+"')]")).click();
    }
}
