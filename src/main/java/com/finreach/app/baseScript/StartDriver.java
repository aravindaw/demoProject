package com.finreach.app.baseScript;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class StartDriver {
    protected static WebDriver driver;

    @BeforeTest
    public void createTestEnvironment() throws ConfigurationException {
        CompositeConfiguration config = new CompositeConfiguration();
        config.addConfiguration(new PropertiesConfiguration("src/main/resources/config.properties"));
        System.setProperty("webdriver.chrome.driver", config.getProperty("WEB_DRIVER_PATH").toString());
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
        driver.get(config.getProperty("BASE_URL").toString());
    }

    @AfterTest
    public void exitTestEnvironment() throws ConfigurationException {
        driver.quit();
    }
}
