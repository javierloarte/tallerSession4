package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import sessionManager.Session;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 08/08/2020.
 **/

@RunWith(Cucumber.class)
@CucumberOptions()
public class Runner {

    // HOOKS ----> Cucumber
    @Before
    public void beforeCucumber(){
        System.out.println("INFO > Cucumber : este es mi BEFORE ---> HOOK");
    }

    @After
    public void afterCucumber(Scenario scenario) throws MalformedURLException {

        if (scenario.isFailed()){
           byte[] screenshot = Session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
           scenario.embed(screenshot,"image/png");
        }


        System.out.println("INFO > Cucumber : este es mi AFTER ---> HOOK");
        Session.getInstance().killSession();


    }


}


