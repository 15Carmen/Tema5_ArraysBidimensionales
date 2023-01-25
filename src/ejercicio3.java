import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    /*
     * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5
     * asignaturas. El usuario introducirá las notas por teclado y luego el programa mostrará la tabla con las notas.
     * A continuación, mostrará la nota mínima, máxima y media de cada alumno.
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int tabla[][] = new int[4][5];      //Array bidimensional 4 alumnos x 5 asignaturas
        int minima;                         //Variable donde vamos a guardar la nota más baja del alumno
        int maxima;                         //Variable donde vamos a guardar la nota máxima del alumno
        double media;                       //Variable donde vamos a guardar el resultado de la nota media

        //Delcaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al Usuario que introduzca las notas de los alumnos
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Introduzca la nota " + (j + 1) + " para el Alumno " + (i + 1) + ": ");
                tabla[i][j] = sc.nextInt();
            }
        }

        //Hacemos un salto de linea estético
        System.out.println();

        //Imprimimos por pantalla las notas de los alumnos
        System.out.println("Las notas de los alumnos son:");
        for (int k = 0; k < tabla.length; k++) {
            System.out.println("Alumno " + (k + 1) + ":" + Arrays.toString(tabla[k]));
        }

        //Hacemos un salto de linea estético
        System.out.println();

        for (int l = 0; l < tabla.length; l++) { //Recorremos la tabla por filas

            //Inicializamos las variables previamente declaradas
            minima = 10;
            maxima = 0;
            media = 0;

            for (int m = 0; m < tabla[l].length; m++) {     //Recorremos las columnas de la fila en la que estemos
                if (tabla[l][m] <= minima) {    //Si la nota de esa posicion es menor o igual que la variable minima
                    minima = tabla[l][m];       //Declaramos que esa nota es la nueva variable minima
                }
                if (tabla[l][m] >= maxima) {    //Si la nota de esa posicion es mayor o igual que ka variable maxima
                    maxima = tabla[l][m];       //Declaramos que esa nota es la nueva variable maxima
                }
                media += tabla[l][m];           //Le sumamos la nota a la variable media
            }

            //Calculamos la media al dividir el resultado del sumatorio de las notas entre 5 (el numero de notas introducidas)
            media /= 5;

            //Imprimimos por consola los resultados
            System.out.println("La nota mas baja del Alumno " + (l + 1) + " es:" + minima);
            System.out.println("La mayor nota del Alumno " + (l + 1) + " es:" + maxima);
            System.out.println("La nota media del Alumno " + (l + 1) + " es: " + media);
            //Hacemos un salto de linea estético
            System.out.println();
        }

        //Cerramos el scanner
        sc.close();

    }
}

