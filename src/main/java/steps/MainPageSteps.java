package steps;



import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Maria on 29.04.2017.
 */
public class MainPageSteps {



    @Step("Закрыто уведомление о куках {0}")
    public void selectStepMenuCookie (String menuItem) {
        new MainPage().selectMenuCookie(menuItem);
    }

    @Step("Выбран раздел страхование{0}")
    public void selectStepMenuInsurance (String menuItem) {
        new MainPage().selectMenuInsuranceItem(menuItem);
    }

    @Step("Выбраны все страховые программы{0}")
    public void selectStepMenuAllPrograms (String menuItem) {
        new MainPage().selectMenuAllPrograms(menuItem);
    }

}
