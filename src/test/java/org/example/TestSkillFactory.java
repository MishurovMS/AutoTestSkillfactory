package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;



public class TestSkillFactory {
    public static WebDriver driver;


    @BeforeAll
    static void installDriever() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @Tag("Contacts")
    @Disabled
    @Test
    public void ContactsButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        siteHeaderPage.clickContactsButton();

    }

    @Tag("Other")
    @Disabled
    @Test
    public void OtherButton(){
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        siteHeaderPage.clickContactsButton();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("//*[contains(@class, 'tn-elem__6188040781689910041835')]")));
        //siteHeaderPage.clickOtherButton();
    }

    @Tag("CareerCenter")
    @Disabled
    @Test
    public void CareerCenterButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        siteHeaderPage.clickCareerCenterButton();

    }

    @Tag("ToEmployers")
    @Disabled
    @Test
    public void ToEmployersButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        siteHeaderPage.clickCareerCenterButton();
        siteHeaderPage.clickToEmployersButton();

    }

    @Tag("Media")
    @Disabled
    @Test
    public void MediaButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        siteHeaderPage.clickMediaButton();

    }

    @Tag("Professions")
    @Disabled
    @Test
    public void ProfessionsButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        siteHeaderPage.clickProfessionsButton();

    }

    @Tag("Career")
    @Disabled
    @Test
    public void CareerButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        siteHeaderPage.clickCareerButton();

    }

    @Tag("KnowledgeBase")
    @Disabled
    @Test
    public void KnowledgeBaseButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        siteHeaderPage.clickKnowledgeBaseButton();

    }

    @Tag("Environment")
    @Disabled
    @Test
    public void EnvironmentButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        siteHeaderPage.clickEnvironmentButton();

    }

    @Tag("IWantToStudy")
    @Disabled
    @Test
    public void IWantToStudyButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickIWantToStudyButton();

    }

    @Tag("CorporateTraining")
    @Disabled
    @Test
    public void CorporateTrainingButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickCorporateTrainingButton();


    }

    @Tag("IsFree")
    @Disabled
    @Test
    public void IsFreeButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickIsFreeButton();


    }

    @Tag("AllCourses")
    @Disabled
    @Test
    public void AllCoursesButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        siteBodyPage.openPage();
        siteBodyPage.clickAllCoursesButton();

    }

    @Tag("AllCourses")
    @Disabled
    @Test
    public void ProgrammingButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        siteBodyPage.openPage();
        siteBodyPage.clickProgrammingButton();

    }

    @Tag("DataAnalytics")
    @Disabled
    @Test
    public void DataAnalyticsButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        siteBodyPage.openPage();
        siteBodyPage.clickDataAnalyticsButton();

    }

    @Tag("Testing")
    @Disabled
    @Test
    public void TestingButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        siteBodyPage.openPage();
        siteBodyPage.clickDataAnalyticsButton();

    }

    @Tag("Design")
    @Disabled
    @Test
    public void DesignButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        siteBodyPage.openPage();
        siteBodyPage.clickDesignButton();

    }

    @Tag("HigherEducation")
    @Disabled
    @Test
    public void HigherEducationButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        siteBodyPage.openPage();
        siteBodyPage.clickHigherEducationButton();

    }

    @Tag("Management")
    @Disabled
    @Test
    public void ManagementButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        siteBodyPage.openPage();
        siteBodyPage.clickManagementButton();

    }

    @Tag("DataScience")
    @Disabled
    @Test
    public void DataScienceButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        siteBodyPage.openPage();
        siteBodyPage.clickDataScienceButton();

    }


    @AfterClass
    public void closeBrowser() {
        driver.close();
    }


}
