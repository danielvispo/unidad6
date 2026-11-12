package actividades;

import java.util.Scanner;

public class Actividad13 {
    static void main(String[] args) {
        int [] num;
        int opcion, valorDestacado;

        //Crear array
        num = crearArray(100);

        //Rellenar array
        rellenarArray(num);

        //Mostrar array
        mostrarArray(num);

        //Preguntar
        opcion = preguntarOpcion();

        //Comprobar opción
        if (opcion == 1)
            valorDestacado = getMin(num);
        else
            valorDestacado = getMax(num);

        //Resaltar opción
        resaltarOpcion(num, valorDestacado);
    }

    private static void resaltarOpcion(int[] num, int valorDestacado) {
        int cont = 0;
        String resultado = "";
        for (int i = 0; i < num.length; i++) {
            if (cont == 23){
                if (num[i] == valorDestacado)
                    resultado += "**" + num[i] + "**" + "\n";
                else
                    resultado += num[i] + "\n";
                cont = 0;
            } else{
                if (num[i] == valorDestacado)
                    resultado += "**" + num[i] + "**" + "  ";
                else
                    resultado += num[i] + "  ";
                cont++;
            }
        }
        imprimirPantalla(resultado);
    }

    private static int getMax(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
        }
        return max;
    }

    private static int getMin(int[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min)
                min = num[i];
        }
        return min;
    }

    private static int preguntarOpcion() {
        int opcion;
        do {
            imprimirPantalla("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
            opcion = getNum();
        } while (opcion != 1 && opcion != 2);
        return opcion;
    }

    private static int getNum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void mostrarArray(int[] num) {
        int cont = 0;
        String resultado = "";
        for (int i = 0; i < num.length; i++) {
            if (cont == 23){
                resultado += num[i] + "\n";
                cont = 0;
            } else{
                resultado += num[i] + "  ";
                cont++;
            }
        }
        imprimirPantalla(resultado + "\n");
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static void rellenarArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = getNumAleatorio(0, 500);
        }
    }

    private static int getNumAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private static int[] crearArray(int longitud) {
        return new int[longitud];
    }
}
