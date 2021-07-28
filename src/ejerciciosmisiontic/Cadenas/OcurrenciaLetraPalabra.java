package ejerciciosmisiontic.Cadenas;

import java.util.Scanner;

public class OcurrenciaLetraPalabra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Permite ingresar una letra como caracter

        System.out.println("Ingresa una letra: ");
        String letra = sc.next();
        char letra2 = letra.charAt(0);

        //Permite ingresar una palabra como cadena

        System.out.println("Ingresa una palabra: ");
        String palabra = sc.next();

        int suma = 0;

        //Permite sumar uno cada vez que la letra2 sea igual a una letra de la palabra

        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) == (letra2)){
                suma = suma + 1;
            }
        }
        System.out.println(suma);
    }
}
