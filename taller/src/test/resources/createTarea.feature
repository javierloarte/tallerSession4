Feature: TaskList

  Scenario: Add new task

    Given open task list applicaction
    When do click on [Add] button
    And I type 'Estudiar' on [taskName] textbox on WhenDo
    And I type 'Examen Parcial' on [taskNote] textbox on WhenDo
    And do click on [Save] button on WhenDo
    Then verify new task: 'Estudiar' is created
