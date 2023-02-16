package com.example.udemycourse.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeToSearchBoxGoogleTest {

    WebDriver driver;

    //    @BeforeAll
//    static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }
    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogleComInChromeTest() {
        driver.navigate().to("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("hello", " ", "world");
        searchBox.submit();
    }
}
