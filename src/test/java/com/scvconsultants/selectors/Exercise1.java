package com.scvconsultants.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise1 {
    @Test
    void shouldBeAbleToClickInPortfolioButton() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/shifting_content/menu?mode=random";


        // Steps

        // initialize browser (Chrome here)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        // Login to site
        driver.get(url);
        // find button element Portfolio by xpath

        // close the driver
        driver.quit();
    }
}
