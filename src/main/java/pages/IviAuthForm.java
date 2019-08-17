package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IviAuthForm {

    @Step("Вводим е-mail")
    public static void insertEmail(String login) {
        $(By.name("emailOrPhone")).shouldBe(Condition.visible).setValue(login);
    }

    @Step("Нажимаем кнопку 'Продолжить'")
    public static void clickSubmitButton(){
        $(By.xpath("//button[contains(text(), 'Продолжить')]")).click();
    }

    @Step("Нажимаем кнопку 'Продолжить' с Политикой конфиденциальности")
    public static void clickConfirmButton(){
        $("div[class*='auth-privacy-policy__button-wrapper']").$("button[class*='js-ivi-privacy-policy-button']").click();
    }

    @Step("Заполняем поля 'Пароль' и 'Повторите пароль'")
    public static void setNewPassword(String pass) {
        $("input[placeholder='Придумайте пароль']").setValue(pass);
        $("input[placeholder='Повторите пароль']").setValue(pass);
    }

    @Step("Нажимаем кнопку 'Зарегистрироваться'")
    public static void clickRegistrationButton(){
        $(By.xpath("//button[contains(text(), 'Зарегистрироваться')]")).click();
    }

    @Step("Вводим пароль")
    public static void insertPassword(String pass){
        $(By.name("emailPassword")).setValue(pass);
    }

    @Step("Нажимаем кнопку 'Продолжить' при авторизации зарегистрированного ранее пользователя")
    public static void clickButton(){
        $(By.xpath("//*[@id='jsEmailAuth']/div/div[2]/button")).click();
    }
}
