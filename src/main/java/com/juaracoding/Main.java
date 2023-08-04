package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\MyTools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Open Browser, Open URL");
        driver.findElement(By.name("q")).sendKeys("Juara Coding"+ Keys.ENTER);
        System.out.println("Input Search + Enter");
        System.out.println("Click Button Search");
        try {
        Thread.sleep(3000); // untuk delay close selama 3detik
    } catch(InterruptedException e) {
        throw new RuntimeException(e);
    }
        driver.quit();
    System.out.println("Quit Browser");
    }
}