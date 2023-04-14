package com.scvconsultants.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise2 {
    @Test
    void shouldBeAbleToReturnNumberOfRow() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/shifting_content/list";


        // Steps

        // initialize browser (Chrome here)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        // Login to site
        driver.get(url);
        // find text location "Et numquam et aliquam." by css selector

        // close the driver
        driver.quit();
    }
}
