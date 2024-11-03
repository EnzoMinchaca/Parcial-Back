# Parcial MercadoLibre Magneto

## Requisitos Previos
- **Java 17+**
- **Gradle 8+**
- **Postman o algun cliente HTTP para probar los endpoints.**
- **Base de Datos H2.**

## Instalación

 1. Descargar o clonar el repositorio
 2. Verificar que se tienen todas las dependencias, se puede usar lo siguiente:
    ```
    ./gradlew build
    ```

## Ejecución 

De manera local se debe de levantar la base de datos h2, luego ejecutar el proyecto.
La misma se ejecutara en el puerto 8080.

Se puede ver la consola de h2 en este enlace:
    ```
    http://localhost:8080/h2-console/
    ```

El proyecto ha sido deployado a Render y puede ser accedido mediante el siguiente link:

https://parcial-back.onrender.com/

### Endpoints

- **POST** /persona/mutant - Recibe un JSON con la matriz de ADN a verificar, indicando si es un mutante o no. Ejemplo:

```
http://localhost:8080/persona/mutant

{
    "dna": [
        "ATGCGA",
        "CAGTGC",
        "TTATGT",
        "AGAAGG",
        "CCCCTA",
        "TCACTG"
    ]
}
```
- **GET** /persona/stats - Devuelve un JSON con la cantidad de mutantes y humanos agregados. Ejemplo:

```
http://localhost:8080/persona/stats
{
    "count_mutant_dna": 40,
    "count_human_dna": 100,
    "ratio": 0.4
}
```


## Pruebas Unitarias

Se incluyen casos de pruebas contemplando todos los patrones posibles (en filas, columnas y diagonales). Se puede probar con lo siguiente:
```
./gradlew test
```

