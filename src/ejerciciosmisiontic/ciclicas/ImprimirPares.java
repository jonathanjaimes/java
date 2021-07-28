package ejerciciosmisiontic.ciclicas;

import java.util.Scanner;

public class ImprimirPares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        //Permite imprimir pares

        while (numero >= 2){
            if (numero%2 == 0){
                System.out.println(numero);
            }
            numero = numero - 1;
        }
    }
}
