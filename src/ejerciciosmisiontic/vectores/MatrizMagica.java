package ejerciciosmisiontic.vectores;

import java.util.ArrayList;

public class MatrizMagica {
    public static void main(String[] args){
        int matriz[][] = {{8, 1, 8}, {3, 5, 7}, {4, 9, 2}};

        ArrayList<Double> lista = new ArrayList<Double>();

        //Permite imprimir la matriz

        for (int f= 0; f < 3; f++){
            for (int c = 0; c < 3; c++){
                System.out.print(matriz[f][c] + "  ");
            }
            System.out.println("");
        }

        double comparar = 0;

        //Permite hallar la sumatoria de cada fila y guardarla en un array list

        for (int f= 0; f < 3; f++){
            double suma = 0;
            for (int c = 0; c < 3; c++){
                suma = suma + matriz[f][c];
            }
            lista.add(suma);
            comparar = suma;
        }

        //Permite hallar la sumatoria de cada columna y guardarla en un array list

        for (int c= 0; c < 3; c++){
            double suma = 0;
            for (int f = 0; f < 3; f++){
                suma = suma + matriz[f][c];
            }
            lista.add(suma);

        }

        double suma = 0;
        int num = 2;

        //Permite hallar la sumatoria de la diagonal secundaria

        for (int f= 0; f < 3; f++){
            suma = suma + matriz[f][num];
            num = num - 1;

        }
        lista.add(suma);


        //Permite hallar la sumatoria de la diagonal principal

        suma = 0;
        for (int f= 0; f < 3; f++){
            suma = suma + matriz[f][f];

        }
        lista.add(suma);


        boolean bandera = true;

        //Permite cambiar a false la bandera en caso de que algún elemento del arraylist sea diferente a los demás

        for (double i: lista){
            if (i != comparar){
                bandera = false;
            }
        }

        if (bandera == true){
            System.out.println("La matriz es mágica");
        }else {
            System.out.println("La matriz no es mágica");
        }

    }
}
