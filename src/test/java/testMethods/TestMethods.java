package testMethods;


import googleMainPage.GoogleMainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

import java.time.Duration;

public class TestMethods {
    private ChromeDriver wd = BaseTest.driver;
    public GoogleMainPage googleMainPage = new GoogleMainPage();
    //Поиск элемента по xpath
    private By searchElement() {
            //element = driver.findElement(By.xpath(path));
            return By.xpath(googleMainPage.input);

    }

    //Ввод значения в элемент и нажатие Enter
    public void textInputAndEnter(String value) {
        try {
            wd.findElement(searchElement()).sendKeys(value, Keys.ENTER);
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

    private By getFieldValue(String value) {
        return By.xpath("//*[contains(text(), '" + value + "')]");
    }
    public void checkVisibleValue(String value) {
        Assert.assertTrue(wd.findElement(getFieldValue(value)) != null);

    }

//    private void checkElementIsVisible(By elementBy) {
//        try {
//            (new WebDriverWait(wd, Duration.ofSeconds(10))).until(ExpectedConditions.visibilityOfElementLocated(elementBy));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
