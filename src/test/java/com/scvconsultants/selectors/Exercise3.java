package com.scvconsultants.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
    @Test
    void shouldBeAbleToScrollUntilTenthParagraph() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/infinite_scroll";


        // Steps

        // initialize browser (Chrome here)
        WebDriver driver = new ChromeDriver();
        // Login to site
        driver.get(url);
        // scroll down and validate that tenth pargraph is shown

        // close the driver
        driver.quit();
    }
}
