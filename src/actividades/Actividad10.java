package actividades;

public class Actividad10 {
    static void main(String[] args) {
        int [] num;
        int numImpar;

        //Crear array
        num = crearArray(20);

        //Almacenar números
        almacenarNum(num);

        //Ordenar números
        ordenarNum(num);

        //Mostrar array ordenado
        mostrarArray(num);
    }
    private static void mostrarArray(int[] num) {
        imprimirPantalla("Array ordenado\n");
        imprimirPantalla("--------------\n");
        for (int v:num)
            imprimirPantalla(v + " ");
    }

    private static void ordenarNum(int[] num) {
        int numImpar;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                numImpar = num[i];
                int j = i + 1;
                while (j < num.length && (num[j] % 2 != 0)){
                    j++;
                }
                if (j < num.length){
                    num[i] = num[j];
                    num[j] = numImpar;
                }
            }
        }
    }

    private static void almacenarNum(int[] num) {
        for (int i = 0; i < num.length ; i++) {
            num[i] = getNumAleatorio(0, 20);
        }
    }

    private static int[] crearArray(int longitud) {
        return new int[longitud];
    }

    private static void imprimirPantalla(String s) {
        System.out.print(s);
    }

    private static int getNumAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

