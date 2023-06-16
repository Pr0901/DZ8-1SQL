package page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class PersonalAccountPage {

    public PersonalAccountPage() {
        $("[data-test-id='dashboard']").shouldBe(Condition.visible);
    }

}
