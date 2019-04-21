package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Accounts.Account;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Login();
    }

    public static Account accountPage() {
      CommonEvents.waitEvent();

        ManageDriver.getInstance().getWebDriver()
                .navigate().to("https://www.phptravels.net/admin/accounts/admins/");
        return new Account();
    }
}
