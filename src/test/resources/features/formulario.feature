# language: es

Característica:  Formulario demoqa
  Como usuario,
  Yo deseo registrar datos en formulario

  @gui
  Escenario: Acceder a la página de Demoqa
    Dado Yo voy a la pagina de Demoqa
    Cuando Yo ingreso los datos del formulario
      |firstname|lastname |userEmail|userNumber|gender|
      |SONIA|PEREZ UGARTE  |elizarraga@gmail.com|1234567890|Female|
      |PEPE|SUAREZ UGARTE  |PEPESUAREZ@gmail.com|0123456789|Male  |
    Entonces Yo deberia visualizar la página para seleccionar cabina

