# language: es

    Característica: Consultar el servicio employe verificando los datos basicos del empleado

    @Servicios
        Esquema del escenario : ana desea consultar los datos basicos de un empleado por numero de identificacion
        Dado que ana tiene el <id> del empleado
        Cuando visualiza los datos basicos del mismo
        Entonces verifica los datos correspondientes al servicio

     Ejemplos:  | id   |
                | 2276 |
                |  1   |
                | 824  |
                |  2   |