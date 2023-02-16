package com.example.udemycourse.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;

import static java.lang.invoke.MethodHandles.lookup;
import static org.assertj.core.api.Assertions.assertThat;
import static org.slf4j.LoggerFactory.getLogger;

public class AssertGoogleTitleTest {
    WebDriver driver;
    static final Logger log = getLogger(lookup().lookupClass());
    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void close() {
        driver.quit();
    }

    @Test
    public void titleIsGoogleCheck() {
        String url = "https://google.com";
        driver.navigate().to(url);
        String title = driver.getTitle();
        log.debug("The title of {} is {}", url, title);

        assertThat(title).isEqualTo("Google");
    }
}
