package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class CerosFinalVector {
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

        double lista2[] = new double[cantidad];

        int suma = 0;

        int h = 0;

        //Permite agregar a lista2 solo aquellos elementos de lista diferentes de cero

        while (h < cantidad){
            if (lista[h] != 0){
                lista2[suma] = lista[h];
                suma = suma + 1;
            }
            h = h+1;

        }

        for (double i: lista2){
            System.out.println(i);
        }

    }
}
