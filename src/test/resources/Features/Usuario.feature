#language: es

Característica: Operaciones con el usuario

  @GetUser
  Escenario: Consulta exitosa del usuario
    Cuando el usuario consume en endpoint
    Entonces el usuario podra ver el status code 200
