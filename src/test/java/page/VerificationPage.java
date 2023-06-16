package page;

import data.DataHelper;
import data.SQLHelper;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {

    public PersonalAccountPage verification(DataHelper.VerificationCode code) {
        $("[data-test-id='code'] input").setValue(String.valueOf(code));
        $("[data-test-id='action-verify']").click();
        return new PersonalAccountPage();
    }
}
