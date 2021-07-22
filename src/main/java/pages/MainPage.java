package pages;



import steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Maria on 29.04.2017.
 */
public class MainPage {


    @FindBy(xpath = "//div[@class = 'kitt-cookie-warning__content']//button")
    WebElement menuCookie;

    @FindBy(xpath = "//a[@aria-label = 'Страхование']")
    WebElement menuInsurance;

    @FindBy(xpath = "//a[@data-cga_click_top_menu = 'Страхование_Все страховые программы_type_important']")
    WebElement menuAllPrograms;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMenuCookie(String itemName){
        menuCookie.findElement(By.xpath("//div/button[contains(text(),'"+itemName+"')]")).click();
    }

    public void selectMenuInsuranceItem(String itemName){
        menuInsurance.findElement(By.xpath("//a[@aria-label = '"+itemName+"']")).click();
    }

    public void selectMenuAllPrograms(String itemName){
        menuAllPrograms.findElement(By.xpath("//a[contains(text(),'"+itemName+"')]")).click();
    }
}


