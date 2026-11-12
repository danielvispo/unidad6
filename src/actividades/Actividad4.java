package actividades;

public class Actividad4 {
    static void main(String[] args) {
        int [] numero;
        int [] cuadrado;
        int [] cubo;

        //Crear arrays;
        numero = crearArray(20);
        cuadrado = crearArray(20);
        cubo = crearArray(20);

        //Cargar array número
        cargarArrayNumero(numero);

        //Cargar array cuadrado
        cargarArrayElevado(cuadrado, numero, 2);

        //Cargar array cubo
        cargarArrayElevado(cubo, numero, 3);

        //Mostrar arrays
        mostrarArrays(numero, cuadrado, cubo);
    }

    private static void mostrarArrays(int[] numero, int[] cuadrado, int[] cubo) {
        imprimirPantalla("NUMERO\tCUADRADO\tCUBO\n");
        for (int i = 0; i < numero.length; i++) {
            if (cuadrado[i] < 1000)
                imprimirPantalla(numero[i] + "\t\t" + cuadrado[i] + "\t\t\t" + cubo[i] + "\n");
            else
                imprimirPantalla(numero[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i] + "\n");
        }
    }

    private static void cargarArrayElevado(int[] array, int[] numero,  int exponente) {
        for (int i = 0; i < array.length; i++) {
            array[i] = elevar(numero[i], exponente);
        }
    }

    private static void cargarArrayNumero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumAleatorio(0, 100);
        }
    }

    private static int[] crearArray(int longitud) {
        return new int[longitud];
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static int elevar(int num, int expontente) {
        int resultado = 1;
        for (int i = 1; i <= expontente; i++) {
            resultado *= num;
        }
        return resultado;
    }

    private static int getNumAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
