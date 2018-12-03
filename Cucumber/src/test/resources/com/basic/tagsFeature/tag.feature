Feature: Crea account di facebook81
Come utente devi aprire un homepage di facebook e validare i campi

@Smoke @Regression
Scenario: Valida il campo First Name82
Given Utente deve trovarsi nella pagina di login
When Utente inserisce l'email
Then Utente controlla che l'email dell utente sia presente
Then Chiusura Browser
 
@Important
Scenario: Validare la creazione di molteplici campi dell utente83
Given  Utente deve trovarsi nella pagina di login
When Utente inserisce l'email
And  Utente inserisce password 
Then Utente controlla che l'email dell utente sia presente
Then Campo User Mobile dovrebbe essere vuoto
Then Chiusura Browser



