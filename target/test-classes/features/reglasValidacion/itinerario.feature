Feature: regla de validacion itinerario
	Background: Abrir paginaHome
				Given Logueo  
	Scenario Outline: Verificar que aparezca un popup con: La reserva no tiene cupo confirmado		
        When Escribe un "<Reserva>" de reserva de la row <RowNumber> itinerario
        And Dar click en gestionar
        Then Aparece popUp con Mensaje "La reserva no tiene cupo confirmado"
        
        Examples:
        |Reserva|RowNumber|
        |reservas|0|
        |reservas|1|
        |reservas|2|
        |reservas|3|
        |reservas|4|
        |reservas|5|
       
        
  #Scenario Outline: Verificar que aparezca un popup con: La fecha de partida ya ha pasado	
   #     When Escribe un "<Reserva>" de reserva de la row <RowNumber itinerario> 
    #    And Dar click en gestionar
     #   Then Aparece popUp con Mensaje "La fecha de partida ya ha pasado"
        
      #  Examples:
       # |Reserva|RowNumber|
        #|reservas|1|
 
  # Scenario Outline: Verificar que aparezca un popup con: Reserva no contiene un itinerario confirmado
   #     When Escribe un "<Reserva>" de reserva de la row <RowNumber itinerario> 
    #    And Dar click en gestionar
     #   Then Aparece popUp con Mensaje "Reserva no contiene un itinerario confirmado"
        
      #  Examples:
       # |Reserva|RowNumber|
        #|reservas|2|
        
        
   #Scenario Outline: Verificar que pasa a la pantalla de detalles
    #    When Escribe un "<Reserva>" de reserva de la row <RowNumber itinerario> 
     #   And Dar click en gestionar
      #  Then Pasa a la pantalla de detalles de la resrva
        
       # Examples:
        #|Reserva|RowNumber|
        #|reservas|3|
      #  |reservas|9|
       # |reservas|10|
        
        