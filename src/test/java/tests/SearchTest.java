package tests;

import org.junit.jupiter.api.*;

//Проверка результатов поисковой выдачи на наличие конкретной записи
public class SearchTest extends BaseTest {
    @Test
    public void searchSiteTest() {
        testMethods.openPage(driver, googleMainPage.URL);
        element = testMethods.searchElement(driver, element, googleMainPage.input);
        testMethods.textInputAndEnter(element, googleMainPage.search_value);
        element = testMethods.searchElement(driver, element, googleMainPage.search_element);
        testMethods.compareContentElement(element, googleMainPage.google_searchName);
    }
}
