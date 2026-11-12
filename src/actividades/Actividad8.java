package actividades;

import java.util.Scanner;

public class Actividad8 {
    static void main(String[] args) {
        int [] temperatura;
        String[] mes = {
                "Enero",
                "Febrero",
                "Marzo",
                "Abril",
                "Mayo",
                "Junio",
                "Julio",
                "Agosto",
                "Septiembre",
                "Octubre",
                "Noviembre",
                "Diciembre"
        };

        //Crear array
        temperatura = crearArray(12);

        //Almacenar temperaturas
        almacenarTemperatura(temperatura, mes);

        //Mostrar diagrama
        mostrarDiagrama(temperatura, mes);
    }

    private static void mostrarDiagrama(int[] temperatura, String [] mes) {
        String barra;
        imprimirPantalla("\nDIAGRAMA\n");
        imprimirPantalla("--------\n");
        for (int i = 0; i < temperatura.length ; i++) {
            if (mes[i].length() > 8)
                imprimirPantalla(mes[i] + "\t");
            else
                imprimirPantalla(mes[i] + "\t\t");
            barra = dibujarBarra(temperatura[i]);
            imprimirPantalla(barra + "\n");
        }
    }

    private static String dibujarBarra(int longitudBarra) {
        String barra = "";
        for (int j = longitudBarra; j > 0; j--) {
            barra += "*";
        }
        return barra;
    }

    private static void almacenarTemperatura(int[] temperatura, String [] mes) {
        for (int i = 0; i < temperatura.length; i++) {
            imprimirPantalla(mes[i] + ": ");
            temperatura[i] = getNum();
        }
    }

    private static int[] crearArray(int longitud) {
        return new int[longitud];
    }

    /*private static String getMes(int i) {
        String mes;
        switch (i + 1) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            default:
                mes = "Diciembre";
        }
        return mes;
    }*/

    private static int getNum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }
}
