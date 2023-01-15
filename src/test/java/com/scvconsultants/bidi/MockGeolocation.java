package com.scvconsultants.bidi;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;

import java.util.Optional;

public class MockGeolocation {
    @Test
    void mockGeolocation() {
        WebDriver driver = new ChromeDriver();
        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();

        devTools.send(Emulation.setGeolocationOverride(Optional.of(52.5043),
                Optional.of(13.4501),
                Optional.of(1)));
        driver.get("https://my-location.org/");

    }
}
