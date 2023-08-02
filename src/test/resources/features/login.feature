#language:pt

Funcionalidade: Login Jira Smart


  Contexto:
    Dado que a pagina de seguranca esteja aberta
    Entao pagina de seguranca e exibida com sucesso


  Esquema do Cenario: Realizar Login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |

    Quando for realizado o clique no botao log In
    Então sistema deve exibir mensagem de erro

    Exemplos:
      | identificacao    | login         | password | remember |
      | usuário invalido | dani.xavi     | senha    | false    |
      | senha invalida   | daniel.xavier | 123456   | false    |

  @dadosEmBranco
  Esquema do Cenario: Realizar Login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |

    Quando for realizado o clique no botao log In
    Então sistema deve exibir mensagem de erro

    Exemplos:
      | identificacao     | login         | password | remember |
      | usuário em branco |               | senha    | false    |
      | senha em branco   | daniel.xavier |          | false    |
  @loginComSucesso
  Esquema do Cenario: Realizar Login com <identificacao>
    Quando os campos de login forem preenchidos da seguinte forma
      | login    | <login>    |
      | password | <password> |
    Quando for realizado o clique no botao log In
    Então sistema loga com sucesso

    Exemplos:
      | identificacao           | login         | password    | remember |
      | usuário e senha Validos | daniel.xavier | BancoToyota | true     |