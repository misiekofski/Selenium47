package com.scvconsultants.bidi;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.*;


class BasicAuthLoginTest {
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify basic authorization test")
    @Test
    void basicAuthTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        var url = "https://authenticationtest.com/HTTPAuth/";
        var username = "user";
        var password = "pass";

        Predicate<URI> uriPredicate = uri -> uri.getHost().contains("authenticationtest.com");
        ((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of(username, password));
        driver.get(url);

        WebElement headerText = driver.findElement(By.cssSelector("h1"));
        System.out.println(headerText.getText());
        assertThat(headerText.getText()).isEqualTo("Login Success");
    }
}
