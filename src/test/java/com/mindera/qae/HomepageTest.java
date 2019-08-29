package com.mindera.qae;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.mindera.qae.component.Table;
import com.mindera.qae.page.Homepage;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomepageTest extends BaseConfig {

    public static final String HOME = "http://localhost:3000";

    @Test(groups = {"smoke", "regression"})
    public void homepageOpens() {
        Homepage homepage = Selenide.open(HOME, Homepage.class);
        homepage.assertIntegrity();
    }

    @Test(groups = {"regression"})
    public void eventTableReorder() {
        Homepage homepage = Selenide.open(HOME, Homepage.class);
        Table table = homepage.getTable();
        table.orderElements();
        table.assertOrder();
    }
}
