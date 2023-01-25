import java.util.Arrays;

public class ejercicio1 {
    /*
     * Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma: el elemento de la posición
     * [n][m] debe contener el valor 10 * n + m. Después se debe mostrar su contenido.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[][] tabla = new int[5][5];

        //Con un bucle for anidado rellenamos el array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = 10 * i + j; //Declaramos que la posicion en la que se encuentra el indice actualmemte sea igual a 10 * i + j
            }
            System.out.println(Arrays.toString(tabla[i])); //Imprimimos el array
        }

    }
}
