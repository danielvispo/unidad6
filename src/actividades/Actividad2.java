package actividades;

public class Actividad2 {
    static void main(String[] args) {
        char caracter[];
        String valoresArray;

        //Crear array
        caracter = crearArrayChar(10);

        //Asignar valores
        asignarValor(caracter, 'a', 0);
        asignarValor(caracter, 'x', 20);
        asignarValor(caracter, '@', 4);
        asignarValor(caracter, ' ', 6);
        asignarValor(caracter, '+', 7);
        asignarValor(caracter, 'Q', 8);

        //Mostrar array
        valoresArray = arrayToString(caracter);//Convertir array en string
        imprimirPantalla(valoresArray);
    }

    private static String arrayToString(char[] caracter) {
        String resultado = "";
        for (char v:caracter)
            resultado += v + " ";
        return resultado;
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static boolean asignarValor(char[] caracter, char valor, int i) {
        boolean resultado;
        if (i < caracter.length){
            caracter[i] = valor;
            resultado = true;
        } else
            resultado = false;
        return resultado;

    }

    private static char[] crearArrayChar(int l) {
        return new char[l];
    }
}
