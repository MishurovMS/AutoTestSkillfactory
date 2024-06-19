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

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’FieldName’’)
     */
    @FindBy(id="input_1495810359387")
    private WebElement entryFieldName;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’FieldEmail’’)
     */
    @FindBy(id="input_1495810354468")
    private WebElement entryFieldEmail;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’FieldPhoneNumber’’)
     */
    @FindBy(id="input_1495810410810")
    private WebElement entryFieldPhoneNumber;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’entryField’’)
     */
    @FindBy(id="input_1658683104957")
    private WebElement entryField;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’Send’’)
     */
    @FindBy(css ="#form618809645 .t-submit")
    private WebElement Send;

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
    @FindBy(css = ".tn-elem__6188040781689910041853 > .tn-atom")
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
     * Метод ввода имени Name
     */
    public void inputName() {
        entryFieldName.sendKeys(ConfProperties.getProperty("name")); }

    /**
     * Метод ввода Email
     */
    public void inputEmail() {
        entryFieldEmail.sendKeys(ConfProperties.getProperty("email")); }

    /**
     * Метод ввода Number
     */
    public void inputPhoneNumber() {
        entryFieldPhoneNumber.sendKeys(ConfProperties.getProperty("PhoneNumber")); }

    /**
     * Метод ввода Field
     */
    public void inputField() {
        entryField.sendKeys(ConfProperties.getProperty("comment")); }

    public void sendButton(){
        Send.click();
    }

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
