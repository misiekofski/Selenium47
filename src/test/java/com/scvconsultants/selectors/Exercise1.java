package com.scvconsultants.selectors;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise1 {
    @Test
    void shouldBeAbleToClickInPortfolioButton() {
        // preconditions
        var url = "https://the-internet.herokuapp.com/shifting_content/menu?mode=random";


        // Steps

        // initialize browser (Chrome here)
        WebDriver driver = new ChromeDriver();
        // Login to site
        driver.get(url);
        // find button element Portfolio by xpath

        // close the driver
        driver.quit();
    }
}
