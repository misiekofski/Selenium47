package com.scvconsultants.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise5 {
    @Test
    void shouldBeAbleToLocateAllElements() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/challenging_dom";


        // Steps

        // initialize browser (Chrome here)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        // Login to site
        driver.get(url);
        // find three color buttons


        // find table that includes header "Ipsum" and "Dolor"


        // can you read the answer?

        // close the driver
        driver.quit();
    }
}
