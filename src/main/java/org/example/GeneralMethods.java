package org.example;


import org.openqa.selenium.WebDriver;


public class GeneralMethods {
    public WebDriver driver;

    public GeneralMethods(WebDriver driver) {
        this.driver = driver;
    }




    public void openPage() {
        driver.get(ConfProperties.getProperty("siteName"));
    }
    public void getHandle(String url){
        driver.get(url);
    }

}
