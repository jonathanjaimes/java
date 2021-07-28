package ejerciciosmisiontic.vectores;

import java.util.Scanner;

public class ProductoDirectoVectores {
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

        //Permite ingresar la cantidad de posiciones del arreglo

        System.out.println("Escriba la cantidad de números a ingresar del segundo arreglo:");
        int cantidad2 = sc.nextInt();

        double lista2[] = new double[cantidad2];

        //Permite ingresar un número a cada posición del arreglo

        for (int i = 0; i < cantidad2; i++){
            System.out.println("Ingrese un número:");
            double entrada2 = sc.nextDouble();
            lista2[i] = entrada2;
        }

        double lista3[] = new double[cantidad2];


        //Permite verificar que los dos arreglos tengan la misma longitud

        if (cantidad == cantidad2){

            //Permite multiplicar cada elemento i del arreglo1 por cada elemento i del arreglo dos y sumar el total de esos productos

            for (int i = 0; i < cantidad; i++){
                double producto = lista[i] * lista2[i];
                lista3[i] = producto;

            }
        }else {
            System.out.println("No se puede realizar el producto punto");
        }

        if (lista3.length != 0){
            System.out.println("El producto directo entre los dos vectores es: ");
            for (double i: lista3){

                System.out.print(i + " ");
            }
        }

    }
}
