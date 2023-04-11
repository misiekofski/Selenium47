package com.scvconsultants.bidi;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.JavascriptException;

import static org.awaitility.Awaitility.await;

public class JSErrorLogger {

    private final List<JavascriptException> jsExceptionsList = new ArrayList<>();

    @Test
    void jsErrorLogger() throws ExecutionException, InterruptedException, TimeoutException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();
        devTools.getDomains().events().addJavascriptExceptionListener(jsExceptionsList::add);


        driver.get("http://the-internet.herokuapp.com/javascript_error");

        // default wait time is 10 seconds
        await().until(() -> jsExceptionsList.size() > 1);
    }
}
