package ru.ya;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class SearchAnotgerTest {
    public void searchAnotherSiteTest() {
        //Запуск Chrome
        ChromeDriver driver = new ChromeDriver();
        //Ожидание доступности элемента 10 сек
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try {
            //Переход в поиск яндекса
            driver.get("https://www.google.ru/");
            //Строка поиска
            WebElement input = driver.findElement(By.xpath("//textarea[@aria-label='Найти']"));
            //Ввод текста и клик по Enter
            input.sendKeys("поиск работы", Keys.ENTER);
            //Запись с ссылкой на ПРР
            WebElement element = driver.findElement(By.xpath("//a[@href='https://trudvsem.ru/']/div/div/div/div[1]/span"));
            //Сравнение текста элемента с ожидаемым значением
            Assert.assertEquals(element.getText(), "Работа России");
        } catch (Exception e) {
            //Если будет что-то где-то
            System.out.println("Исключения я еще не знаю)");
            e.printStackTrace();
        } finally {
            //Закрытие окна
            driver.quit();
        }
    }
}
