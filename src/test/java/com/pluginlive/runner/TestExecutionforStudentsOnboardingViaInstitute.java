package com.pluginlive.runner;

import com.pluginlive.ListenersExample;
import com.pluginlive.base.BaseClass;
import com.pluginlive.pagemanager.PageObjectManagerStudentsOnboardingViaInstitute;
import com.pluginlive.runner.excel.utility.XLUtility;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;
@Listeners(ListenersExample.class)
public class TestExecutionforStudentsOnboardingViaInstitute extends BaseClass {

    PageObjectManagerStudentsOnboardingViaInstitute pom = new PageObjectManagerStudentsOnboardingViaInstitute();

    public TestExecutionforStudentsOnboardingViaInstitute() throws IOException {
        super();
    }

    @BeforeSuite
    public void setUp() throws IOException, InterruptedException {
        // Common setup code here
        getdriver(getPropertyFileValue("browser")); // Initialize driver here
        deletecookies();
        pageload();
        maximizewindow();
    }

    @BeforeMethod
    public void url() throws IOException, InterruptedException {
        implicitywait();
        enterurl(getPropertyFileValue("institutelogin"));
    }


        //Data from excel
        @DataProvider(name = "StudentsOnboardingViaInstitute")
        public String[][] getData() throws IOException {
            String path = "C:\\Users\\Priya Thangaraj\\Desktop\\Pluginlive Automation\\PluginLive-Automation (1)\\Excel\\PluginLive Automation Students Onboarding Via Institute.xlsx";
            XLUtility xlutil = new XLUtility(path);
            int totalrows = xlutil.getRowCount("StudentsOnboardingViaInstitute");
            int totalcols = xlutil.getCellCount("StudentsOnboardingViaInstitute", 1);
            String loginData[][] = new String[totalrows][totalcols];
            for (int i = 1; i <= totalrows; i++) {
                for (int j = 0; j < totalcols; j++) {
                    loginData[i - 1][j] = xlutil.getCellData("StudentsOnboardingViaInstitute", i, j);
                }
            }
            return loginData;
        }


        @AfterSuite
        public void tearDown() {
            // Common teardown code here
            if (driver != null) {
                driver.quit();
            }
        }

        @Test(dataProvider = "StudentsOnboardingViaInstitute")

public void StudentsOnboardingViaInstitute(String emailid, String password ,String firstname, String lastname, String rollno, String dob, String degree, String department, String from, String to,String percentage, String contactemail, String pincode, String contactnumber , String gmail, String gmailpassword,String newPassword, String confirmPassword , String profilepic , String sex, String Addressline1, String Addressline2	, String Country, String State , String	City, String Pincode, String schlname	, String Board,String tenthpercentage,String twelfthSchool, String twelfthBoard, String	twelfthpercentage) throws IOException, InterruptedException, AWTException {

        pom.getLoginPage().login(emailid,password);
        pom.getDashboardPage().dashboard();
        pom.getStudentsPage().studentpage(firstname, lastname, rollno, dob, degree, department, from, to,percentage, contactemail, pincode, contactnumber);
            enterurl(getPropertyFileValue("gmaillogin"));
            maximizewindow();
            implicitywait();
            pom.getEmailVerification().emaillogin(gmail, gmailpassword);
            pom.getEmailVerification().emaillist();
            pom.getSetPassword().setNewPassword(newPassword, confirmPassword);
            pom.getUploadResume().resume();
            pom.getUploadProfile().uploadphoto(profilepic);
            pom.getPersonalDetails().personaldetails(sex, Addressline1,	Addressline2,Country,State,City,Pincode);
            pom.getEducationalDetails().tenth(schlname,Board,tenthpercentage);
            pom.getEducationalDetails().twelfth(twelfthSchool,twelfthBoard,twelfthpercentage);
            pom.getEducationalDetails().clickandcontinue();
            pom.getProjectAndInternship().projectandinternship();
            pom.getWorkExperience().saveandcontinue();
            pom.getCoursesAndTraining().coursesandtraining();
            pom.getProofAndDocuments().proofanddocument();
            pom.getAdditionalDetails().additionaldetails();
            pom.getAdditionalDetails().whatsappandemailnotification();

        }



    }

