import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static pages.IviAuthForm.*;
import static pages.IviAuthForm.clickButton;
import static pages.IviMainPage.clickProfileButton;
import static pages.IviMainPage.openIviMainPage;
import static pages.IviProfilePage.*;

public class IviAuthorizationTest extends TestBase {

    @Test
    @Description("авторизация ранее зарегистированного пользователя на ivi.ru")
    public void authorization(){

        openIviMainPage();
        clickProfileButton();
        clickLogIn_RegisterButton();
        insertEmail("xcs97458@aklqo.com");
        clickSubmitButton();
        insertPassword("qwerty32132qw");
        clickButton();
        checkLoginName("xcs97458@aklqo.com");
        clickExitLink();
    }
}
