package utilities;

import org.openqa.selenium.WebDriver;

public class Driver {


    private Driver(){

    }
    private static WebDriver driver;


    /**
     * getDriver method will initialize the WebDriver by using singleton design pattern
     * will return driver
     * @return
     */
    public static WebDriver getDriver(){
        if(driver==null){
             switch (ConfigurationReader.getProperty("browser").toLowerCase()){
                 case "firefox":
                     driver= FirefoxWebDriver.loadFirefoxDriver(Boolean.parseBoolean(ConfigurationReader.getProperty("headless")));
                     break;
                 case "chrome":
                 default:
                     driver = ChromeWebDriver.establishChromeDriver((Boolean.parseBoolean(ConfigurationReader.getProperty("headless"))));
                     break;
             }
        }
        return driver;
    }

    /**
     * closeDriver method will close the driver
     * @param
     */
    public static void closeDriver() {
        if (driver == null) return;
        try {
            driver.close();
            driver.quit();
            driver = null;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
