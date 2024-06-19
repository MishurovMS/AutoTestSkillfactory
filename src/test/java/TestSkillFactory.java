import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.GeneralMethods;
import org.example.SiteBodyPage;
import org.example.SiteHeaderPage;
import org.junit.jupiter.api.*;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSkillFactory {
    public static WebDriver driver;


    @BeforeAll
    static void installDriver() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @Tag("Contacts")
    //@Disabled
    @Test
    public void ContactsButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickContactsButton();

    }

    @Tag("IWantToStartLearning")
    //@Disabled
    @Test
    public void IWantToStartLearningButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickContactsButton();
        gm.delay(500);
        gm.getHandle("https://skillfactory.ru/contacts");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickIWantToStartLearningButton();


    }

    @Tag("ImAlreadyInTraining")
    //@Disabled
    @Test
    public void ImAlreadyInTrainingButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickContactsButton();
        gm.delay(500);
        gm.getHandle("https://skillfactory.ru/contacts");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickImAlreadyInTrainingButton();


    }

    @Tag("IHaveACooperationOffer")
    //@Disabled
    @Test
    public void IHaveACooperationOfferButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickContactsButton();
        gm.delay(500);
        gm.getHandle("https://skillfactory.ru/contacts");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickIHaveACooperationOfferButton();

    }

    @Tag("Other")
    //@Disabled
    @Test
    public void OtherButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickContactsButton();
        gm.delay(500);
        gm.getHandle("https://skillfactory.ru/contacts");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickOtherButton();

    }

    @Tag("Field")
    //@Disabled
    @Test
    public void Field() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickContactsButton();
        gm.delay(10);
        gm.getHandle("https://skillfactory.ru/contacts");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickIWantToStartLearningButton();
        gm.delay(500);
        siteHeaderPage.inputName();
        siteHeaderPage.inputEmail();
        siteHeaderPage.inputPhoneNumber();
        siteHeaderPage.inputField();
        siteHeaderPage.sendButton();


    }

    @Tag("CareerCenter")
    //@Disabled
    @Test
    public void CareerCenterButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickCareerCenterButton();

    }

    @Tag("ToEmployers")
    //@Disabled
    @Test
    public void ToEmployersButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickCareerCenterButton();
        gm.delay(500);
        gm.getHandle("https://skillfactory.ru/career-center");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickToEmployersButton();

    }

    @Tag("Media")
    //@Disabled
    @Test
    public void MediaButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        gm.delay(10);
        siteHeaderPage.clickMediaButton();

    }

    @Tag("Professions")
    //@Disabled
    @Test
    public void ProfessionsButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickMediaButton();
        gm.delay(500);
        gm.getHandle("https://blog.skillfactory.ru/");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickProfessionsButton();

    }

    @Tag("Career")
    //@Disabled
    @Test
    public void CareerButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickMediaButton();
        gm.delay(500);
        gm.getHandle("https://blog.skillfactory.ru/");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickCareerButton();

    }

    @Tag("KnowledgeBase")
    //@Disabled
    @Test
    public void KnowledgeBaseButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickMediaButton();
        gm.delay(500);
        gm.getHandle("https://blog.skillfactory.ru/");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickKnowledgeBaseButton();

    }

    @Tag("Environment")
    //@Disabled
    @Test
    public void EnvironmentButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickMediaButton();
        gm.delay(500);
        gm.getHandle("https://blog.skillfactory.ru/");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickEnvironmentButton();

    }

    @Tag("IWantToStudy")
    //@Disabled
    @Test
    public void IWantToStudyButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteHeaderPage.clickMediaButton();
        gm.delay(500);
        gm.getHandle("https://blog.skillfactory.ru/");
        String currHandle = driver.getWindowHandle();
        AssertJUnit.assertNotNull(currHandle);
        siteHeaderPage.clickIWantToStudyButton();

    }

    @Tag("CorporateTraining")
    //@Disabled
    @Test
    public void CorporateTrainingButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        gm.delay(10);
        siteHeaderPage.clickCorporateTrainingButton();


    }

    @Tag("IsFree")
    //@Disabled
    @Test
    public void IsFreeButton() {
        SiteHeaderPage siteHeaderPage = new SiteHeaderPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        gm.delay(10);
        siteHeaderPage.clickIsFreeButton();


    }

    @Tag("AllCourses")
    //@Disabled
    @Test
    public void AllCoursesButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteBodyPage.clickAllCoursesButton();

    }


    @Tag("DataAnalytics")
    //@Disabled
    @Test
    public void DataAnalyticsButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteBodyPage.clickDataAnalyticsButton();

    }

    @Tag("Testing")
    //@Disabled
    @Test
    public void TestingButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteBodyPage.clickTestingButton();

    }

    @Tag("Design")
    //@Disabled
    @Test
    public void DesignButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteBodyPage.clickDesignButton();

    }

    @Tag("HigherEducation")
    //@Disabled
    @Test
    public void HigherEducationButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteBodyPage.clickHigherEducationButton();

    }

    @Tag("Management")
    //@Disabled
    @Test
    public void ManagementButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteBodyPage.clickManagementButton();

    }

    @Tag("DataScience")
    //@Disabled
    @Test
    public void DataScienceButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteBodyPage.clickDataScienceButton();

    }

    @Tag("Programming")
    //@Disabled
    @Test
    public void ProgrammingButton() {
        SiteBodyPage siteBodyPage = new SiteBodyPage(driver);
        GeneralMethods gm = new GeneralMethods(driver);
        gm.openPage();
        siteBodyPage.clickProgrammingButton();

    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }


}
