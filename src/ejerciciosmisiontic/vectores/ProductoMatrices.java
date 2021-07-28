package ejerciciosmisiontic.vectores;

public class ProductoMatrices {
    public static void main(String[] args){
        int matriz[][] = {{1, 2}, {3, 4}, {5, 6}};
        int matriz2[][] = {{1, 2, 3}, {4, 5, 6}};
        int matriz3[][];

        //Permite imprimir la primera matriz

        for (int f = 0; f<3; f++){
            for (int c=0; c<2; c++){
                System.out.print(matriz[f][c]+ " ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------");

        //Permite imprimir la segunda matriz

        for (int f = 0; f<2; f++){
            for (int c=0; c<3; c++){
                System.out.print(matriz2[f][c] + "  ");
            }
            System.out.println("");
        }

        matriz3 = new int[3][3];

        //Permite agregar elementos a la matriz producto realizando las respectivas multiplicaciones

        for (int f = 0; f<3; f++){
            for (int c=0; c<3; c++){
                for (int k = 0; k<2; k++){
                    matriz3[f][c] += matriz[f][k] * matriz2[k][c];
                }
            }
        }

        //Permite imprimir la matriz producto

        for (int f = 0; f<3; f++){
            for (int c=0; c<3; c++){
                System.out.print(matriz3[f][c] + "  ");
            }
            System.out.println("");
        }


    }
}
