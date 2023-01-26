import java.util.Arrays;

public class ejercicio5 {
    /*
     * Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999. Estos números se deben introducir
     * en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si
     * de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
     */

    public static void main(String[] args) {
        //Declaramos las variables
        int[][] tabla = new int[4][5];
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int auxiliarSuma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = (int)((Math.random()*(999-100))+100);
                auxiliarSuma+=tabla[i][j];
            }
            sumaFilas+=auxiliarSuma;

            //Imprimimos la fila del array
            System.out.print(Arrays.toString(tabla[i]));
            //Y seguidamente imprimimos el total de la suma de los elementos de la fila
            System.out.println(auxiliarSuma);
        }

        //Con un bucle for hacemos la suma de las columnas
        for (int i = 0; i < 5; i++) {
            auxiliarSuma=0;                         //Reiniciamos la variable auxiliarSuma a 0
            for (int j = 0; j < 4; j++) {
                auxiliarSuma += tabla[j][i];        //Le vamos sumando los numeros que vamos leyendo a la variable auxiliar
            }
            sumaColumnas += auxiliarSuma;           //Le sumamos a la variable sumaColumnas el total de la suma auxiliar
            System.out.print(auxiliarSuma + " ");   //La imprimimos por pantalla y separamos los numeros con un espacio
        }
        //Imprimimos en la esquina inferior derecha la suma total de las filas y las columnas
        System.out.print(sumaColumnas + sumaFilas);


    }
}
