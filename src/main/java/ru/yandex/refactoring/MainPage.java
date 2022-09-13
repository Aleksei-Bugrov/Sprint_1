package ru.yandex.refactoring;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    //Локатор cookie;
    @FindBy(how= How.ID,using = "rcc-confirm-button")
    public SelenideElement cookie;

    //Метод закрывает окно с cookie;
    public void clickCookie() {
        if(cookie.isDisplayed()) {cookie.click();}
    }

    //Локатор для кнопки "Заказать" вверху страницы;
    @FindBy(how=How.XPATH, using = ".//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']")
    private SelenideElement topOrderButton;

    //Метод нажимает верхнюю кнопку "Заказать";
    public void clickTopOrderButton() {topOrderButton.click(); }

    //Локатор для кнопки "заказать" в середине страницы;
    @FindBy(how=How.XPATH, using = ".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']")
    private SelenideElement middleOrderButton;

    //Метод нажимает кнопку "Заказать" в середине страницы;
    public void clickMiddleOrderButton() {middleOrderButton.click(); }

    //Локатор для кнопки "Статус заказа";
    @FindBy(how=How.XPATH, using = ".//div[@class='Header_Nav__AGCXC']/button[text()='Статус заказа']")
    private SelenideElement statusOrderButton;

    //Локатор для кнопки "Go";
    @FindBy(how=How.XPATH, using = ".//div[@class='Input_InputContainer__3NykH']/button[text()='Go']")
    private SelenideElement goButton;

    //Локатор для поля "Введите номер заказа";
    @FindBy(how=How.XPATH, using = ".//input[@placeholder='Введите номер заказа']")
    private SelenideElement numberOrderField;

    //Локатор для вопроса - "Сколько это стоит? И как оплатить?";
    @FindBy(how = How.ID, using = "accordion__heading-0")
    private SelenideElement questionHowMuchCostsHowPay;

    //Метод раскрывает ответ на вопрос - "Сколько это стоит? И как оплатить?";
    public void clickQuestionHowMuchCostsHowPay() {questionHowMuchCostsHowPay.click();}

    //Локатор ответа на вопрос - "Сколько это стоит? И как оплатить?";
    @FindBy(how = How.ID, using = "accordion__panel-0")
    private SelenideElement answerQuestionHowMuchCostsHowPay;

    //Метод получает текст ответа на вопрос - "Сколько это стоит? И как оплатить?";
    public String getTextAnswerQuestionHowMuchCostsHowPay() {return answerQuestionHowMuchCostsHowPay.getText(); }

    //Локатор для вопроса - "Хочу сразу несколько самокатов! Так можно?"
    @FindBy(how = How.ID, using = "accordion__heading-1")
    private SelenideElement wantSeveralScootersAtOnce;

    //Метод раскрывает ответ на вопрос - "Сколько это стоит? И как оплатить?";
    public void clickWantSeveralScootersAtOnce() {wantSeveralScootersAtOnce.click();}

    //Локатор ответа на вопрос - "Хочу сразу несколько самокатов! Так можно?";
    @FindBy(how = How.ID, using = "accordion__panel-1")
    private SelenideElement answerWantSeveralScootersAtOnce;

    //Метод получает текст ответа на вопрос - "Сколько это стоит? И как оплатить?";
    public String getTextAnswerWantSeveralScootersAtOnce() {return answerWantSeveralScootersAtOnce.getText(); }

    //Локатор для вопроса - "Как рассчитывается время аренды?"
    @FindBy(how = How.ID, using = "accordion__heading-2")
    private SelenideElement howTheRentalTimeIsCalculated;

    //Метод раскрывает ответ на вопрос - "Как рассчитывается время аренды?";
    public void clickHowTheRentalTimeIsCalculated() {howTheRentalTimeIsCalculated.click();}

    //Локатор ответа на вопрос - "Как рассчитывается время аренды?";
    @FindBy(how = How.ID, using = "accordion__panel-2")
    private SelenideElement answerHowTheRentalTimeIsCalculated;

    //Метод получает текст ответа на вопрос - "Как рассчитывается время аренды?";
    public String getTextAnswerHowTheRentalTimeIsCalculated() {return answerHowTheRentalTimeIsCalculated.getText(); }

    //Локатор для вопроса - "Можно ли заказать самокат прямо на сегодня?"
    @FindBy(how = How.ID, using = "accordion__heading-3")
    private SelenideElement possibleToOrderScooterRightForToday;

    //Метод раскрывает ответ на вопрос - "Можно ли заказать самокат прямо на сегодня";
    public void clickPossibleToOrderScooterRightForToday() {possibleToOrderScooterRightForToday.click();}

    //Локатор ответа на вопрос - "Можно ли заказать самокат прямо на сегодня";
    @FindBy(how = How.ID, using = "accordion__panel-3")
    private SelenideElement answerPossibleToOrderScooterRightForToday;

    //Метод получает текст ответа на вопрос - "Можно ли заказать самокат прямо на сегодня";
    public String getTextAnswerPossibleToOrderScooterRightForToday() {return answerPossibleToOrderScooterRightForToday.getText(); }

    //Локатор для вопроса - "Можно ли продлить заказ или вернуть самокат раньше?"
    @FindBy(how = How.ID, using = "accordion__heading-4")
    private SelenideElement possibleToExtendTheOrderOrReturnTheScooterEarlier;

    //Метод раскрывает ответ на вопрос - "Можно ли продлить заказ или вернуть самокат раньше";
    public void clickPossibleToExtendTheOrderOrReturnTheScooterEarlier() {possibleToExtendTheOrderOrReturnTheScooterEarlier.click();}

    //Локатор ответа на вопрос - "Можно ли продлить заказ или вернуть самокат раньше";
    @FindBy(how = How.ID, using = "accordion__panel-4")
    private SelenideElement answerPossibleToExtendTheOrderOrReturnTheScooterEarlier;

    //Метод получает текст ответа на вопрос - "Можно ли продлить заказ или вернуть самокат раньше";
    public String getTextAnswerPossibleToExtendTheOrderOrReturnTheScooterEarlier() {return answerPossibleToExtendTheOrderOrReturnTheScooterEarlier.getText(); }

    //Локатор для вопроса - "Вы привозите зарядку вместе с самокатом?"
    @FindBy(how = How.ID, using = "accordion__heading-5")
    private SelenideElement youBringTheChargerAlongWithTheScooter;

    //Метод раскрывает ответ на вопрос - "Вы привозите зарядку вместе с самокатом?";
    public void clickYouBringTheChargerAlongWithTheScooter() {youBringTheChargerAlongWithTheScooter.click();}

    //Локатор ответа на вопрос - "Вы привозите зарядку вместе с самокатом?";
    @FindBy(how = How.ID, using = "accordion__panel-5")
    private SelenideElement answerYouBringTheChargerAlongWithTheScooter;

    //Метод получает текст ответа на вопрос - "Вы привозите зарядку вместе с самокатом?";
    public String getTextAnswerYouBringTheChargerAlongWithTheScooter() {return answerYouBringTheChargerAlongWithTheScooter.getText(); }

    //Локатор для вопроса - "Можно ли отменить заказ?"
    @FindBy(how = How.ID, using = "accordion__heading-6")
    private SelenideElement canCancelAnOrder;

    //Метод раскрывает ответ на вопрос - "Можно ли отменить заказ?";
    public void clickCanCancelAnOrder() {canCancelAnOrder.click();}

    //Локатор ответа на вопрос - "Можно ли отменить заказ?";
    @FindBy(how = How.ID, using = "accordion__panel-6")
    private SelenideElement answerCanCancelAnOrder;

    //Метод получает текст ответа на вопрос - "Можно ли отменить заказ?";
    public String getTextAnswerCanCancelAnOrder() {return answerCanCancelAnOrder.getText(); }

    //Локатор для вопроса - "Я живу за МКАДом, привезёте?"
    @FindBy(how = How.ID, using = "accordion__heading-7")
    private SelenideElement liveOutsideTheMoscowRingRoadYouWillBring;

    //Метод раскрывает ответ на вопрос - "Я живу за МКАДом, привезёте?";
    public void clickLiveOutsideTheMoscowRingRoadYouWillBring() {liveOutsideTheMoscowRingRoadYouWillBring.click();}

    //Локатор ответа на вопрос - "Я живу за МКАДом, привезёте?";
    @FindBy(how = How.ID, using = "accordion__panel-7")
    private SelenideElement answerLiveOutsideTheMoscowRingRoadYouWillBring;

    //Метод получает текст ответа на вопрос - "Я живу за МКАДом, привезёте?";
    public String getTextAnswerLiveOutsideTheMoscowRingRoadYouWillBring() {return answerLiveOutsideTheMoscowRingRoadYouWillBring.getText(); }

    //Методы прокрутки вниз;
    public void scrollHowMuch() {questionHowMuchCostsHowPay.scrollTo();}
    public void scrollWantSeveralScootersAtOnce() {wantSeveralScootersAtOnce.scrollTo();}
    public void scrollHowTheRentalTimeIsCalculated() {howTheRentalTimeIsCalculated.scrollTo();}
    public void scrollPossibleToOrderScooterRightForToday() {possibleToOrderScooterRightForToday.scrollTo();}
    public void scrollPossibleToExtendTheOrderOrReturnTheScooterEarlier() {possibleToOrderScooterRightForToday.scrollTo();}
    public void scrollYouBringTheChargerAlongWithTheScooter() {youBringTheChargerAlongWithTheScooter.scrollTo();}
    public void scrollCanCancelAnOrder() {canCancelAnOrder.scrollTo();}
    public void scrollLiveOutsideTheMoscowRingRoadYouWillBring() {liveOutsideTheMoscowRingRoadYouWillBring.scrollTo();}

}
