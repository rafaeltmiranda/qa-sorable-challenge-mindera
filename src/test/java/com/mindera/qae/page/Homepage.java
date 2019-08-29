package com.mindera.qae.page;

import com.mindera.qae.component.Table;

public class Homepage extends BasePage {

    private final Table table;

    Homepage() {
        this.table = new Table();
    }

    @Override
    public void assertIntegrity() {
        super.assertIntegrity();
        table.assertIntegrity();
    }

    public Table getTable() {
        return table;
    }
}
