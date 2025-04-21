Feature: Validate file size limit
  As a user
  I want to receive a clear error message when uploading a file that exceeds the size limit
  So that I understand the file size restrictions

  Scenario: Upload a file that exceeds the maximum allowed size
    When I select a file larger than the allowed size for upload
    Then the system should detect the size excess and block the upload
    And an error message should inform the maximum permitted size and request a compliant file