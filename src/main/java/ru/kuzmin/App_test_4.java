package ru.kuzmin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 4. Сортировка товаров (методом Select не получилось)
 *
 */
public class App_test_4
{
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.sportmaster.ru/catalog/muzhskaya_obuv/kedy/"); // сайт для тестирования

        driver.findElement(By.xpath(".//div[@class=\"sm-category__main-sorting_pseudoselect\"]")).click(); // раскрываем список
        driver.findElement(By.xpath(".//a[text()=\"По рейтингу\"]")).click(); // выбираем пункт "По рейтингу"

//    driver.quit();
    }
}
