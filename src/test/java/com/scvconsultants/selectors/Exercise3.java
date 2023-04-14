package com.scvconsultants.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise3 {
    @Test
    void shouldBeAbleToScrollUntilTenthParagraph() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/infinite_scroll";


        // Steps

        // initialize browser (Chrome here)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        // Login to site
        driver.get(url);
        // scroll down and validate that tenth pargraph is shown

        // close the driver
        driver.quit();
    }
}
