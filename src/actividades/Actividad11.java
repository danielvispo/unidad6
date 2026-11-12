package actividades;

import java.util.Scanner;

public class Actividad11 {
    static void main(String[] args) {
        int [] num;
        int [] numFinal;

        //Crear array inicial
        num = crearArray(10);

        //Almacenar números
        almacenarNum(num);

        //Mostrar array inicial
        mostrarTabla(num);


        //Crear array final
        numFinal = crearArray(10);

        //Ordenar array
        ordenarArray(num, numFinal);

        //Mostrar array final
        mostrarTabla(numFinal);
    }

    private static void mostrarTabla(int[] num) {
        imprimirPantalla("\nTabla\n");
        imprimirPantalla("-----\n");
        imprimirPantalla(getTabla(num));
    }

    private static void ordenarArray(int[] num, int[] numFinal) {
        int totalPrimos = 0;
        for (int i = 0; i < num.length; i++) {
            if (esPrimo(num[i])){
                numFinal[totalPrimos++] = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (!esPrimo(num[i])){
                numFinal[totalPrimos++] = num[i];
            }
        }

    }

    private static boolean esPrimo(int num) {
        int div = 2;
        Boolean esPrimo = false;
        while ((num % div != 0) && (div <= num / 2)){
            div++;
        }
        if (div == num/2 + 1)
            esPrimo = true;
        return esPrimo;
    }

    private static String getTabla(int[] num) {
        String indice = "Índice\t";
        String valor = "Valor\t";
        for (int i = 0; i < num.length; i++) {
            indice += i + "\t";
            valor += num[i] + "\t";
        }
        return indice + "\n" + valor;
    }

    private static void almacenarNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            imprimirPantalla("Número " + (i + 1) + ": ");
            num[i] = getNum();
        }
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static int getNum() {
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }

    private static int[] crearArray(int longitud) {
        return new int[longitud];
    }
}
