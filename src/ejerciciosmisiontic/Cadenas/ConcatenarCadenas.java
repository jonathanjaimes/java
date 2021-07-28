package ejerciciosmisiontic.Cadenas;

import java.util.Scanner;

public class ConcatenarCadenas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra");
        String palabra1 = sc.next();

        System.out.println("Ingresa otra palabra");
        String palabra2 = sc.next();

        //Permite concatenar dos cadenas

        String palabras = palabra1 + palabra2;

        System.out.println(palabras);
    }
}
