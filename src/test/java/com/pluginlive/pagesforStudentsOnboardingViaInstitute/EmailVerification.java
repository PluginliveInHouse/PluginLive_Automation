package com.pluginlive.pagesforStudentsOnboardingViaInstitute;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;

public class EmailVerification extends BaseClass {
    public EmailVerification() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    int desiredIndex = 0;
    @FindBy(xpath = "(//input[@class=\"whsOnd zHQkBf\"])[1]")
    private WebElement emailid;

    public WebElement getEmailid() {
        return emailid;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public WebElement getEmailpassword() {
        return emailpassword;
    }

    @FindBy(xpath = "//*[text()='Next']")
    private WebElement nextButton;

    @FindBy(xpath = "//input[@name=\"Passwd\"]")
    private WebElement emailpassword;


    @FindBy(xpath = "//div[@class=\"yW\"]")
    private List<WebElement> emaillist;

    public WebElement getHideexpandedCOntent() {
        return hideexpandedCOntent;
    }

    @FindBy (xpath = "//div[@id=\":ty\"]")
    private WebElement hideexpandedCOntent;

    public List<WebElement> getEmaillist() {
        return emaillist;
    }
    @FindBy (xpath = "//a[text()='Activate Account']")
    private WebElement activateAccountbutton;

    @FindBy (xpath = "(//a[@role=\"button\"])[4]")
    private WebElement googleAccountButton;

    @FindBy (xpath = "(//a[@jsname=\"L8VV9b\"])[2]")
    private WebElement signoutButton;

    public WebElement getGoogleAccountButton() {
        return googleAccountButton;
    }
    public WebElement getSignoutButton() {
        return signoutButton;
    }

    public WebElement getActivateAccountbutton() {
        return activateAccountbutton;
    }

    public void emaillogin(String gmail, String gmailpassword) throws InterruptedException {
        click(getEmailid());
        Thread.sleep(1000);
        sendkeys(getEmailid(), gmail);
        click(getNextButton());
        Thread.sleep(1000);
        sendkeys(getEmailpassword(), gmailpassword);
        Thread.sleep(1000);
        click(getNextButton());
    }

    public void emaillist() throws InterruptedException {
        Thread.sleep(2000);
        refresh();
        for (int i = 0; i < getEmaillist().size(); i++) {
            WebElement emailElement = getEmaillist().get(i);
            String emailText = emailElement.getText();
            System.out.println("Email " + (i + 1) + ": " + emailText);

            if (i == desiredIndex) {
                emailElement.click();
                break;
            }
        }
        Thread.sleep(2000);
        scrolldown(getActivateAccountbutton());
        Thread.sleep(1000);
        click(getActivateAccountbutton());
    }






}
