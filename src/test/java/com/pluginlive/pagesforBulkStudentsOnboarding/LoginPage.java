package com.pluginlive.pagesforBulkStudentsOnboarding;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class LoginPage extends BaseClass {

    public LoginPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }


    public WebElement getPickprofile() {
        return pickprofile;
    }

    @FindBy(xpath = "//button[@class='PickProfile']")
    private WebElement pickprofile;

    public WebElement getFreshers() {
        return freshers;
    }

    @FindBy(xpath = "//div[@class=\"FresherBgSection\"]")
private WebElement freshers;

    public WebElement getLogin() {
        return login;
    }

    @FindBy(xpath = "(//button[text()='Login'])[1]")
    private WebElement login;


    public void register() throws InterruptedException {
        Thread.sleep(1000);
//        visibilityOf(getRegisterButton());
        System.out.println("Before clicking register");
        click(getPickprofile());
        System.out.println("After clicking register");
        click(getFreshers());
        Thread.sleep(1000);
        click(getLogin());

    }
}
