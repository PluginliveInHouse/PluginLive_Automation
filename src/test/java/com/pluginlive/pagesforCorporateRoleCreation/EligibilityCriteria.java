package com.pluginlive.pagesforCorporateRoleCreation;

import com.pluginlive.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;
import java.util.List;

public class EligibilityCriteria extends BaseClass {

    public EligibilityCriteria() throws IOException {
        super();

        PageFactory.initElements(driver,this);
    }



    public WebElement getDegreevalue() {
        return degreevalue;
    }

    //Degree
    @FindBy (xpath = "//input[@id=\"rc_select_5\"]")
    private WebElement degreevalue;

    public WebElement getDegree() {
        return degree;
    }

    @FindBy (xpath = "//div[@id='eligibility_degree']//div[@class='ant-select-selection-overflow']")
 private WebElement degree;


    public WebElement getSpecialisation() {
        return specialisation;
    }
    @FindBy (xpath = "//span[@class='ant-select-tree-title']")
    private List<WebElement> listOfDegree;

//Specialisation

    public List<WebElement> getListOfDegree() {
        return listOfDegree;
    }


    public List<WebElement> getListOfSpecialisation() {
        return listOfSpecialisation;
    }

    @FindBy (xpath = "//input[@id=\"rc_select_6\"]")
 private WebElement specialisationvalue;


    public WebElement getSpecialisationvalue() {
        return specialisationvalue;
    }


    @FindBy (xpath = "(//input[@value='AND'])[1]")
    private WebElement primarymandatoryAndSkills;

    @FindBy (xpath = "(//input[@value='OR'])[1]")
    private WebElement primarymandatoryOrSkills;

    public WebElement getPrimarymandatoryAndSkills() {
        return primarymandatoryAndSkills;
    }

    public WebElement getPrimarymandatoryOrSkills() {
        return primarymandatoryOrSkills;
    }

    public WebElement getPrimarymandatorySkillsValue() {
        return primarymandatorySkillsValue;
    }

    @FindBy (xpath = "//input[@id=\"rc_select_7\"]")
    private WebElement primarymandatorySkillsValue;


    public WebElement getSecondatorymandatorySkillsValue() {
        return secondatorymandatorySkillsValue;
    }

    @FindBy(xpath = "//input[@id=\"rc_select_8\"]")
    private WebElement secondatorymandatorySkillsValue;

    @FindBy (xpath =  "//input[@id=\"mandatorySkills_mandatoryCount\"]")
    private WebElement NoofSkillsRequired;

    @FindBy (xpath = "//div[@class=\"sc-dGQEGF PiPqa\"]")
    private  WebElement deleteMandatorySkill;

    public WebElement getDeleteMandatorySkill() {
        return deleteMandatorySkill;
    }

    public WebElement getNoofSkillsRequired() {
        return NoofSkillsRequired;
    }

    public WebElement getOptionalSkill() {
        return optionalSkill;
    }




    @FindBy (xpath = "//input[@id='rc_select_10']")
    private WebElement optionalSkill;

@FindBy (xpath = "//input[@id=\"rc_select_11\"]")
private WebElement yearofpassing;

    public WebElement getYearofpassing() {
        return yearofpassing;
    }

    public WebElement getAveragescore() {
        return averagescore;
    }

    @FindBy(xpath = "//input[@id=\"scores_avg\"]")
    private WebElement averagescore;

    @FindBy (xpath = "//div[@id='eligibility_specialisations']//div[@class='ant-select-selection-overflow']")
    private WebElement specialisation;

    @FindBy (xpath = "//span[@class='ant-select-tree-title']")
    private List<WebElement> listOfSpecialisation;

    public WebElement getAllowArrear() {
        return allowArrear;
    }

    @FindBy(xpath = "//div[@class=\"sc-fiSPbx fVoltX\"]")
    private WebElement allowArrear;

    @FindBy (xpath = "//input[@id=\"arrearCount_count\"]")
    private  WebElement arrearValue;

    public WebElement getArrearValue() {
        return arrearValue;
    }

    @FindBy (xpath = "(//span[@class='ant-steps-icon'])[3]")
private WebElement eligibilityButton;

    public WebElement getEligibilityButton() {
        return eligibilityButton;
    }

    @FindBy (xpath = "//div[@Class='sc-eDvSVe sc-cPIbRQ dEWiNF esUDZh']")
    private WebElement outside;

    public WebElement getOutside() {
        return outside;
    }

    public void eligibilityCriteria(String degree , String specialisation, String skill1,String skill2, String skill3,String skill4, String skill5, String  skill6, String year1 , String year2, String year3, String year4, String year5) throws AWTException, InterruptedException {

 //click(getEligibilityButton());
  //  Thread.sleep(3000);

  //Degree
    click(getDegree());
    Thread.sleep(1000);
scrollup(getDegree());
Thread.sleep(1000);
sendkeys(getDegreevalue(),degree);
Thread.sleep(2000);
keydown();
Thread.sleep(1000);

//specialisation
Thread.sleep(2000);
         click(getSpecialisation());
         Thread.sleep(1000);
        sendkeys(getSpecialisationvalue(),specialisation);
        Thread.sleep(2000);
keydown();
Thread.sleep(1000);

//Mandatory Primary skills
scrolldown(getPrimarymandatoryAndSkills());
click(getPrimarymandatoryAndSkills());

click(getPrimarymandatorySkillsValue());
sendkeys(getPrimarymandatorySkillsValue(),skill1);
Thread.sleep(2000);
keydown();
Thread.sleep(1000);


click(getPrimarymandatorySkillsValue());
sendkeys(getPrimarymandatorySkillsValue(),skill2);
Thread.sleep(2000);
enterKey();
Thread.sleep(1000);

sendkeys(getPrimarymandatorySkillsValue(),skill3);
Thread.sleep(2000);
enterKey();
Thread.sleep(1000);

sendkeys(getPrimarymandatorySkillsValue(),skill4);
Thread.sleep(2000);
enterKey();
Thread.sleep(1000);

sendkeys(getPrimarymandatorySkillsValue(),skill5);
Thread.sleep(2000);
enterKey();
Thread.sleep(1000);

//Secondary mandatory skills
     click(getSecondatorymandatorySkillsValue());
     sendkeys(getSecondatorymandatorySkillsValue(),skill6);
     Thread.sleep(2000);
     enterKey();
 Thread.sleep(1000);

// No of skills required
      click(getNoofSkillsRequired());
      sendkeys(getNoofSkillsRequired(),"1");
      click(getDeleteMandatorySkill());

 //Year of Passing
click(getYearofpassing());
sendkeys(getYearofpassing(),year1);
Thread.sleep(1000);
enterKey();
sendkeys(getYearofpassing(),year2);
Thread.sleep(1000);
enterKey();
sendkeys(getYearofpassing(),year3);
Thread.sleep(1000);
enterKey();
sendkeys(getYearofpassing(),year4);
Thread.sleep(1000);
enterKey();
sendkeys(getYearofpassing(),year5);
Thread.sleep(1000);
enterKey();

//Score
click(getAveragescore());
sendkeys(getAveragescore(),"60");

//Allow Arrear
        Thread.sleep(2000);
     click(getAllowArrear());
     clear(getArrearValue());
     sendkeys(getArrearValue(),"2");



    }

}