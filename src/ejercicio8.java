import java.util.Arrays;

public class ejercicio8 {
    /*
     * Escribir un programa que cree una matriz de dimensión 5 x 5 y la rellene con valores aleatorios entre 1 y 10.
     * A continuación, debe comprobar si es o no simétrica. Una matriz se dice que es simétrica si
     * A[i][j] = A[j][i] para todos los i, j dentro de los límites de la matriz.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int matriz [][] = new int[5][5];    //Matriz de 5x5

        //Rellenamos la tabla con numeros aleatorios
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = (int)((Math.random() * (10 - 1)) + 1);
            }
            System.out.println(Arrays.toString(matriz[i])); //Imprimimos la fila
        }

        if(esSimetrico(matriz)) {                               //Si la funcion esSimetrico es verdadera
            System.out.println("La matriz es simetrica");       //Imprimimos por consola que la matriz es simétrica
        }
        else{                                                   //Si no es el caso
            System.out.println("La matriz no es simetrica");    //Imprimimos por consola que la matriz no es simétrica
        }
    }

    /**
     * Método al que le pasamos por parámetros una
     * @param matriz bidimensional y nos
     * @return si dicha matriz es simétrica o no
     */
    public static Boolean esSimetrico(int[][] matriz) {
        //Declaramos las variables
        Boolean simetrico = true; //Variable booleana verdadera donde guardaremos si la matriz es simétrica o no

        for(int i=0; i<matriz.length; i++) {            //Recorremos la tabla
            for(int j=0; j<matriz[i].length; j++) {
            if(matriz[i][j] != matriz[j][i]) {          //Si un valor es diferente al de su 'espejo'
                    simetrico = false;                  //Indicamos qeu simetrico es false
                    break;                              //Nos salimos del bucle
                }
            }
        }
        //Devolvemos la varaible simetrico
        return simetrico;
    }
}
