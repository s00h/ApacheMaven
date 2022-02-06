package ru.kuzmin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 1. Добавление товара в корзину
 *
 */
public class App_test_1
{
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.sportmaster.ru/"); // сайт для тестирования

        driver.findElement(By.xpath(".//a[@href=\"/catalog/muzhskaya_odezhda/?icid=home!l\"]")).click(); //раздел "Мужская одежда"
        driver.findElement(By.xpath(".//img[@src=\"https://cdn.sptmr.ru/upload/resize_cache/iblock/bd3/170_180_1/qpyile_xkl.jpg\"]")).click(); //раздел "Куртки"
        driver.findElement(By.xpath(".//a[@data-product-id=\"13424110299\"]")).click(); //выберем куртку по ID
        driver.findElement(By.xpath(".//div[@class='sm-goods__param-value js-size-item']")).click(); //должен выбрать любой доступный размер (4)
        driver.findElement(By.xpath(".//a[@data-selenium=\"add_to_basket\"]")).click(); //добавляем в корзину

//    driver.quit();
    }
}
