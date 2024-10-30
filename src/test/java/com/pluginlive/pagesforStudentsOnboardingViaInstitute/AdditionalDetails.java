package com.pluginlive.pagesforStudentsOnboardingViaInstitute;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AdditionalDetails extends BaseClass {
    public AdditionalDetails() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private WebElement joblocationAnywhere;

    public WebElement getJoblocationAnywhere() {
        return joblocationAnywhere;
    }

    @FindBy(xpath = "//div[text()='Save & Continue']")
    private WebElement saveAndContinueButton;


    @FindBy(xpath = "//div[text()='Save & Continue']")
    private WebElement notificationsaveandcontinueButton;

    public WebElement getNotificationsaveandcontinueButton() {
        return notificationsaveandcontinueButton;
    }

    public WebElement getSaveAndContinueButton() {
        return saveAndContinueButton;
    }


    public void additionaldetails() throws InterruptedException {
        click(getJoblocationAnywhere());
        Thread.sleep(1000);
        click(getSaveAndContinueButton());
    }

public void whatsappandemailnotification() throws InterruptedException {
        Thread.sleep(1000);
        click(getNotificationsaveandcontinueButton());
}

}
