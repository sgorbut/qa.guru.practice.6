package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {
    @Test
    public void testRepositoryIssue1(){
        open("https://github.com");
        $(".header-search-input").setValue("sgorbut/qa.guru.practice.6").submit();

        $(linkText("sgorbut/qa.guru.practice.6")).click();
        $$(".js-repo-nav li").findBy(text("Issues")).click();
        $(byText("Issues")).should(Condition.exist);
    }

    @Test
    public void testRepositoryIssue2(){
        open("https://github.com");
        $(".header-search-input").setValue("sgorbut/qa.guru.practice.6").submit();

        $(linkText("sgorbut/qa.guru.practice.6")).click();
        $$(".js-repo-nav li").findBy(text("Issues")).click();
        $(byText("Issues")).should(Condition.exist);
    }
}
