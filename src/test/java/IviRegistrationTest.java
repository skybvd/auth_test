import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static pages.IviAuthForm.*;
import static pages.IviMainPage.*;
import static pages.IviProfilePage.*;
import static utils.RangomLogin.*;


public class IviRegistrationTest extends TestBase {

    String login = generateRandomEmail();
    @Test
    @Description("Регистрация нового пользователя на ivi.ru")
    public void registration(){

        openIviMainPage();
        clickProfileButton();
        clickLogIn_RegisterButton();
        insertEmail(login);
        clickSubmitButton();
        clickConfirmButton();
        setNewPassword("qwerty32132qw");
        clickRegistrationButton();
        checkLoginName(login);
        clickExitLink();
    }

}

