package ejerciciosmisiontic.Cadenas;

import java.util.Scanner;

public class CadenasIguales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();

        //Permite convertir cadena a array de caracteres

        char lista[] = palabra.toCharArray();

        System.out.println("Ingrese otra palabra: ");
        String palabra2 = sc.next();

        //Permite convertir cadena a array de caracteres

        char lista2[] = palabra2.toCharArray();

        boolean bandera = true;

        //Permite modificar la bandera en caso de que algún elemento i del primer array sea distinto al elemento i del segundo array

        if (lista.length == lista2.length){
            for (int i = 0; i < lista.length; i++){
                if (lista[i] != lista2[i]){
                    bandera = false;
                }
            }

            //Permite imprimir mensaje en función del estado de la bandera

            if (bandera == false){
                System.out.println("Las cadenas son diferentes");
            }else {
                System.out.println("Cadenas iguales");
            }
        }else{
            System.out.println("Cadenas diferentes");
        }

    }
}
