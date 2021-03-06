Feature: Crea account di facebook61
  Come utente devi aprire un homepage di facebook e validare i campi

  Scenario: Valida il campo First Name62
    Given Utente deve trovarsi nella pagina di login
    When Utente inserisce email "pippo@gmail"
    Then Utente controlla che "pippo@gmail" dell'utente sia presente
    Then Chiusura Browser

  Scenario: Validare la creazione di molteplici campi dell utente63
    Given Utente deve trovarsi nella pagina di login
    When Utente inserisce email "mario@gmail"
    And Utente inserisce password "pippo"
    Then Utente controlla che "mario@gmail" dell'utente sia presente
    Then Campo User Mobile dovrebbe essere vuoto
    Then Chiusura Browser
   
   