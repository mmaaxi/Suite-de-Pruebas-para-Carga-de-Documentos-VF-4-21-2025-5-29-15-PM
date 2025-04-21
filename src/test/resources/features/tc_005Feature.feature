Feature: Validate document retrieval and display

  Scenario: Upload and access document viewer
    Given a user uploads a document
    When the user accesses the document viewing module
    Then the document should open without errors in the integrated viewer

  Scenario: Verify metadata
    Given the document is open in the viewer
    When the user checks the displayed metadata
    Then the system should display the correct document information