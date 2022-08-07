package ru.yandex.refactoring;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RentalDataPage {

    //Локатор поля "Когда привезти самокат";
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement deliveryDateField;

    //Метод для заполнения даты;
    public void setDeliveryDateField(String date) {deliveryDateField.setValue(date).pressEnter(); }

    //Локатор поля "Срок аренды";
    @FindBy(how = How.XPATH, using = ".//div[@class='Dropdown-control']")
    private SelenideElement leaseTermField;

    //Локатор выпадающего списка поля "Срок аренды"
    @FindBy(how = How.XPATH, using = ".//div[@class='Dropdown-menu']//*[text() = 'сутки']")
    private SelenideElement getLeaseTermDay;

    @FindBy(how = How.XPATH, using = ".//div[@class='Dropdown-menu']//*[text() = 'двое суток']")
    private SelenideElement getLeaseTermTwoDays;

    //Метод нажатия из выпадающего списка сутки;
    public void clickGetLeaseTermDay() {leaseTermField.click(); getLeaseTermDay.click();}

    //Метод нажатия из выпадающего списка двое суток;
    public void clickGetLeaseTermTwoDay() {leaseTermField.click(); getLeaseTermTwoDays.click();}

    //Локатор черного самоката;
    @FindBy(how = How.XPATH, using = ".//input[@id='black']")
    private SelenideElement scooterBlackColorField;

    //Локатор серого самоката;
    @FindBy(how = How.XPATH, using = ".//input[@id='grey']")
    private SelenideElement scooterGreyColorField;

    //Метод выбора "серого" самоката;
    public void setScooterGreyColorField() {scooterGreyColorField.click(); }

    //Метод выбора "черного" самоката;
    public void setScooterBlackColorField() {scooterBlackColorField.click(); }

    //Локатор поля "Коментарий для курьера";
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement commentField;

    //Метод ввода коментария;
    public void setCommentField(String comment) {commentField.setValue(comment); }

    //Локатор кнопки "Заказать";
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement toOrderButton;

    //Метод нажимает кнопку "Заказать";
    public void clickToOrderButton() {toOrderButton.click(); }


}
