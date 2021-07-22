package pages;

import steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelInsurancePage extends BasePageObject {

    @FindBy(xpath = "//h1[@data-test-id = 'PageTeaserDict_header']")
    public WebElement title;

    @FindBy(xpath = "//a[@data-test-id = 'PageTeaserDict_button']//span[contains(text(),'Оформить онлайн')]")
    public WebElement TravelInsuranceOrder;

    public TravelInsurancePage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void TravelInsuranceClickable(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 10))
                .until(ExpectedConditions.visibilityOf(TravelInsuranceOrder));
        TravelInsuranceOrder.click();
    }
}
