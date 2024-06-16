package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Map;


public class TestSkillFactory {
    public static WebDriver driver;
    private Map<String, Object> vars;

    @BeforeAll
    static void installDriever() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

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
    public void OtherButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        siteHeaderPage.clickContactsButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        siteHeaderPage.clickOtherButton();
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
    public void ToEmployersButton() throws InterruptedException {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        siteHeaderPage.clickCareerCenterButton();
        Thread.sleep(2000);
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
    //@Disabled
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
    //@Disabled
    @Test
    public void CareerButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        siteHeaderPage.clickCareerButton();

    }

    @Tag("KnowledgeBase")
    //@Disabled
    @Test
    public void KnowledgeBaseButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        siteHeaderPage.clickKnowledgeBaseButton();

    }

    @Tag("Environment")
    //@Disabled
    @Test
    public void EnvironmentButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        siteHeaderPage.clickEnvironmentButton();

    }

    @Tag("IWantToStudy")
    //@Disabled
    @Test
    public void IWantToStudyButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickMediaButton();
        siteHeaderPage.clickIWantToStudyButton();

    }

    @Tag("CorporateTraining")
    //@Disabled
    @Test
    public void CorporateTrainingButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        siteHeaderPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        siteHeaderPage.clickCorporateTrainingButton();


    }




    @AfterClass
    public void closeBrowser() {
        driver.close();
    }


}
