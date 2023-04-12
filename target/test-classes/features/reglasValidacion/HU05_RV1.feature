@HU05_Test
Feature: HU 05 regla de validación No 1
  Se requiere validar los datos básicos de la reserva y los formatos correctos de esos datos

	Background:
    Given Logueo
    
  Scenario Outline:: Ingresar la reserva para error: Reserva no contiene un correo
  	When Escribe la "<Reserva>" de la row <RowNumber> HuCinco
    And Dar click en gestionar
    Then Aparece popUp con Mensaje "Reserva no contiene un correo"
    
  Examples:
    |Reserva|RowNumber|
    |reservas_HU05|0|
        
  Scenario Outline:: Ingresar la reserva para error: Número de teléfono no encontrado en la reserva
  	When Escribe la "<Reserva>" de la row <RowNumber> HuCinco
    And Dar click en gestionar
    Then Aparece popUp con Mensaje "Numero telefónico no encontrado en la reserva"
    
  Examples:
    |Reserva|RowNumber|
    |reservas_HU05|1|    
  
    
  Scenario Outline: Verificar que pasa a la pantalla de detalles
    When Escribe la "<Reserva>" de la row <RowNumber> HuCinco
    And Dar click en gestionar
    Then Pasa a la pantalla de detalles de la resrva
    
  Examples:
    |Reserva|RowNumber|
    |reservas_HU05|2|
    |reservas_HU05|3|
    |reservas_HU05|6|
    
  Scenario Outline:: Ingresar la reserva para error: Reserva no contiene un contacto de emergencia
  	When Escribe la "<Reserva>" de la row <RowNumber> HuCinco
    And Dar click en gestionar
    Then Aparece popUp con Mensaje "Reserva no contiene un contacto de emergencia"
    
  Examples:
    |Reserva|RowNumber|
    |reservas_HU05|4|
    
  Scenario Outline:: Ingresar la reserva para error: El pasajero MARIA CAROLINA/XXX XXX no posee un determinante
  	When Escribe la "<Reserva>" de la row <RowNumber> HuCinco
    And Dar click en gestionar
    Then Aparece popUp con Mensaje "no posee un determinante"
    
  Examples:
    |Reserva|RowNumber|
    |reservas_HU05|5|  
  