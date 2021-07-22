package steps;


import pages.SendAppPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class SendAppSteps extends BaseSteps{

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new SendAppPage().fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = new SendAppPage().getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessageField(String field, String value){
        new SendAppPage().checkFieldErrorMessage(value);
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkFieldPhone(String field, String value){
        new SendAppPage().checkFieldPhone(value);
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkFieldEmail(String field, String value){
        new SendAppPage().checkFieldEmail(value);
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkFieldRepeatEmail(String field, String value){
        new SendAppPage().checkFieldRepeatEmail(value);
    }

    @Step("заполняются поля")
    public void stepFillFields(HashMap<String, String> fields){
        fields.forEach((k, v)-> fillField(k,v));
    }

    @Step("поля заполнены верно")
    public void stepCheckFillFields(HashMap<String, String> fields){
        fields.forEach((k, v)-> checkFillField(k,v));
    }

    @Step("выбран пол")
    public void stepSelectSex(String value) {
        new SendAppPage().selectSex("Женский");}

    @Step("Отправлена заявка")
    public void stepSelectSendAppBtn(String value) {
        new SendAppPage().sendButton.click();}
}
