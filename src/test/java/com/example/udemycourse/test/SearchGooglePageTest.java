package com.example.udemycourse.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGooglePageTest {
    WebDriver driver = new ChromeDriver();


    @Test
    public void test() {
        driver.get("https://www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Hello Selenium WebDriver!");

        element.submit();
        // Hello Selenium WebDriver! - Поиск в Google
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }

    @Test
    public void test2() {
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.className("gLFyf"));
//        WebElement element = driver.findElement(By.id("searchword"));
        element.sendKeys("123");
        element.submit();
        driver.quit();
    }
}

