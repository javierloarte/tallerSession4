package activities;

import controlsAppium.Button;
import controlsAppium.Label;
import org.openqa.selenium.By;

public class TaskMain {
    public Button addTaskButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public TaskMain(){

    }

    //verificar si un contacto es mostrado en la litas de contactos
    public boolean isContactCreated(String contactName){
        //By.xpath("//*[@text='"+contacto+"']")
        Label contactLabel = new Label(By.xpath("//*[@text='"+contactName+"']"));
        return  contactLabel.isControlDisplayed();
    }

}



