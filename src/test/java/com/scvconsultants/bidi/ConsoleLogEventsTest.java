package com.scvconsultants.bidi;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v111.log.Log;

import static org.assertj.core.api.Assertions.assertThat;

class ConsoleLogEventsTest {
    private String lastLogEntry;

    public void setLastLogEntry(String level) {
        lastLogEntry = level;
    }

    @Test
    void consoleLogTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();
        devTools.send(Log.enable());

        devTools.addListener(Log.entryAdded(),
                logEntry -> {
                    setLastLogEntry(logEntry.getText());
                    System.out.println("log: "+logEntry.getText());
                    System.out.println("level: "+logEntry.getLevel());
                });

        driver.get("https://github.com/");
        assertThat(lastLogEntry).contains("A preload for");
    }
}
