import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;


public class TestBase {

    @BeforeClass
    public static void setup(){

        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        clearBrowserCookies();
    }

    @AfterClass
    public static void tearDown() { Selenide.close(); }
}