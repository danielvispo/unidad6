package actividades;

import java.util.Scanner;

public class Actividad9 {
    static void main(String[] args) {
        int [] num;

        //Crear array
        num = crearArray(8);

        //Almacenar números
        almacenarNum(num);

        //Mostrar números
        mostrarNumeros(num);
    }

    private static void mostrarNumeros(int[] num) {
        imprimirPantalla("\nNúmeros\n");
        imprimirPantalla("-------\n");
        for (int v:num){
            if (v % 2 == 0)
                imprimirPantalla(v + " par\n");
            else
                imprimirPantalla(v + " impar\n");
        }
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
