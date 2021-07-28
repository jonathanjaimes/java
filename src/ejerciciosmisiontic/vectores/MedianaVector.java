package ejerciciosmisiontic.vectores;

import java.util.Scanner;
import java.util.Arrays;

public class MedianaVector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Permite ingresar la cantidad de posiciones del arreglo

        System.out.println("Escriba la cantidad de números a ingresar del arreglo:");
        int cantidad = sc.nextInt();

        double lista[] = new double[cantidad];

        //Permite ingresar un número a cada posición del arreglo

        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese un número:");
            double entrada = sc.nextDouble();
            lista[i] = entrada;
        }

        //Permite ordenar el array de menor a mayor

        Arrays.sort(lista);

        double cociente;
        int med = 0;
        double mediana = 0;

/*
        for (double i: lista){
            System.out.println(i);
        }
*/
        //Permite hallar la mediana dependiendo si el número de datos del array es par o impar

        if (cantidad%2 == 0){
            cociente = cantidad/2;
            med = (int)cociente;
            mediana = (lista[med] + lista[med-1])/2;
        }else {
            cociente = cantidad/2;
            med = (int)cociente;
            mediana = lista[med];
        }

        System.out.println("La mediana del arreglo es: " + mediana);

    }
}
