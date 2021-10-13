@stories
Feature: Academy Choucair
  As a user, I want to createa new user in Utest

  Scenario: create a new user
    Given than Gustavo wants to create a new user in Utest page
      | strLabelJoin  |
      |  Join Today   |
    When he complete all data for register as a new user in Utest page
      | strFirstName  |  strLastname  | strEmail | strMonth|strDay|strYear | strCity   | strPotalCode | strCountry |  strPcOs | strPcVersion | strPcLenguage  |  strMobile  | strMoobileModel | strMoobilOs |  strPassword | strConfirmPassword |
      | Gustavo    | Salazar  | jeft1788@gmail.com | May   | 9    | 1988   | Cali  | 9112     |    Colombia  | TuSOPC   |  TuversionSO |  TuLenuajePC   | TuMarcaMovil| TuDodeloMovil   | TuSOMovil   |  Alive2021+     |      Alive2021+       |
    Then he can see at the page a welcome message
      | strConfirmMessage   |
      | We are excited that you have found your way to uTest - home of the largest community of digital freelance software testers in the world!   |
