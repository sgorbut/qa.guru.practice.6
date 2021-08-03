package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaStepTest {
    private static final String REPOSITORY = "sgorbut/qa.guru.practice.6";

    @Test
    public void testRepositoryIssue() {
        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step("Ищем репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").setValue(REPOSITORY).submit();
        });
        step("Переходим в репозиторий", () ->
                $(linkText("sgorbut/qa.guru.practice.6")).click());
        step("Переходим в раздел Issues", () ->
                $$(".js-repo-nav li").findBy(text("Issues")).click());
        step("Проверяем что перешли в раздел Issues", () ->
                $(byText("Issues")).should(Condition.exist));
    }
}