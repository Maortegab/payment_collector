Feature: Firma de amadeus

	Background: Ingresar al modulo de la firma de amadeus
				Given Logueo Pyemnt Collector
				When Ingreso al home
				And Ingresar al modulo Usuario Amadeus
				
  Scenario: Logueo solicitud de ingreso
        Then Se muestra solicitud de ingreso

  Scenario: Mensaje de advertencia en campo usuario
        When Ingresar nombre de usuario de amadeus
        And Dar clic en boton guardar
        Then Se muestra mensaje Verifica que el usuario este correcto