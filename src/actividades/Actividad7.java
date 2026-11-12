package actividades;

import java.util.Scanner;

public class Actividad7 {
    static void main(String[] args) {
        int [] num;
        int valorACambiar, valor;
        String resultado;

        //Crear array
        num = crearArray(100);

        //Almacenar elementos
        almacenarNum(num);

        //Mostrar lista original
        mostrarArray(num);

        //Solicitar valores
        imprimirPantalla("\nValor a cambiar: ");
        valorACambiar = getNum();
        imprimirPantalla("Valor: ");
        valor = getNum();

        //Intercambiar valores
        resultado = intercambiarValores(num, valorACambiar, valor);

        //Mostrar array modificado
        mostrarArrayModificado(resultado);
    }

    private static void mostrarArrayModificado(String resultado) {
        imprimirPantalla("\nLista modificada\n");
        imprimirPantalla("----------------\n");
        imprimirPantalla(resultado);
    }

    private static String intercambiarValores(int[] num, int valorACambiar, int valor) {
        String resultado = "";
        for (int i = 0; i < num.length; i++) {
            if (num[i] == valorACambiar) {
                num[i] = valor;
                resultado += "\"" + valor + "\" ";
            }
            else
                resultado += num[i] + " ";
        }
        return resultado;
    }

    private static void mostrarArray(int[] num) {
        imprimirPantalla("Lista\n");
        imprimirPantalla("-----\n");
        for (int v:num)
            imprimirPantalla(v + " ");
    }

    private static void almacenarNum(int[] num) {
        for (int i = 0; i < num.length ; i++) {
            num[i] = getNumAleatorio(0, 20);
        }
    }

    private static int[] crearArray(int longitud) {
        return new int[longitud];
    }

    private static int getNum() {
        return sc.nextInt();
    }

    static Scanner sc = new Scanner(System.in);

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static int getNumAleatorio(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
