package ejerciciosmisiontic.vectores;

public class Prueba {
    public static void main(String[] args){
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int f = 0; f < 3; f++){
            for (int c = 0; c<3; c++){
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println("");
        }
    }
}
