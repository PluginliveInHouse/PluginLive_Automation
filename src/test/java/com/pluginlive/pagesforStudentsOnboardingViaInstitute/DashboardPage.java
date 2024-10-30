package com.pluginlive.pagesforStudentsOnboardingViaInstitute;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DashboardPage extends BaseClass {
    public DashboardPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    public WebElement getStudents() {
        return Students;
    }

    @FindBy (xpath = "//div[text()='Students']")
    private WebElement Students;

    public void dashboard() throws InterruptedException {
        Thread.sleep(1000);
        click(getStudents());

    }



}
