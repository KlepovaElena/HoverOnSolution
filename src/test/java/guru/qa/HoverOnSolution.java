package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HoverOnSolution {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test

    void hoverOnSolutionTest() {

        // Открыть главную страницу Github
        open("https://github.com/");

        // Раскрыть дропдаун Solutions
        $(".header-menu-wrapper").$(byText("Solutions")).hover();

        // Выбрать Enterprise
        $(byText("Enterprise")).click();

        // Проверить, что на странице есть заголовок "Build like the best"
        $(".application-main h1").shouldHave(Condition.text("Build like the best"));

    }
}
