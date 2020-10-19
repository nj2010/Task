package step_definitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    /**
     * @Before hook can be used for maximize the window or setup our environment (like driver)
     * since we already maximized the window in Driver.java class we don't need to do it
     * @param
     */
    @Before
    public void setUp() {

//        Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//        Driver.getDriver().manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


    }


    /**
     * @After hook method will run after each scenario
     * will check is scenario is failed or not,
     * if failed will take a screenshot
     * and close the driver.
     * @param scenario
     */

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        } catch (Exception e) {
            System.out.println("Exception was happened during running tearDown method: " + e.getMessage());
        }
        Driver.closeDriver();

    }


}
