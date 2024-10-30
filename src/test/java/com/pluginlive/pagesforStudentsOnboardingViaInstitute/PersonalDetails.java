package com.pluginlive.pagesforStudentsOnboardingViaInstitute;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class PersonalDetails extends BaseClass {
    public PersonalDetails() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_2\"]")
    private WebElement female;

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_1\"]")
    private WebElement male;

    @FindBy(xpath = "//input[@id=\"permAddrLine1\"]")
    private WebElement permanentAddress;

    @FindBy(xpath = "//input[@id=\"rc_select_0\"]")
    private WebElement sex;

    public WebElement getSex() {
        return sex;
    }

    public WebElement getFemale() {
        return female;
    }

    public WebElement getMale() {
        return male;
    }

    public WebElement getPermanentAddress() {
        return permanentAddress;
    }

    public WebElement getPermanentAddress2() {
        return permanentAddress2;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getPinCode() {
        return pinCode;
    }

    public WebElement getCheckBoxSameasPermanentAddress() {
        return checkBoxSameasPermanentAddress;
    }

    public WebElement getSaveAndContinue() {
        return saveAndContinue;
    }

    @FindBy(xpath = "//input[@id=\"permAddrLine2\"]")
    private WebElement permanentAddress2;

    @FindBy(xpath = "//input[@aria-controls=\"rc_select_2_list\"]")
    private WebElement country;

    @FindBy(xpath = "//input[@aria-controls=\"rc_select_3_list\"]")
    private WebElement state;

    @FindBy(xpath = "//input[@aria-controls=\"rc_select_4_list\"]")
    private WebElement city;

    @FindBy(xpath = "//input[@id=\"permPostCode\"]")
    private WebElement pinCode;

    @FindBy(xpath = "//input[@class=\"ant-checkbox-input\"]")
    private WebElement checkBoxSameasPermanentAddress;

    @FindBy(xpath = "//div[text()='Save and Continue']")
    private WebElement saveAndContinue;

    public void personaldetails(String sex, String Addressline1, String Addressline2, String Country, String State, String City, String Pincode) throws InterruptedException, AWTException, IOException {
        Thread.sleep(2000);
        sendkeys(getSex(), sex);
        Thread.sleep(2000);
        enterKey();
        scrolldown(getPermanentAddress());
        sendkeys(getPermanentAddress(), Addressline1);
        Thread.sleep(1000);
        sendkeys(getPermanentAddress2(), Addressline2);
        Thread.sleep(1000);
        sendkeys(getCountry(), Country);
        Thread.sleep(1000);
        enterKey();
            sendkeys(getState(), State);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getCity(), City);
        Thread.sleep(1000);
        enterKey();
        sendkeys(getPinCode(), Pincode);
        Thread.sleep(1000);
        click(getCheckBoxSameasPermanentAddress());
        Thread.sleep(1000);
        scrolldown(getSaveAndContinue());
        click(getSaveAndContinue());

    }

    public void clickAndContinue() throws InterruptedException {
        Thread.sleep(1000);
        scrolldown(getSaveAndContinue());
        Thread.sleep(1000);
        click(getSaveAndContinue());
    }

}
