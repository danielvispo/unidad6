/*package actividades;

import java.util.Scanner;

public class Actividad3 {
    static void main(String[] args) {
        int [] num;
        String resultado;

        //Crear array
        num = crearArray(10);

        //Pedir números
        pedirNumeros(num);

        //Invertir array
        invertirArray(num);

        //Mostrar array
        resultado = arrayToString(num);//Convertir array a String
        imprimirPantalla("\nArray invertido\n");
        imprimirPantalla("---------------\n");
        imprimirPantalla(resultado);
    }

    private static String arrayToString(int[] num) {
        String resultado = "";
        for (int v:num)
            resultado += v + " ";
        return resultado;
    }

    private static void invertirArray(int[] num) {
        int aux;
        int izquierda = 0;
        int derecha = num.length - 1;

        while (izquierda < derecha) {
            aux = num[izquierda];
            num[izquierda] = num[derecha];
            num[derecha] = aux;
            izquierda++;
            derecha--;
        }
    }

    private static void pedirNumeros(int[] num) {
        for (int i = 0; i < num.length; i++){
            imprimirPantalla("Número " + (i + 1) + ": ");
            num[i] = getNum();
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
}*/

package actividades;

import java.util.Scanner;

public class Actividad3 {
    static void main(String[] args) {
        int [] num;
        String resultado;

        //Crear array
        num = crearArray(10);

        //Pedir números
        pedirNumeros(num);

        //Mostrar array invertido
        resultado = arrayToStringInvertido(num);//Convertir array a String
        imprimirPantalla("\nArray invertido\n");
        imprimirPantalla("---------------\n");
        imprimirPantalla(resultado);
    }

    private static String arrayToStringInvertido(int[] num) {
        String resultado = "";
        for (int i = num.length - 1; i >= 0; i--) {
            resultado += num[i] + " ";
        }
        return resultado;
    }

    private static void pedirNumeros(int[] num) {
        for (int i = 0; i < num.length; i++){
            imprimirPantalla("Número " + (i + 1) + ": ");
            num[i] = getNum();
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

