package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IviProfilePage {

    @Step("Нажимаем кнопку 'Войти или зарегистрироваться'")
    public static void clickLogIn_RegisterButton() {
        $("button[class*='button_auth']").click();
    }


    @Step("Проверяем логин на который бла выполнена регистрация")
    public static void checkLoginName(String login) {
        $("span.profileUserInfo__infoText").shouldHave(Condition.text(login));
    }

    @Step("Выход из под логина")
    public static void clickExitLink() {
        $(By.xpath("//div[contains(text(), 'Выйти')]")).click();
    }
}