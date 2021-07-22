import steps.*;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by 777 on 07.05.2017.
 */
public class ExampleTest extends BaseSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    AllProgramSteps allProgramSteps = new AllProgramSteps();
    TravelInsuranceSteps travelInsuranceSteps = new TravelInsuranceSteps();
    PolicyCoverSteps policyCoverSteps = new PolicyCoverSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();
    HashMap<String, String> testData = new HashMap<>();


    @Title("Страхование Путешественников")
    @Test
    public void Test(){
        testData.put("Фамилия Застрахованного","Иванов");
        testData.put("Имя Застрахованного", "Иван");
        testData.put("Дата рождения Застрахованного", "12.10.1990");
        testData.put("Фамилия Страхователя", "Иванов");
        testData.put("Имя Страхователя", "Иван");
        testData.put("Отчество Страхователя", "Иванович");
        testData.put("Дата рождения Страхователя", "12.10.1990");
        testData.put("Дата выдачи паспорта", "12.10.2010");
        testData.put("Кем выдан", "МВД");
        testData.put("Серия паспорта", "7856");
        testData.put("Номер паспорта", "564856");

        mainPageSteps.selectStepMenuCookie("Закрыть");
        mainPageSteps.selectStepMenuInsurance("Страхование");
        mainPageSteps.selectStepMenuAllPrograms("Все страховые программы");

        allProgramSteps.selectStepTravelInsurance("Страхование путешественников");

        travelInsuranceSteps.selectStepCheckPageTitle("Страхование путешественников");
        travelInsuranceSteps.selectStepTravelInsuranceOrder("Оформить онлайн");

        policyCoverSteps.stepSelectMinimalCover("Минимальная");
        policyCoverSteps.stepSelectSendAppBtn();

        sendAppSteps.stepFillFields(testData);
        sendAppSteps.stepSelectSex("Женский");
        sendAppSteps.stepCheckFillFields(testData);
        sendAppSteps.stepSelectSendAppBtn("Отправить заявку");
        sendAppSteps.checkErrorMessageField("Общее сообщение об ошибке","При заполнении данных произошла ошибка");
        sendAppSteps.checkFieldPhone("Телефон","Поле не заполнено.");
        sendAppSteps.checkFieldEmail("Эл.почта","Поле не заполнено.");
        sendAppSteps.checkFieldRepeatEmail("Повтор Эл.почты","Поле не заполнено.");
    }
}
