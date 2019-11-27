# language: es
    Característica: Consultar el servicio employe verificando los datos basicos del empleado

        @ServicioEmpleado
            Esquema del escenario: ana desea consultar los datos basicos de un empleado por numero de identificacion
                Dado que ana tiene el documento del empleado <id>
                Cuando visualiza los datos basicos del mismo <Nombre empleado> <Salario empleado> <Edad empleado>
                Entonces verifica los datos correspondientes al servicio

            Ejemplos:
                      |id  |Nombre empleado|Salario empleado|Edad empleado|
                      |1   |     Salome    |       457      |      35     |
                      |6876|     BINNNNYYY |       0        |      999999 |
                      |5001|     Prasant49 |       56716    |      49     |


