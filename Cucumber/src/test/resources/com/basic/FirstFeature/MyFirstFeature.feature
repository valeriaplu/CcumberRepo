Feature: Crea account di facebook1
Come utente devi aprire un homepage di facebook e validare i campi

Scenario: Valida il campo First Name12
Given Utente deve trovarsi nella pagina di login
When Utente deve inserire il nome
Then Utente controlla che il nome dell utente sia presente
 
#Scenario: Validare la creazione di molteplici campi dell utente
#Given Precondizione per iniziare lo scenario : Utente deve trovarsi nella pagina di login
#When Utente deve inserire il nome
#Then Utent controlla che il nome dell utente sia presente
#And Utente controlla che il cognome dell utente sia presente
#But campo User Mobile dovrebbe essere vuoto
