package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class IviMainPage {

    @Step("Открываем главную страницу ivi.ru")
    public static void openIviMainPage() {
        open("https://www.ivi.ru");
    }

    @Step("Нажать кнопку входа в 'Профиль'")
    public static void clickProfileButton() {
        $(By.xpath("//a[@href='/profile']")).shouldBe(visible).click();
    }

}
