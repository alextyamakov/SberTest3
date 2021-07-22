package steps;

import pages.TravelInsurancePage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class TravelInsuranceSteps extends BaseSteps{

    @Step("заголовок страницы - равен {0}")
    public void selectStepCheckPageTitle(String expectedTitle) {
        String actualTitle = new TravelInsurancePage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("Выбрана кнопка Оформить онлайн {0}")
    public void selectStepTravelInsuranceOrder (String menuItem) {
        new TravelInsurancePage().TravelInsuranceClickable();

    }



}
