package com.example.parcial;

import java.util.HashSet;
import java.util.List;

public class Funcion {

    // Convierte una lista de cadenas en una matriz de caracteres
    public static char[][] convertToMatrix(List<String> dna) {
        int rows = dna.size();
        char[][] matrix = new char[rows][rows];

        for (int i = 0; i < rows; i++) {
            matrix[i] = dna.get(i).toCharArray();
        }
        return matrix;
    }

    // Verifica si los cuatro caracteres son iguales
    public static boolean areEqual(char a, char b, char c, char d) {
        return a == b && b == c && c == d;
    }

    // Guarda los caracteres distintos encontrados
    private static final HashSet<Character> distintosEncontrados = new HashSet<>();

    // Analiza y añade los caracteres si forman un patrón válido
    public static void analizePatron(char first, char second, char third, char forth) {
        if (areEqual(first, second, third, forth)) {
            distintosEncontrados.add(first);
        }
    }

    public static boolean isMutant(List<String> dna) {
        // Validaciones de errores
        if (dna.isEmpty()) throw new RuntimeException("Error: Lista vacía");
        if (dna.get(0).length() != dna.size()) throw new RuntimeException("Error: La matriz debe ser cuadrada");

        char[][] matrix = convertToMatrix(dna);
        int N = matrix.length;

        // Itera la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j <= N - 4) { // Horizontal
                    analizePatron(matrix[i][j], matrix[i][j + 1], matrix[i][j + 2], matrix[i][j + 3]);
                }
                if (i <= N - 4) { // Vertical
                    analizePatron(matrix[i][j], matrix[i + 1][j], matrix[i + 2][j], matrix[i + 3][j]);
                }
                if (i <= N - 4 && j <= N - 4) { // Diagonal de izquierda a derecha
                    analizePatron(matrix[i][j], matrix[i + 1][j + 1], matrix[i + 2][j + 2], matrix[i + 3][j + 3]);
                }
                if (i <= N - 4 && j >= 3) { // Diagonal de derecha a izquierda
                    analizePatron(matrix[i][j], matrix[i + 1][j - 1], matrix[i + 2][j - 2], matrix[i + 3][j - 3]);
                }

                if (distintosEncontrados.size() > 1) {
                    System.out.println("Elementos distintos encontrados: " + distintosEncontrados.size());
                    distintosEncontrados.forEach(System.out::println);
                    distintosEncontrados.clear();
                    return true;
                }
            }
        }

        System.out.println("False");
        distintosEncontrados.clear();
        return false;
    }
}