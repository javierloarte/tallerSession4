package controlsAppium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import sessionManager.Session;

import java.net.MalformedURLException;
import java.time.Duration;

public class Control {

    protected WebElement control;
    protected By locator;

    public Control(By locator){
        this.locator=locator;
    }

    protected void find() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.find();
        this.control.click();
    }


    public void type(String value) throws MalformedURLException {
        this.find();
        this.control.sendKeys(value);
    }

    public  boolean isControlDisplayed(){
        try {
            this.find();
            return  this.control.isDisplayed();
        } catch (Exception e){
            return  false;
        }

    }

    public WebElement getControl() throws MalformedURLException {
        this.find();
        return this.control;
    }

    public void swipe(WebElement origen, WebElement destino) throws MalformedURLException {
        TouchAction action = new TouchAction(Session.getInstance().getDriver());
        int origenX = origen.getLocation().getX();
        int origenY = origen.getLocation().getY();

        int destinoX = destino.getLocation().getX();
        int destinoY = destino.getLocation().getY();

        action.press(PointOption.point(new Point(origenX, origenY)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(new Point(destinoX, destinoY)))
                .release().perform();
    }

}
