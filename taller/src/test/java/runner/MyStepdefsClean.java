package runner;

import activities.AddTaskScreen;
import activities.TaskMain;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepdefsClean {

    public AddTaskScreen addTaskScreen = new AddTaskScreen();
    public TaskMain taskMain = new TaskMain();

    @Given("^open task list applicaction$")
    public void openTastLisyApplicaction() {
    }

    @When("^do click on \\[Add\\] button$")
    public void doClickOnAddButton() throws MalformedURLException {
        taskMain.addTaskButton.click();
    }

    @And("^I type '(.*)' on \\[(taskName|taskNote)\\] textbox on WhenDo$")
    public void iTypeReunionOnTaskNameTextboxOnWhenDo(String value,String control) throws MalformedURLException {
        switch (control) {
            case "taskName":
                addTaskScreen.TitleTextbox.type(value);
                break;
            case "taskNote":
                addTaskScreen.NotesTextbox.type(value);
                break;
        }
    }


    @And("^do click on \\[Save\\] button on WhenDo$")
    public void doClickOnSaveButtonOnWhenDo() throws MalformedURLException {
        addTaskScreen.saveButton.click();
    }

    @Then("^verify new task: '(.*)' is created$")
    public void verifyNewTaskNameIsCreated(String expectedContactName) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("ERROR: contacto no fue creado",taskMain.isContactCreated(expectedContactName));
    }
}
