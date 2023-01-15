package com.scvconsultants.bidi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class JSExceptions {
    @Test
    void jsExceptionsTest() throws ExecutionException, InterruptedException, TimeoutException {
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();

        List<JavascriptException> jsExceptionsList = new ArrayList<>();
        devTools.getDomains().events().addJavascriptExceptionListener(jsExceptionsList::add);
        CompletableFuture<JavascriptException> futureJsExc = new CompletableFuture<>();
        devTools.getDomains().events().addJavascriptExceptionListener(futureJsExc::complete);

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement element = driver.findElement(By.tagName("button"));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",
                        element, "onclick", "throw new Error('Hello, world!')");
        element.click();

        futureJsExc.get(5, TimeUnit.SECONDS);
        Assertions.assertEquals(1, jsExceptionsList.size());
    }
}
