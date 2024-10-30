package com.pluginlive.pagemanager;


import com.pluginlive.pagesforStudentsOnboardingViaInstitute.*;

import java.io.IOException;

public class PageObjectManagerStudentsOnboardingViaInstitute {

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.LoginPage getLoginPage() throws IOException {
        return (loginPage == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.LoginPage() : loginPage;
    }

    private LoginPage loginPage;


    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.DashboardPage getDashboardPage() throws IOException {
        return (dashboardPage == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.DashboardPage() : dashboardPage;
    }

    private DashboardPage dashboardPage;


    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.StudentsPage getStudentsPage() throws IOException {
        return (studentsPage == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.StudentsPage() : studentsPage;
    }

    private StudentsPage studentsPage;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.EmailVerification getEmailVerification() throws IOException {
        return (emailVerification == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.EmailVerification() : emailVerification;
    }

    private EmailVerification emailVerification;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.SetPassword getSetPassword() throws IOException {
        return (setPassword == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.SetPassword() : setPassword;
    }

    private SetPassword setPassword;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.UploadResume getUploadResume() throws IOException {
        return (uploadResume == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.UploadResume() : uploadResume;
    }

    private UploadResume uploadResume;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.UploadProfile getUploadProfile() throws IOException {
        return (uploadProfile == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.UploadProfile() : uploadProfile;
    }

    private UploadProfile uploadProfile;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.PersonalDetails getPersonalDetails() throws IOException {
        return (personalDetails == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.PersonalDetails() : personalDetails;
    }

    private PersonalDetails personalDetails;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.EducationalDetails getEducationalDetails() throws IOException {
        return (educationalDetails == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.EducationalDetails() : educationalDetails;
    }

    private EducationalDetails educationalDetails;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.ProjectAndInternship getProjectAndInternship() throws IOException {
        return (projectAndInternship == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.ProjectAndInternship() : projectAndInternship;
    }

    private ProjectAndInternship projectAndInternship;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.WorkExperience getWorkExperience() throws IOException {
        return (workExperience == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.WorkExperience() : workExperience;
    }

    private WorkExperience workExperience;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.CoursesAndTraining getCoursesAndTraining() throws IOException {
        return (coursesAndTraining == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.CoursesAndTraining() : coursesAndTraining;
    }

    private CoursesAndTraining coursesAndTraining;

    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.ProofAndDocuments getProofAndDocuments() throws IOException {
        return (proofAndDocuments == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.ProofAndDocuments() : proofAndDocuments;
    }

    private ProofAndDocuments proofAndDocuments;


    public com.pluginlive.pagesforStudentsOnboardingViaInstitute.AdditionalDetails getAdditionalDetails() throws IOException {
        return (additionalDetails == null) ? new com.pluginlive.pagesforStudentsOnboardingViaInstitute.AdditionalDetails() : additionalDetails;
    }

    private AdditionalDetails additionalDetails;

}