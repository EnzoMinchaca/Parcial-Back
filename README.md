# Parcial MercadoLibre Magneto

## Requisitos Previos
- **Java 17+**
- **Gradle 8+**
- **Postman o algun cliente HTTP para probar los endpoints.**
- **Base de Datos H2.**

## Instalación



## Ejecución

El proyecto ha sido deployado a Render y puede ser accedido mediante el siguiente link:

https://parcial-magneto.onrender.com

### Endpoints

- **POST** /mutant - Recibe un JSON con la matriz de ADN a verificar. Ejemplo:

```json
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
- **GET** /stats - Devuelve un JSON con la cantidad de mutantes y humanos verificados. Ejemplo:

```json
{
    "count_mutant_dna": 40,
    "count_human_dna": 100,
    "ratio": 0.4
}
```

## Ejemplos de ADN

Ejemplo de matriz **MUTANTE**:

```json
{
    "dna": [
      "ATGCGA",
      "CAGTGC",
      "TTATGT",
      "AGAAAG",
      "CCCCTA",
      "TCACTG"
    ]
}
```

Ejemplo de matriz **NO MUTANTE**:

```json
{
    "dna": [
      "ATGGTG",
      "GTCTTA",
      "AATTGG",
      "ACTAGT",
      "GGATTC", 
      "AGGCAA"
    ]
}
```

## Pruebas Unitarias

Se incluyen casos de pruebas contemplando todos los patrones posibles (en filas, columnas y diagonales).
