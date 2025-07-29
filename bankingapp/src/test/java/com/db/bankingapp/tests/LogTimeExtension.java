package com.db.bankingapp.tests;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class LogTimeExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    private long startTime,duration;
    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {

        duration = System.currentTimeMillis();
        System.out.println("Test"+extensionContext.getDisplayName()+duration+"ms");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        startTime = System.currentTimeMillis();
        System.out.println("Starting the Test"+extensionContext.getDisplayName());
    }
}
