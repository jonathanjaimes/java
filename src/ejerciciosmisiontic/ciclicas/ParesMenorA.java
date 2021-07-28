package ejerciciosmisiontic.ciclicas;

import java.util.Scanner;

public class ParesMenorA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número natural: ");
        int n = sc.nextInt();

        //Permite imprimir pares menores iguales a numero dado

        for (int i = n; i >= 2; i--){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
