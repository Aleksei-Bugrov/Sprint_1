package ru.yandex.refactoring;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertTrue;


public class TestScooterOrder {

    MainPage mainPage = null;

       @Before
public void setUp() {

           //Открываем тестовый URL, закрываем Cookie;
        mainPage = open(MainPage.URL, MainPage.class);

        mainPage.clickCookie();
    }

    @Test
    public void testScooterOrderTopButton()    {

           //Проходим тест по оформлению заказа; В Chrome, тест падает на странице "Хотите оформить заказ";
        mainPage.clickTopOrderButton();

        PersonalDataPage personalDataPage = page(PersonalDataPage.class);

        personalDataPage.personalData("Иван", "Иванов", "Москва, ул. Мира, д.60, кв. 35", "89995553322", "Лубянка");

        RentalDataPage rentalDataPage = page(RentalDataPage.class);

        rentalDataPage.setDeliveryDateField("05.11.2021");
        rentalDataPage.clickGetLeaseTermDay();
        rentalDataPage.setScooterGreyColorField();
        rentalDataPage.setCommentField("Звонить после 9:00");
        rentalDataPage.clickToOrderButton();

        OrderConfirmationPage orderConfirmationPage = page(OrderConfirmationPage.class);
        assertTrue(orderConfirmationPage.isOrderConfirmationPageDisplayed());

        orderConfirmationPage.clickYesButton();

        MatcherAssert.assertThat(orderConfirmationPage.getTextMessageOrderIsProcessed(), containsString("Заказ оформлен"));
    }

    @Test
    public void testScooterOrderMiddleButton() {

           //Тот же тест, но с другим набором данных;
        mainPage.clickMiddleOrderButton();

        PersonalDataPage personalDataPage = page(PersonalDataPage.class);

        personalDataPage.personalData("Александр", "Александров", "Москва, улица Победы, дом 84, квартира 13", "+79998887766", "Бульвар Рокоссовского");

        RentalDataPage rentalDataPage = page(RentalDataPage.class);

        rentalDataPage.setDeliveryDateField("06.12.2021");
        rentalDataPage.clickGetLeaseTermTwoDay();
        rentalDataPage.setScooterBlackColorField();
        rentalDataPage.setCommentField("Звонить за 30 минут");
        rentalDataPage.clickToOrderButton();

        OrderConfirmationPage orderConfirmationPage = page(OrderConfirmationPage.class);
        assertTrue(orderConfirmationPage.isOrderConfirmationPageDisplayed());

        orderConfirmationPage.clickYesButton();

        MatcherAssert.assertThat(orderConfirmationPage.getTextMessageOrderIsProcessed(), containsString("Заказ оформлен"));

    }
@After
    //Закрываем браузер после каждого теста, возвращая тестовый стенд, в исходное положение;
    public void after() {
           closeWebDriver();
}
}

