package sessionManager;


//metodo esttito publico un objeto de la misma clase : Session
// atributo del mismo tipo de la clase : Session

import factoryDevices.FactoryDevices;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {

    private static Session mySession = null;
    private AppiumDriver driver;

    private Session() throws MalformedURLException {
        driver  = FactoryDevices.make("android").create();
     //   driver  = FactoryDevices.make("cloud").create();

    }

    public static Session getInstance() throws MalformedURLException {
        if (mySession == null){
            mySession = new Session();
        }

        return  mySession;
    }

    public AppiumDriver getDriver(){
        return driver;
    }
    //metodo para matar la session
    public void killSession(){
        driver.quit();
        mySession=null;
    }

}
