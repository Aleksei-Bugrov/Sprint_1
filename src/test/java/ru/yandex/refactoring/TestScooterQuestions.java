package ru.yandex.refactoring;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.core.StringContains.containsString;

public class TestScooterQuestions {

    MainPage mainPage = null;

    @Before
    public void setUp() {

        //Открываем тестовый URL, закрываем Cookie;
        mainPage = open(MainPage.URL, MainPage.class);

        mainPage.clickCookie();

    }
     @Test
    public void testQuestionHowMuch() {

        //Проверяем текст, ответов на вопросы;
        mainPage.scrollHowMuch();
        mainPage.clickQuestionHowMuchCostsHowPay();
        MatcherAssert.assertThat(mainPage.getTextAnswerQuestionHowMuchCostsHowPay(), containsString("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));
    }

    @Test
    public void testQuestionWantSeveralScootersAtOnce() {

        mainPage.scrollWantSeveralScootersAtOnce();
        mainPage.clickWantSeveralScootersAtOnce();
        MatcherAssert.assertThat(mainPage.getTextAnswerWantSeveralScootersAtOnce(), containsString("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."));
  }
    @Test
    public void testQuestionHowTheRentalTimeIsCalculated() {

        mainPage.scrollHowTheRentalTimeIsCalculated();
        mainPage.clickHowTheRentalTimeIsCalculated();
        MatcherAssert.assertThat(mainPage.getTextAnswerHowTheRentalTimeIsCalculated(), containsString("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."));
    }

    @Test
    public void testQuestionPossibleToOrderScooterRightForToday() {

        mainPage.scrollPossibleToOrderScooterRightForToday();
        mainPage.clickPossibleToOrderScooterRightForToday();
        MatcherAssert.assertThat(mainPage.getTextAnswerPossibleToOrderScooterRightForToday(), containsString("Только начиная с завтрашнего дня. Но скоро станем расторопнее."));
    }

    @Test
 public void testQuestionPossibleToExtendTheOrderOrReturnTheScooterEarlier() {

        mainPage.scrollPossibleToExtendTheOrderOrReturnTheScooterEarlier();
        mainPage.clickPossibleToExtendTheOrderOrReturnTheScooterEarlier();
        MatcherAssert.assertThat(mainPage.getTextAnswerPossibleToExtendTheOrderOrReturnTheScooterEarlier(), containsString("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."));
  }

    @Test
    public void testQuestionYouBringTheChargerAlongWithTheScooter() {

        mainPage.scrollYouBringTheChargerAlongWithTheScooter();
        mainPage.clickYouBringTheChargerAlongWithTheScooter();
        MatcherAssert.assertThat(mainPage.getTextAnswerYouBringTheChargerAlongWithTheScooter(), containsString("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."));
    }

    @Test
    public void testQuestionCanCancelAnOrder() {

        mainPage.scrollCanCancelAnOrder();
        mainPage.clickCanCancelAnOrder();
        MatcherAssert.assertThat(mainPage.getTextAnswerCanCancelAnOrder(), containsString("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."));
    }

    @Test
    public void testQuestionLiveOutsideTheMoscowRingRoadYouWillBring() {

        mainPage.scrollLiveOutsideTheMoscowRingRoadYouWillBring();
        mainPage.clickLiveOutsideTheMoscowRingRoadYouWillBring();
        MatcherAssert.assertThat(mainPage.getTextAnswerLiveOutsideTheMoscowRingRoadYouWillBring(),containsString("Да, обязательно. Всем самокатов! И Москве, и Московской области."));
    }
    @After
    //Закрываем браузер после каждого теста, возвращая тестовый стенд, в исходное положение;
    public void after() {
        closeWebDriver(); }
}
