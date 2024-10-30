package com.pluginlive.pagesforStudentsOnboardingViaInstitute;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseClass {
    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }


@FindBy (xpath = "//input[@name='email']")
    private WebElement emailid;

 @FindBy (xpath = "//input[@name='psw']")
    private WebElement password;

 @FindBy (xpath = "//input[@name='checked']")
private WebElement checkbox;

 @FindBy (xpath = "//button[text()='Login']")
    private WebElement loginbutton;

    public WebElement getEmailid() {
        return emailid;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getCheckbox() {
        return checkbox;
    }

    public WebElement getLoginbutton() {
        return loginbutton;
    }

    public void login(String emailid, String password) throws InterruptedException {
        click(getEmailid());
        Thread.sleep(1000);
        sendkeys(getEmailid(), emailid);
        click(getPassword());
        Thread.sleep(1000);
        sendkeys(getPassword(),password);
        click(getCheckbox());
        click(getLoginbutton());
    }



}
