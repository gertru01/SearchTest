package testMethods;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMethods {
    //Поиск элемента по xpath
    public WebElement searchElement(ChromeDriver driver,WebElement element, String path) {
        try {
            element = driver.findElement(By.xpath(path));
            return element; //Почему не работает без возврата?
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //Ввод значения в элемент и нажатие Enter
    public void textInputAndEnter(WebElement element, String value) {
        try {
            element.sendKeys(value, Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Открытие страницы по url
    public void openPage(ChromeDriver driver, String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Сравнение текста элемента со значением
    public void compareContentElement(WebElement element, String value) {
        try {
            Assert.assertEquals(element.getText(), value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
