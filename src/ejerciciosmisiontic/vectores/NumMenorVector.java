package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class NumMenorVector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Permite ingresar la cantidad de posiciones del arreglo

        System.out.println("Escriba la cantidad de números a ingresar del primer arreglo:");
        int cantidad = sc.nextInt();

        double lista[] = new double[cantidad];

        //Permite ingresar un número a cada posición del arreglo

        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese un número:");
            double entrada = sc.nextDouble();
            lista[i] = entrada;
        }

        double numMenor = 9999;

        for (int i = 0; i < cantidad; i++){
            if (lista[i] < numMenor){
                numMenor = lista[i];
            }
        }

        System.out.println("El número menor del arreglo es: " + numMenor);
    }
}
