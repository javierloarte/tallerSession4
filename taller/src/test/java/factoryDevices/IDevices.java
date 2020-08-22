package factoryDevices;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface IDevices {

    AppiumDriver create() throws MalformedURLException;
}
