import java.util.Arrays;

public class ejemploClase {
    public static void main(String[] args) {
        int tabla [][] = new int[4][6];

        System.out.println("Array bidimensional sin corchetes ni comas: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(tabla[i][j] + " ");  //OJO No usar un println, así no sale bien la matriz
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Array bidimensional feo: ");
        System.out.println(Arrays.deepToString(tabla));
        //El deepToString() no imprime la matriz perse, imprime horizontalmente todas las filas de la matriz
        // EJ: [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]

        //Si queremos que salga bien puesto tenemos que meterlo en un bucle for
        System.out.println();
        System.out.println("Array bidimensional bien puesto: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }

        //para conocer el numero de filas de la matriz
        System.out.println();
        System.out.println("Filas: " + tabla.length);
        System.out.println("Columnas: " + tabla[1].length);
    }
}
