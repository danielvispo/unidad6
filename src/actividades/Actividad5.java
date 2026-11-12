package actividades;

import java.util.Scanner;

public class Actividad5 {
    static void main(String[] args) {
        int [] num;
        int min, max;

        //Crear array
        num = crearArray(10);

        //Almacenar números
        almacenarNum(num);

        //Obtener mínimo
        min = getMin(num);

        //Obtener máximo
        max = getMax(num);

        //Mostrar valores
        mostrarValores(min, max, num);
    }

    private static void mostrarValores(int min, int max, int[] num) {
        imprimirPantalla("\nNUMEROS\n");
        imprimirPantalla("-------\n");
        for (int valor:num) {
            if (valor == min && valor == max)
                imprimirPantalla(valor + " Mínimo Máximo" + "\n");
            else if (valor == min)
                imprimirPantalla(valor + " Mínimo" + "\n");
            else if (valor == max)
                imprimirPantalla(valor + " Máximo" + "\n");
            else
                imprimirPantalla(valor + "\n");
        }
    }


    private static int getMax(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
        }
        return max;
    }

    private static int getMin(int[] num) {
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min)
                min = num[i];
        }
        return min;
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
