package activities;

import controlsAppium.Button;
import controlsAppium.TextBox;
import org.openqa.selenium.By;

public class AddTaskScreen {

  //  public TextBox TitleTextbox = new TextBox(By.xpath("com.vrproductiveapps.whendo:id/noteTextTitle"));
   // public TextBox NotesTextbox = new TextBox(By.xpath("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public TextBox TitleTextbox = new TextBox(By.xpath("//*[contains(@resource-id,'noteTextTitle')]"));
  public TextBox NotesTextbox = new TextBox(By.xpath("//*[contains(@resource-id,'noteTextNotes')]"));
   public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));


    public AddTaskScreen(){
    }
}
