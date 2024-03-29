package com.scvconsultants.saucelabs;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleLoginTest {
    @Test
    void shouldLogInSuccessfully() {
        // preconditions
        var url = "https://www.saucedemo.com/";
        var username = "standard_user";
        var password = "secret_sauce";


        // Steps

        // initialize browser (Chrome here)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        // Login to site
        driver.get(url);
        // find elements and enter user/pass into login form
        WebElement usernameElement = driver.findElement(By.id("user-name"));
        usernameElement.sendKeys(username);

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // validate that user is successfully logged in
        WebElement shoppingCartLink = driver.findElement(By.id("shopping_cart_container"));
        assertThat(shoppingCartLink.isDisplayed()).isTrue();

        // close the driver
        driver.quit();
    }
}
