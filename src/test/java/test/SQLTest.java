package test;

import data.DataHelper;
import data.SQLHelper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import page.LoginPage;
import page.VerificationPage;

import static com.codeborne.selenide.Selenide.open;

public class SQLTest {

    @AfterAll
    static void clean() {
        SQLHelper.cleanDB();
    }

    @Test
    void validLogin() {
        open("http://localhost:9999");
        var authInfo = DataHelper.getAuthInfo();
        var loginPage = new LoginPage();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = SQLHelper.getCode();
        var accountPage = new VerificationPage();
        accountPage.verification(verificationCode);
    }
}
