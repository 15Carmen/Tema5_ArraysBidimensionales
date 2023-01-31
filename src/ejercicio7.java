import java.util.Arrays;

public class ejercicio7 {
    /*
     * Transponer la matriz A de orden NxN y guardar el resultado en la matriz B. Repetir el ejercicio dejando el
     * resultado en la matriz A (no se puede usar una matriz auxiliar).
     *
     *  1 2 3 4  => 1 5 1 5
     *  5 6 7 8     2 6 2 6
     *  1 2 3 4     3 7 3 7
     *  5 6 7 8     4 8 4 8
     */
    public static void main(String[] args) {
        // Tabla inicializada con los valores del ejercicio
        int tabla[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }

        // Variable auxiliar intermedia
        int aux;

        for(int i=0; i<tabla.length; i++) {
            for(int j=i; j<tabla[i].length; j++) {
                // intercambiamos las posiciones
                aux = tabla[i][j];
                tabla[i][j] = tabla[j][i];
                tabla[j][i] = aux;
            }
        }

        System.out.println();

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
}
