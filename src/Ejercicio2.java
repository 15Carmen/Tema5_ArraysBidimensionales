import java.util.Arrays;

public class Ejercicio2 {
    /*
     * Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10
     * (cada tabla en una fila). Luego mostrarĂ¡ la matriz por pantalla.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int [][] tabla = new int[10][10];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[1].length; j++) {
                tabla[i][j] = i*j;                          //Rellenamos el array
            }
            System.out.println(Arrays.toString(tabla[i])); //Imprimimos el array
        }
    }
}
