package actividades;

import java.util.Scanner;

public class Actividad14 {
    static void main(String[] args) {
        String [] palabra;
        String [] palabraOrdenado;


        //Crear array
        palabra = crearArray(8);
        palabraOrdenado = crearArray(8);

        //Pedir palabras
        pedirPalabras(palabra);

        //Mostrar array original
        mostrarArray(palabra);

        //Ordenar array
        ordenarArray(palabra, palabraOrdenado);

        //Mostrar array ordenado
        mostrarArray(palabraOrdenado);
    }

    private static void ordenarArray(String[] palabra, String[] palabraOrdenado) {
        int totalColores = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (esColor(palabra[i])){
                palabraOrdenado[totalColores] = palabra[i];
                totalColores++;
            }
        }
        for (int i = 0; i < palabra.length; i++) {
            if (!esColor(palabra[i])) {
                palabraOrdenado[totalColores] = palabra[i];
                totalColores++;
            }
        }
    }

    private static boolean esColor(String palabra) {
        String [] color = {"verde", "rojo", "azul", "naranja", "rosa", "negro", "blanco", "morado"};
        boolean esColor = false;
        for (int i = 0; i < color.length; i++) {
            if(color[i].equals(palabra))
                esColor = true;
        }
        return esColor;
    }

    private static void mostrarArray(String[] palabra) {
        imprimirPantalla("\n-----------------------------------------\n");
        for (String elemento:palabra)
            imprimirPantalla(elemento + " ");
    }

    private static void pedirPalabras(String[] palabra) {
        for (int i = 0; i < palabra.length; i++) {
            imprimirPantalla("Palabra " + (i + 1) + ": ");
            palabra[i] = getCad();
        }
    }

    //Escaner común
    static Scanner sc = new Scanner(System.in);

    private static String getCad() {
        return sc.next();
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static String[] crearArray(int longitud) {
        return new String[longitud];
    }
}

