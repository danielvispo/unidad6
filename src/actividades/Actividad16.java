package actividades;

import java.util.Scanner;

public class Actividad16 {
    static void main(String[] args) {
        int [] mesas;
        int cantidad;

        //Crear array mesa
        mesas = crearMesas(10);

        //Sentar comensales aleatoriament
        llenarMesa(mesas);

        do {
            //Mostrar mesas
            imprimirPantalla(getMesas(mesas));

            //Preguntar al cliente
            cantidad = preguntarCantidad();

            //Asignar mesa
            asignarMesa(mesas, cantidad);

            if (cantidad > 4)
                imprimirPantalla("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");

        } while (cantidad != -1 && cantidad <= 4);


    }

    private static void asignarMesa(int[] mesa, int cantidad) {
        int numMesa = 0;
        boolean mesaLibre = false;
        while ((numMesa < mesa.length - 1) && mesa[numMesa] != 0) {
            numMesa++;
            mesaLibre = true;
        }

        if ((numMesa < mesa.length) && mesa[numMesa] == 0) {
            mesa[numMesa] = cantidad;
        }

        if (mesaLibre){
            imprimirPantalla("algfo");
            numMesa = 0;
            while ((numMesa < mesa.length - 1) && (mesa[numMesa] + cantidad > 4))
                numMesa++;

            if ((numMesa < mesa.length) && (mesa[numMesa] + cantidad <= 4)) {
                mesa[numMesa] += cantidad;
            }
        }
    }

    private static String getMesas(int[] mesa) {
        String mesas = "---------------------------------------------------\n";
        mesas +="| Mesa nº\t";
        for (int i = 0; i < mesa.length; i++) {
            mesas += (i + 1 + "|\t");
        }
        mesas += "\n---------------------------------------------------\n";
        mesas +="| Ocupación\t";
        for (int i = 0; i < mesa.length; i++) {
            mesas += mesa[i] + "|\t";
        }
        mesas += "\n---------------------------------------------------\n";
        return mesas;
    }

    private static int preguntarCantidad() {
        imprimirPantalla("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
        return getNum();
    }

    private static int getNum() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static void llenarMesa(int [] mesa) {
        for (int i = 0; i < mesa.length; i++)
            mesa[i] = getNumAleatorio(0, 4);
    }

    private static int getNumAleatorio(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }

    private static int[] crearMesas(int longitud) {
        return new int[longitud];
    }
}
