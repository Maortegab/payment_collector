Feature: regla de validacion tipo de moneda
	Background: Abrir paginaHome
				Given Logueo  
	Scenario Outline: Verificar que aparezca un popup con: Todos los TST o TSM no contienen la misma moneda	
        When Escribe un "<Reserva>" de reserva de la row <RowNumber> tipo moneda
        And Dar click en gestionar
        Then Aparece popUp con Mensaje "Todos los TST o TSM no contienen la misma moneda"
        
        Examples:
        |Reserva|RowNumber|
        |tipoMoneda|0|

        
  	Scenario Outline: Verificar que aparezca un popup con: Valida la moneda de cotización y vuelve intentarlo	
        When Escribe un "<Reserva>" de reserva de la row <RowNumber> tipo moneda
        And Dar click en gestionar
        Then Aparece popUp con Mensaje "Valida la moneda de cotización y vuelve intentarlo"
        
        Examples:
        |Reserva|RowNumber|
        |tipoMoneda|0|

        
    Scenario Outline: Verificar que aparezca un popup con: Valida el OID de la cotización y vuelve a intentarlo	
        When Escribe un "<Reserva>" de reserva de la row <RowNumber> tipo moneda
        And Dar click en gestionar
        Then Aparece popUp con Mensaje "Valida el OID de la cotización y vuelve a intentarlo"
        
        Examples:
        |Reserva|RowNumber|
        |tipoMoneda|0|
