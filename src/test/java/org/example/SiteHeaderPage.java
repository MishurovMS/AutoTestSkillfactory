package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class SiteHeaderPage {
    public WebDriver driver;


    /**
     * конструктор класса, занимающийся инициализацией
     */
    public SiteHeaderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    public void openPage() {
        driver.get("https://skillfactory.ru");
    }



    /**
     * определение локатора кнопки
     *
     * @Tag(‘’Contacts’’)
     */
    @FindBy(css = "li:nth-child(4) > .main__nav-item")
    private WebElement ContactsButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’IWantToStartLearning’’)
     */
    @FindBy(css = ".tn-elem__6188040781689910041838 > .tn-atom")
    private WebElement IWantToStartLearningButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’I'mAlreadyInTraining’’)
     */
    @FindBy(xpath = "//*[contains(@class, 'tn-elem__6188040781689910041843')]")
    private WebElement ImAlreadyInTrainingButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’IHaveACooperationOffer’’)
     */
    @FindBy(xpath = "//*[contains(@class, 'tn-elem__6188040781689910041848')]")
    private WebElement IHaveACooperationOfferButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’Other’’)
     */
    @FindBy(xpath = "//*[contains(@class, 't396__elem.tn-elem.tn-elem__6188040781689911197304')]")
    private WebElement OtherButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’CareerCenter’’)
     */
    @FindBy(css = "li:nth-child(3) > .main__nav-item")
    private WebElement CareerCenterButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’ToEmployers’’)
     */
    @FindBy(linkText = "Работодателям")
    private WebElement ToEmployersButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’Students’’)
     */
    @FindBy(linkText = "https://skillfactory.ru/career-center-employers")
    private WebElement StudentsButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’Media’’)
     */
    @FindBy(css = "li:nth-child(5) > .main__nav-item")
    private WebElement MediaButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’Professions’’)
     */
    @FindBy(css = ".header__nav li:nth-child(1) > .internal-link")
    private WebElement ProfessionsButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’Career’’)
     */
    @FindBy(css = ".header__nav li:nth-child(2) > .internal-link")
    private WebElement CareerButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’KnowledgeBase’’)
     */
    @FindBy(css = ".header__nav li:nth-child(3) > .internal-link")
    private WebElement KnowledgeBaseButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’Environment’’)
     */
    @FindBy(css = ".header__nav li:nth-child(4) > .internal-link")
    private WebElement EnvironmentButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’IWantToStudy’’)
     */
    @FindBy(linkText = "Хочу учиться")
    private WebElement IWantToStudyButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’CorporateTraining’’)
     */
    @FindBy(css = "li:nth-child(6) > .main__nav-item")
    private WebElement CorporateTrainingButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’IsFree’’)
     */
    @FindBy(linkText = "БЕСПЛАТНО")
    private WebElement IsFreeButton;

    /**
     * Метод нажатия кнопки Contacts
     */

    public void clickContactsButton() {
        ContactsButton.click();
    }

    /**
     * Метод нажатия кнопки IWantToStartLearning
     */

    public void clickIWantToStartLearningButton() {
        IWantToStartLearningButton.click();
    }

    /**
     * Метод нажатия кнопки ImAlreadyInTraining
     */

    public void clickImAlreadyInTrainingButton() {
        ImAlreadyInTrainingButton.click();
    }

    /**
     * Метод нажатия кнопки IHaveACooperationOffer
     */

    public void clickIHaveACooperationOfferButton() {
        IHaveACooperationOfferButton.click();
    }

    /**
     * Метод нажатия кнопки Other
     */

    public void clickOtherButton() {
        OtherButton.click();
    }

    /**
     * Метод нажатия кнопки CareerCenter
     */

    public void clickCareerCenterButton() {
        CareerCenterButton.click();
    }

    /**
     * Метод нажатия кнопки ToEmployers
     */

    public void clickToEmployersButton() {
        ToEmployersButton.click();
    }

    /**
     * Метод нажатия кнопки Students
     */

    public void clickStudentsButton() {
        StudentsButton.click();
    }

    /**
     * Метод нажатия кнопки Media
     */

    public void clickMediaButton() {
        MediaButton.click();
    }

    /**
     * Метод нажатия кнопки Professions
     */

    public void clickProfessionsButton() {
        ProfessionsButton.click();
    }

    /**
     * Метод нажатия кнопки Career
     */

    public void clickCareerButton() {
        CareerButton.click();
    }

    /**
     * Метод нажатия кнопки KnowledgeBase
     */

    public void clickKnowledgeBaseButton() {
        KnowledgeBaseButton.click();
    }

    /**
     * Метод нажатия кнопки Environment
     */

    public void clickEnvironmentButton() {
        EnvironmentButton.click();
    }

    /**
     * Метод нажатия кнопки IWantToStudy
     */

    public void clickIWantToStudyButton() {
        IWantToStudyButton.click();
    }

    /**
     * Метод нажатия кнопки CorporateTraining
     */

    public void clickCorporateTrainingButton() {
        CorporateTrainingButton.click();
    }

    /**
     * Метод нажатия кнопки IsFree
     */

    public void clickIsFreeButton() {
        IsFreeButton.click();
    }


}
