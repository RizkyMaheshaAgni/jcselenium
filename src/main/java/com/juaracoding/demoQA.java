package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoQA {
    public static void main(String[] args) {
        String path = "D:\\MyTools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", "C:\\MyTools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://demoga.com/text-box");
        driver.manage().window().fullscreen();
        System.out.println("Open Browser, Open URL");

        driver.findElement(By.id("userName")).sendKeys("Juara Coding");
        driver.findElement(By.id("userEmail")).sendKeys("Infor@JuaraCoding");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        driver.findElement(By.id("permanentAddress")).sendKeys("Jakarta");
        js.executeScript("windows.scrollBy(0,500)");

        driver.findElement(By.id("submit")).click();

        delay();

        driver.quit();
        System.out.println("Quit Browser"); }

        public static void delay (){
        try {
            Thread.sleep(3000); // untuk delay close selama 3detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}