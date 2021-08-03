
package guru.qa;

import org.junit.jupiter.api.Test;

public class AnnotatedStepTest {
    private static final String REPOSITORY = "sgorbut/qa.guru.practice.6";

    private WebSteps steps = new WebSteps();

    @Test
    public void shouldSeeIssueInRepository(){
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldTextIssues();
    }
}