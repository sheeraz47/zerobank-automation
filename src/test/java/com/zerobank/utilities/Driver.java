package com.zerobank.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Driver {

        private static WebDriver driver;

        private Driver(){

        }


        public static WebDriver get() {
            if (driver == null) {
                String browser = ConfigurationReader.getProperty("browser");
                switch (browser) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "chrome_headless":
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions options = new ChromeOptions();
                        options.setHeadless(true);
                        driver = new ChromeDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        break;
                    case "firefox_headless":
                        WebDriverManager.firefoxdriver().setup();
                        FirefoxOptions options1 = new FirefoxOptions();
                        options1.setHeadless(true);
                        driver = new FirefoxDriver();
                        break;
                    case "opera":
                        WebDriverManager.operadriver().setup();
                        driver = new OperaDriver();
                        break;
                }
            }
            return driver;
        }

        public static void close(){
            if(driver != null){
                driver.quit();
                driver = null;
            }
        }

}
