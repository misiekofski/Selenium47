package com.scvconsultants.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise4 {
    @Test
    void shouldProperySortDataTableOneByLastName() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/tables";


        // Steps

        // initialize browser (Chrome here)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        // Login to site
        driver.get(url);
        // validate that clicking on last name sorts table properly

        // close the driver
        driver.quit();
    }

    @Test
    void shouldProperySortDataTableOneByFirstName() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/tables";


        // Steps

        // initialize browser (Chrome here)
        WebDriver driver = new ChromeDriver();
        // Login to site
        driver.get(url);
        // validate that clicking on first name sorts table properly

        // close the driver
        driver.quit();
    }
}
