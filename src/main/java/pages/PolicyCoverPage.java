package pages;

import steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolicyCoverPage extends BasePageObject {

    @FindBy(xpath = "//h3[contains(text(),'Минимальная')]")
    public WebElement MinimalCover;

    @FindBy(xpath = "//button[contains(text(),'Оформить')]")
    public WebElement sendAppBtn;

    public PolicyCoverPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMinimalCover(String itemName){
        MinimalCover.findElement(By.xpath("//h3[contains(text(),'"+itemName+"')]")).click();
    }

    public void waitSendAppClickable(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(sendAppBtn));
        sendAppBtn.click();
    }
}
