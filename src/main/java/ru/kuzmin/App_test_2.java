package ru.kuzmin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 2. Поиск на сайте
 *
 */
public class App_test_2
{
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.sportmaster.ru/"); // сайт для тестирования

        driver.findElement(By.name("text")).sendKeys("ботинки"); // вбиваем искомый текст в поле поиска
        driver.findElement(By.name("text")).submit(); // подтверждаем

//    driver.quit();
    }
}
