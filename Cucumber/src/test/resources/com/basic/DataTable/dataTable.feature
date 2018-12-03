Feature: Crea account di facebook2
Come utente devi aprire un homepage di facebook e validare i campi



Scenario Outline: Valida il campo First Name21
Given Utente deve trovarsi nella pagina di login
When Utente inserisce "<email>" e "<password>"
Then Utente controlla che il nome dell'utente sia presente 


Examples:

      | email       | password | 
      | mario@gmail |     ffgr | 
      | pippo@gmail |     rrgrh| 
 