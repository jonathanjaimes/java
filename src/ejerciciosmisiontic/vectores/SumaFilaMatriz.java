package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class SumaFilaMatriz {
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

        System.out.println("Elija la fila que desea sumar:");
        int fila = sc.nextInt();

        double suma = 0;

        //Permite sumar los elementos de una fila dada

        for (int c = 0; c < 3; c++){
            suma = suma + matriz[fila][c];

        }

        System.out.println("La sula de la fila " + fila + " es: " + suma);

    }
}
