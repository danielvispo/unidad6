package actividades;

import java.util.Scanner;

public class Actividad6 {
    static void main(String[] args) {
        int [] num;
        int ultimoNum;

        //Crear array
        num = crearArray(15);

        //almacenarNum(num);
        almacenarNum(num);

        //Rotar elementos
        rotarElementos(num);

        //Mostrar array
        mostrarArray(num);
    }

    private static void mostrarArray(int[] num) {
        imprimirPantalla("\nArray rotado\n");
        imprimirPantalla("-----\n");
        for (int valor:num) {
            imprimirPantalla(valor + " ");
        }
    }

    private static void rotarElementos(int[] num) {
        int ultimoNum = num[num.length - 1];
        for (int i = (num.length - 1); i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = ultimoNum;
    }

    private static void almacenarNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            imprimirPantalla("Número " + (i + 1) + ": ");
            num[i]= getNum();
        }
    }

    private static int[] crearArray(int longitud) {
        return new int[longitud];
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static int getNum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
