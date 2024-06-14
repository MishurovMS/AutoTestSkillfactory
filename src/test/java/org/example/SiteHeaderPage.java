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
     * @Tag(‘’Contacts’’)
     */
    @FindBy(xpath = "//*[contains(@class, 'passp-field-login')]")
    private WebElement ContactsButton;

    /**
     * определение локатора кнопки
     *
     * @Tag(‘’IWantToStartLearning’’)
     */
    @FindBy(xpath = "//*[contains(@class, 'tn-elem__6188040781689910041838')]")
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
    @FindBy(xpath = "//*[contains(@class, 'tn-elem__6188040781689910041853')]")
    private WebElement OtherButton;




}
