package ru.yandex.refactoring;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalDataPage {

    //локатор поля "Имя";
    @FindBy(how= How.XPATH, using = ".//input[@placeholder='* Имя']")
    private SelenideElement nameField;

    //метод ввода имени;
    public void setName(String name) {nameField.setValue(name); }

    //локатор поля "Фамилия";
    @FindBy(how=How.XPATH, using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement lastNameField;

    //Метод ввода фамилии;
    public void setLastName(String lastName) {lastNameField.setValue(lastName); }

    //локатор поля "Адрес";
    @FindBy(how=How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement addressField;

    //Метод ввода адреса;
    public void setAddress(String address) {addressField.setValue(address); }

    //локатор для поиска поля "Станция метро";
    @FindBy(how=How.XPATH, using = ".//input[@placeholder='* Станция метро']")
    private  SelenideElement metroStationField;

    //локатор выпадающего списка поля "Станция метро";
    @FindBy(how=How.XPATH, using = "//*[@class = 'select-search__select']")
    private SelenideElement metroStation2;

    //Метод выбора станции метро;
    public void setMetroStation(String station) {metroStationField.click();metroStationField.setValue(station);metroStation2.click();}

    //локатор поля "Телефон";
    @FindBy(how=How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumberField;

    //Метод ввода телефонного номера
    public void setPhoneNumber(String phoneNumber) {phoneNumberField.setValue(phoneNumber); }

    //локатор кнопки "Далее";
    @FindBy(how=How.XPATH, using = "//*[text() = 'Далее']")
    private SelenideElement nextButton;

    //Метод нажимает кнопку "Далее";
    public void clickNextButton() {nextButton.click(); }

    //Упаковали методы личных данных в один;
    public void personalData(String name, String lastName, String address, String phoneNumber, String station) {
        setName(name); setLastName(lastName); setAddress(address); setPhoneNumber(phoneNumber); setMetroStation(station); clickNextButton();}
}
