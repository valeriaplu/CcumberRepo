$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shared.feature");
formatter.feature({
  "line": 1,
  "name": "Crea account di facebook71",
  "description": "Come utente devi aprire un homepage di facebook e validare i campi",
  "id": "crea-account-di-facebook71",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2265049423,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Valida il campo First Name72",
  "description": "",
  "id": "crea-account-di-facebook71;valida-il-campo-first-name72",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Utente deve trovarsi nella pagina di login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Utente inserisce email \"pippo@gmail\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Utente controlla che \"pippo@gmail\" dell\u0027utente sia presente",
  "keyword": "Then "
});
formatter.match({
  "location": "SharedStepDef.utente_devi_aprire_un_homepage_di_facebook_e_validare_i_campi()"
});
formatter.result({
  "duration": 1931653279,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pippo@gmail",
      "offset": 24
    }
  ],
  "location": "SharedStepDef.utente_deve_inserire_email(String)"
});
formatter.result({
  "duration": 1172376732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pippo@gmail",
      "offset": 22
    }
  ],
  "location": "SharedStepDef2.utent_controlla_che_email_dell_utente_sia_presente(String)"
});
formatter.result({
  "duration": 1050127798,
  "status": "passed"
});
formatter.after({
  "duration": 732652018,
  "status": "passed"
});
formatter.before({
  "duration": 2306498201,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validare la creazione di molteplici campi dell utente73",
  "description": "",
  "id": "crea-account-di-facebook71;validare-la-creazione-di-molteplici-campi-dell-utente73",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Utente deve trovarsi nella pagina di login",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Utente inserisce email \"mario@gmail\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Utente inserisce password \"pippo\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Utente controlla che \"mario@gmail\" dell\u0027utente sia presente",
  "keyword": "Then "
});
formatter.match({
  "location": "SharedStepDef.utente_devi_aprire_un_homepage_di_facebook_e_validare_i_campi()"
});
formatter.result({
  "duration": 1985262374,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mario@gmail",
      "offset": 24
    }
  ],
  "location": "SharedStepDef.utente_deve_inserire_email(String)"
});
formatter.result({
  "duration": 1150992621,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pippo",
      "offset": 27
    }
  ],
  "location": "SharedStepDef2.Utente_inserisce_password(String)"
});
formatter.result({
  "duration": 1143558739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mario@gmail",
      "offset": 22
    }
  ],
  "location": "SharedStepDef2.utent_controlla_che_email_dell_utente_sia_presente(String)"
});
formatter.result({
  "duration": 1039265167,
  "status": "passed"
});
formatter.after({
  "duration": 741948476,
  "status": "passed"
});
});