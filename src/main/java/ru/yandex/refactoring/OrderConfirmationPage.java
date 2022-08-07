package ru.yandex.refactoring;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderConfirmationPage {

    //Локатор для страницы "Хотите оформить заказ";
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_Modal__YZ-d3']")
    private SelenideElement confirmationOfOrdering;

    //Проверяем, что страниц появилась;
    private void waitUntilConfirmationPageIsVisible() {confirmationOfOrdering.shouldBe(Condition.visible);    }

    public boolean isOrderConfirmationPageDisplayed() {
        waitUntilConfirmationPageIsVisible();
        return confirmationOfOrdering.isDisplayed();
    }

    //Локатор кнопки "Да", на странице "Хотите оформить заказ";
    @FindBy(how = How.XPATH, using = ".//button[text()='Да']")
    private SelenideElement yesButton;

    //Клик по кнопке
    public void clickYesButton() {yesButton.click(); }

    //Локатор для страницы "Заказ оформлен";
   @FindBy(how = How.XPATH, using = ".//div[text()='Заказ оформлен']")
    private SelenideElement orderIsProcessed;

    //Получаем текст "Заказ оформлен";
    public String getTextMessageOrderIsProcessed() {return orderIsProcessed.getText();    }
}
