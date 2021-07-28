package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class PromedioVector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Permite ingresar la cantidad de posiciones del arreglo

        System.out.println("Escriba la cantidad de números a ingresar:");
        int cantidad = sc.nextInt();

        double lista[] = new double[cantidad];

        //Permite ingresar un número a cada posición del arreglo

        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese un número:");
            double entrada = sc.nextDouble();
            lista[i] = entrada;
        }

        double suma= 0;

        //Permite hallar la sumatoria de los elementos del arreglo

        for (double i: lista){
            suma = suma + i;
        }

        //Permite hallar el promedio de los elementos del arreglo

        double promedio = suma / cantidad;

        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
    }
}
