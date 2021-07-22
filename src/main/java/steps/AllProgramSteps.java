package steps;

import pages.AllProgramsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class AllProgramSteps extends BaseSteps{


    @Step ("Выбран тип страхование путешественников{0}")
    public void selectStepTravelInsurance(String menuItem) {
        new AllProgramsPage().selectTravelInsurance(menuItem);
    }


}
