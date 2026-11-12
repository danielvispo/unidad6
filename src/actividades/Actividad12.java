package actividades;

import java.util.Scanner;

public class Actividad12 {
    static void main(String[] args) {
        int [] num;
        int valor, posicion1, posicion2;

        //Crear array
        num = crearArray(10);

        //Alamacenar números
        almacenarNum(num);

        //Mostrar array inicial
        mostrarTabla(num);

        //Pedir posiciones
        do {
            posicion1 = getPosicion("inicial");
            posicion2 = getPosicion("final");
        } while (posicion1 >= posicion2);

        //Cambiar orden
        cambiarOrden(num, posicion1, posicion2);

        //Mostrar array final
        mostrarTabla(num);
    }

    private static void cambiarOrden(int[] num, int p1, int p2) {
        int ultimoValor = num[num.length - 1];
        for (int i = num.length - 1; i >= 1; i--) {
            if (i == p2)
                num[i] = num[p1];
            else if (!(i > p1 && i < p2))
                num[i] = num[i - 1];
        }
        num[0] = ultimoValor;
    }

    private static void mostrarTabla(int[] num) {
        imprimirPantalla("\nTabla\n");
        imprimirPantalla("-----\n");
        imprimirPantalla(getTabla(num) + "\n");
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

    private static int getPosicion(String cadPosicion) {
        int posicion;
        do {
            imprimirPantalla(cadPosicion + ": ");
            posicion = getNum();
        } while (posicion < 0 || posicion > 9 );
        return posicion;
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static void asignarValor(int[] num, int valor, int i) {
        if (i < num.length)
            num[i] = valor;
    }

    private static int getNum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static int[] crearArray(int l) {
        return new int[l];
    }
}
