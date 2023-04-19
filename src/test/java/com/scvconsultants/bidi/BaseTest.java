package com.scvconsultants.bidi;

import com.scvconsultants.driver.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    void setupDriver() {
        driver = DriverFactory.valueOf("CHROME").getDriverManager().getDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
