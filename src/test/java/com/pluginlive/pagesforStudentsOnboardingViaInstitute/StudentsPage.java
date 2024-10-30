package com.pluginlive.pagesforStudentsOnboardingViaInstitute;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class StudentsPage extends BaseClass {
    public StudentsPage() throws IOException {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//div[text()='New Student']")
    private WebElement newstudentbutton;
    @FindBy (xpath = "//input[@id='firstName']")
    private WebElement firstname;
    @FindBy (xpath = "//input[@id='lastName']")
    private WebElement lastname;
    @FindBy (xpath = "//input[@id='uniRollNo']")
    private WebElement rollno;
    @FindBy (xpath = "//input[@id='date_of_birth']")
    private WebElement dob;
    @FindBy (xpath = "//input[@value='regular']")
    private WebElement regulartype;
    @FindBy (xpath = "//input[@id='degree']")
    private WebElement degree;
    @FindBy (xpath = "//input[@id='department']")
    private WebElement department;
    @FindBy (xpath = "//input[@id='batch']")
    private WebElement batchfrom;
    @FindBy (xpath = "(//input[@placeholder='YYYY-MM'])[2]")
    private WebElement batchto;
    @FindBy (xpath = "//input[@id='email']")
    private WebElement contactemail;
    @FindBy (xpath = "//input[@id='rc_select_14']")
    private WebElement pincode;
    @FindBy (xpath = "//input[@id='contactNumber']")
    private WebElement contactnumber;
@FindBy (xpath = "//button[@type='submit']")
    private WebElement Addstudentbutton;
@FindBy (xpath = "//input[@id='averageMarks']")
private WebElement percentage;

    public WebElement getPercentage() {
        return percentage;
    }

    public WebElement getNewstudentbutton() {
        return newstudentbutton;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getRollno() {
        return rollno;
    }

    public WebElement getDob() {
        return dob;
    }

    public WebElement getRegulartype() {
        return regulartype;
    }

    public WebElement getDegree() {
        return degree;
    }

    public WebElement getDepartment() {
        return department;
    }

    public WebElement getBatchfrom() {
        return batchfrom;
    }

    public WebElement getBatchto() {
        return batchto;
    }

    public WebElement getContactemail() {
        return contactemail;
    }

    public WebElement getPincode() {
        return pincode;
    }

    public WebElement getContactnumber() {
        return contactnumber;
    }

    public WebElement getAddstudentbutton() {
        return Addstudentbutton;
    }

    public void studentpage(String firstname ,String lastname, String rollno,String dob, String degree,String department, String from ,String to,String percentage, String contactemail,String pincode, String contactnumber  ) throws InterruptedException, AWTException {
        click(getNewstudentbutton());
        Thread.sleep(1000);
        sendkeys(getFirstname(),firstname);
        sendkeys(getLastname(), lastname);
        sendkeys(getRollno(), rollno);
        sendkeys(getDob(),dob);
        enterKey();
        click(getRegulartype());
        sendkeys(getDegree(),degree);
        enterKey();
        sendkeys(getDepartment(),department);
        enterKey();
        sendkeys(getBatchfrom(), from);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(2000);
        sendkeys(getBatchto(),to);
        Thread.sleep(2000);
        enterKey();
        Thread.sleep(1000);
        sendkeys(getPercentage(),percentage);
        sendkeys(getContactemail(), contactemail);
       // sendkeys(getPincode(), pincode);
      //  enterKey();
        sendkeys(getContactnumber(), contactnumber);
        Thread.sleep(1000);
        click(getAddstudentbutton());
        Thread.sleep(1000);


    }


}



