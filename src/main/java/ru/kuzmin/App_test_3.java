package ru.kuzmin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 3. Фильтр по бренду
 *
 */
public class App_test_3
{
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.sportmaster.ru/"); // сайт для тестирования

        driver.findElement(By.xpath(".//a[@href=\"/catalog/muzhskaya_obuv/?icid=home!l\"]")).click(); //раздел "Мужская обувь"
        driver.findElement(By.xpath(".//a[text()=\"Кроссовки\"]")).click(); //раздел "Кроссовки"
        driver.findElement(By.xpath(".//a[contains(text(), 'adidas')]")).click(); //отфильтровываем Adidas

//    driver.quit();
    }
}
