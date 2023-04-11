
@HU06_Test
Feature: HU 06 regla de validación No 6
  Se requiere validar los datos de TSA/APIS para la regla de validación 

	Background:
    Given Logueo
    
  Scenario Outline: Ingresar la reserva para error: Por favor ingrese el APIS/TSA en la reserva
    When Escribe la "<Reserva>" de la row <RowNumber> APIS-TSA
    And Dar click en gestionar
    Then Aparece popUp con Mensaje "Por favor ingrese el APIS/TSA en la reserva"
    
  Examples:
    |Reserva|RowNumber|
    |reservas|0|
    #|reservas|1|
    #| reservas | 2			 	 |
    #
  Scenario Outline: Ingresar la reserva para error: asociacion de segmentos APIS TSA
    Given Escribe la "<Reserva>" de la row <Rownumber> APIS-TSA
    When Dar click en gestionar
    Then Validar que el texto de salida es "Por favor verifica la asociación de segmentos del APIS/TSA"
    
  Examples:
    | Reserva  | RowNumber |
    | reservas | 0 				 |
    #| reservas | 1				 |
    #| reservas | 2			 	 |
    #
  #Scenario Outline: Ingresar la reserva para error: No has ingresado el RIZ para esta reserva
    #Given Escribe la "<Reserva>" de la row <Rownumber> APIS-TSA
    #When Dar click en gestionar
    #Then Validar que el texto de salida es "No has ingresado el RIZ para esta reserva"
    #
  #Examples:
    #| Reserva  | RowNumber |
    #| reservas | 0 				 |
    #| reservas | 1				 |
    #| reservas | 2			 	 |
    #
  #Scenario Outline: Ingresar la reserva para error: No has ingresado el FS
    #Given Escribe la "<Reserva>" de la row <Rownumber> APIS-TSA
    #When Dar click en gestionar
    #Then Validar que el texto de salida es "No has ingresado el FS"
    #
  #Examples:
    #| Reserva  | RowNumber |
    #| reservas | 0 				 |
    #| reservas | 1				 |
    #| reservas | 2			 	 |
    #
  #Scenario Outline: Ingresar la reserva y pase exitosamente
    #Given Escribe la "<Reserva>" de la row <Rownumber> APIS-TSA
    #When Dar click en gestionar
    #Then Validar que el texto de salida es "Formulario"
    #
  #Examples:
    #| Reserva  | RowNumber |
    #| reservas | 0 				 |
    #| reservas | 1				 |
    #| reservas | 2			 	 |    
