package com.scvconsultants.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {
    @Test
    void shouldBeAbleToLocateAllElements() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/challenging_dom";


        // Steps

        // initialize browser (Chrome here)
        WebDriver driver = new ChromeDriver();
        // Login to site
        driver.get(url);
        // find three color buttons


        // find table that includes header "Ipsum" and "Dolor"


        // can you read the answer?

        // close the driver
        driver.quit();
    }
}
