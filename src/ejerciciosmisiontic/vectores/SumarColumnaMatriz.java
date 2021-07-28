package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class SumarColumnaMatriz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //Permite imprimir la matriz

        for (int f= 0; f < 3; f++){
            for (int c = 0; c < 3; c++){
                System.out.print(matriz[f][c] + "  ");
            }
            System.out.println("");
        }


        System.out.println("Elija la columna que desea sumar:");
        int col = sc.nextInt();

        double suma = 0;

        //Permite sumar los elementos de una columna dada

        for (int f = 0; f < 3; f++){
            suma = suma + matriz[f][col];

        }

        System.out.println("La sula de la fila " + col + " es: " + suma);

    }
}
