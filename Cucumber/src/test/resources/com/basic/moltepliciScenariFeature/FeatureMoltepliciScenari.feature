Feature: Crea account di facebook31
Come utente devi aprire un homepage di facebook e validare i campi

Scenario: Valida il campo First Name32
Given Utente deve trovarsi nella pagina di login
When Utente inserisce l'email
Then Utente controlla che l'email dell utente sia presente
Then Chiusura Browser
 
Scenario: Validare la creazione di molteplici campi dell utente33
Given  Utente deve trovarsi nella pagina di login
When Utente inserisce l'email
And  Utente inserisce password 
Then Utente controlla che l'email dell utente sia presente
Then Campo User Mobile dovrebbe essere vuoto
Then Chiusura Browser
 