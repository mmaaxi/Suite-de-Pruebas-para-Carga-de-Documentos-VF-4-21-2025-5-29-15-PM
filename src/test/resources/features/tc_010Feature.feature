Feature: Validar funcionalidad de eliminación de documentos cargados
  In order to manage documents
  As a user
  I want to be able to delete uploaded documents

  Scenario: Eliminar un documento cargado
    Given El usuario ha cargado un documento
    When El usuario accede a la opción de eliminación
    Then El sistema debe permitir seleccionar y eliminar el documento
    And El documento eliminado ya no debe aparecer en la lista
    And El documento se debe eliminar permanentemente de la base de datos