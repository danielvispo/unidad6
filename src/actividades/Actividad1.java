package actividades;

public class Actividad1 {
    static void main(String[] args) {
        int num[];
        String valoresArray;

        //Crear array
        num = crearArrayInt(12);

        //Asignar valores
        asignarValor(num, 39, 0);
        asignarValor(num, -2, 1);
        asignarValor(num, 0, 4);
        asignarValor(num, 14, 6);
        asignarValor(num, 5, 8);
        asignarValor(num, 120, 9);

        //Mostrar array
        valoresArray = arrayToString(num);//Convertir array en string
        imprimirPantalla(valoresArray);
    }

    private static String arrayToString(int[] num) {
        String resultado = "";
        for (int v:num)
            resultado += v + " ";
        return resultado;
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static void asignarValor(int[] num, int valor, int i) {
        if (i < num.length)
            num[i] = valor;
    }

    private static int[] crearArrayInt(int l) {
        return new int[l];
    }
}
