package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteBodyPage {
    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией
     */
    public SiteBodyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



        /**
         * определение локатора кнопки
         *
         * @Tag(‘’AllCourses’’)
         */
        @FindBy(css = ".directions__list-link_green > span")
        private WebElement AllCoursesButton;

        /**
         * определение локатора кнопки
         *
         * @Tag(‘’Programming’’)
         */
        @FindBy(css = "li:nth-child(1) > .directions__list-link > span")
        private WebElement ProgrammingButton;

        /**
         * определение локатора кнопки
         *
         * @Tag(‘’DataAnalytics’’)
         */
        @FindBy(css = "li:nth-child(3) > .directions__list-link > span")
        private WebElement DataAnalyticsButton;

        /**
         * определение локатора кнопки
         *
         * @Tag(‘’Testing’’)
         */
        @FindBy(css = "li:nth-child(4) > .directions__list-link > span")
        private WebElement TestingButton;

        /**
         * определение локатора кнопки
         *
         * @Tag(‘’Design’’)
         */
        @FindBy(css = "li:nth-child(6) > .directions__list-link > span")
        private WebElement DesignButton;

        /**
         * определение локатора кнопки
         *
         * @Tag(‘’HigherEducation’’)
         */
        @FindBy(css = "li:nth-child(5) > .directions__list-link > span")
        private WebElement HigherEducationButton;

        /**
         * определение локатора кнопки
         *
         * @Tag(‘’Management’’)
         */
        @FindBy(css = "li:nth-child(7) > .directions__list-link > span")
        private WebElement ManagementButton;

        /**
         * определение локатора кнопки
         *
         * @Tag(‘’DataScience’’)
         */
        @FindBy(css = "li:nth-child(2) > .directions__list-link > span")
        private WebElement DataScienceButton;


        /**
         * Метод нажатия кнопки AllCoursesButton
         */

        public void clickAllCoursesButton() {
            AllCoursesButton.click();

        }

        /**
         * Метод нажатия кнопки Programming
         */

        public void clickProgrammingButton () {
            ProgrammingButton.click();
        }

        /**
         * Метод нажатия кнопки DataAnalytics
         */

        public void clickDataAnalyticsButton () {
            DataAnalyticsButton.click();
        }

        /**
         * Метод нажатия кнопки Testing
         */

        public void clickTestingButton () {
            TestingButton.click();
        }

        /**
         * Метод нажатия кнопки Design
         */

        public void clickDesignButton () {
            DesignButton.click();
        }

        /**
         * Метод нажатия кнопки HigherEducation
         */

        public void clickHigherEducationButton () {
            HigherEducationButton.click();
        }

        /**
         * Метод нажатия кнопки Management
         */

        public void clickManagementButton () {
            ManagementButton.click();
        }

        /**
         * Метод нажатия кнопки DataScience
         */

        public void clickDataScienceButton () {
            DataScienceButton.click();
        }

    }
