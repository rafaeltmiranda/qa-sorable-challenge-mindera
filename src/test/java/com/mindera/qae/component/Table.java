package com.mindera.qae.component;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Table extends BaseComponent {

    public Table() {
        super($("#app").$("ul"));
    }

    @Override
    public void assertIntegrity() {
        this.getComponent().should(Condition.exist);
        Assert.assertEquals(this.getComponent().$$("li").size(), 6);
    }

    public void orderElements() {
        for (int i=0 ; i<5 ;i++) {
            this.getComponent().$(byText("Item " + i)).dragAndDropTo(this.getComponent().$$("li").get(i));
        }
    }

    public void assertOrder() {
        List<SelenideElement> elements = this.getComponent().$$("li");
        for (int i=0 ; i< elements.size() ; i++) {
            Assert.assertEquals(elements.get(i).innerText(),"Item " + i);
        }
    }
}
