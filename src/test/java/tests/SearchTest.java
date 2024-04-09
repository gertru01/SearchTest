package tests;

import org.junit.jupiter.api.*;

//Проверка результатов поисковой выдачи на наличие конкретной записи
public class SearchTest extends BaseTest {
    @Test
    public void searchSiteTest() {
        testMethods.openPage(driver, googleMainPage.URL);
        testMethods.textInputAndEnter("тест");
        testMethods.checkVisibleValue("тест");
    }
}
