package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class PosicionNumMenorVector {
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

        //Permite hallar el número menor

        for (int i = 0; i < cantidad; i++){
            if (lista[i] < numMenor){
                numMenor = lista[i];
            }
        }

        //Permite hallar la posición del número menor

        int pos = 0;
        for (int h = 0; h < cantidad; h++){
            if (lista[h] == numMenor){
                pos = h;
            }
        }

        System.out.println("La posición del número menor es: " + pos);

    }
}
