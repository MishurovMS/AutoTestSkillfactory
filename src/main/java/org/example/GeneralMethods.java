package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class GeneralMethods {
    public WebDriver driver;

    public GeneralMethods(WebDriver driver) {
        this.driver = driver;
    }


    public void openPage() {
        driver.get(ConfProperties.getProperty("siteName"));
    }

    public void getHandle(String url) {
        driver.get(url);
    }

    public void delay(int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

}
