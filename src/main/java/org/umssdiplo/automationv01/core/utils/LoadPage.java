package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.Accounts.AdminsMngt;
import org.umssdiplo.automationv01.core.managepage.Login.Login;

public final class LoadPage {
    public static Login loginPage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrlTravel());
        return new Login();
    }

    public static AdminsMngt accountPage() {
      CommonEvents.waitEvent();

        ManageDriver.getInstance().getWebDriver()
                .navigate().to("https://www.phptravels.net/admin/accounts/admins/");
        return new AdminsMngt();
    }
}
