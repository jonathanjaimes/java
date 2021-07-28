package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class ProductoEscalarVector {
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

        System.out.println("Ingrese la constante:");
        double constante = sc.nextDouble();

        double lista2[] = new double[cantidad];

        //Permite multiplicar la constante por cada uno de los elementos de la lista y agregarlos a la lista2

        for (int i = 0; i < cantidad; i++){
            lista2[i] = lista[i]*constante;
        }

        for (double h: lista2){
            System.out.println(h);
        }


    }
}
