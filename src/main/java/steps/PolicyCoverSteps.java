package steps;

import pages.PolicyCoverPage;
import ru.yandex.qatools.allure.annotations.Step;

public class PolicyCoverSteps extends BaseSteps{

    @Step("Выбрано минимальное покрытие")
    public void stepSelectMinimalCover (String menuItem) {
        new PolicyCoverPage().selectMinimalCover(menuItem);
    }

    @Step("Выполнено нажатие на кнопку Оформить")
    public void stepSelectSendAppBtn() {
        new PolicyCoverPage().waitSendAppClickable();
    }

}
