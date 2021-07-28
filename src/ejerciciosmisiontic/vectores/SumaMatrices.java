package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class SumaMatrices {
    public static void main(String[] args){
        int matriz[][];
        int matriz2[][];
        int matriz3[][];
        int numFil;
        int numCol;

        Scanner sc = new Scanner(System.in);

        //Permite ingresar el tamaño de las matrices

        System.out.println("Ingrese el número de filas:");
        numFil = sc.nextInt();
        System.out.println("Ingrese el número de columnas:");
        numCol = sc.nextInt();

        matriz = new int[numFil][numCol];

        //Permite ingresar los datos a la primera matriz

        for (int f=0; f < numFil; f++){
            for (int c=0; c < numCol; c++){
                System.out.println("Ingrese el dato para la casilla ("+f + "," + c + ")");
                matriz[f][c] = sc.nextInt();
            }
        }

        matriz2 = new int[numFil][numCol];

        //Permite ingresar los datos a la segunda matriz

        for (int f=0; f < numFil; f++){
            for (int c=0; c < numCol; c++){
                System.out.println("Ingrese el dato para la casilla ("+f + "," + c + ")");
                matriz2[f][c] = sc.nextInt();
            }
        }

        //Permite imprimir la primera matriz

        for (int f=0; f < numFil; f++){
            for (int c=0; c < numCol; c++){
                System.out.print(matriz[f][c]);
            }
            System.out.println("");
        }

        System.out.println("--------------------");

        //Permite imprimir la segunda matriz

        for (int f=0; f < numFil; f++){
            for (int c=0; c < numCol; c++){
                System.out.print(matriz2[f][c]);
            }
            System.out.println("");
        }

        matriz3 = new int[numFil][numCol];

        //Permite ingresar los datos a la tercera matriz (matriz suma)

        for (int f=0; f < numFil; f++){
            for (int c=0; c < numCol; c++){
                matriz3[f][c] = matriz[f][c]+matriz2[f][c];
            }
        }

        System.out.println("MATRIZ SUMA -------------");

        //Permite imprimir la matriz suma

        for (int f=0; f < numFil; f++){
            for (int c=0; c < numCol; c++){
                System.out.print(matriz3[f][c]);
            }
            System.out.println("");
        }




    }
}
