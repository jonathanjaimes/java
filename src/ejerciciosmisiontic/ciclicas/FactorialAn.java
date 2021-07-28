package ejerciciosmisiontic.ciclicas;

import java.util.Scanner;

public class FactorialAn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();

        //Permite imprimir el factorial de cada número

        for (int i = 1; i <= n; i++){
            int producto = 1;
            for (int j = 1; j <= i; j++){
                producto = producto * j;
            }
            System.out.print(producto + " ");
            //System.out.println("");

        }
        System.out.println("");
        for (int h = 1; h <= n; h++){
            System.out.print(h + " ");
        }
    }
}
