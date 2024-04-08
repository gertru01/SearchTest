package tests;

import googleMainPage.GoogleMainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import testMethods.TestMethods;

import java.time.Duration;

public class BaseTest {
    public static ChromeDriver driver = new ChromeDriver();
    static TestMethods testMethods =new TestMethods();
    static WebElement element;
    static GoogleMainPage googleMainPage = new GoogleMainPage();
    @BeforeAll
    public static void baseTest() {
        //Ожидание доступности элемента 10 сек
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterAll
    public static void closeTest() {
        //Закрытие окна
        driver.quit();
    }
}
