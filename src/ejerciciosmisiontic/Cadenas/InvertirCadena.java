package ejerciciosmisiontic.Cadenas;

import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();

        int longiPala = palabra.length();

        //Permite convertir cadena en array de caracteres

        char lista[] = palabra.toCharArray();

        //Permite crear un array con la misma longitud de la cadena ingresada

        char lista2[] = new char[longiPala];

        int num = longiPala-1;

        //Permite agregar en orden inverso cada elemento de lista a lista2

        for (int i = 0; i < longiPala; i++){
            lista2[i] = lista[num];
            num = num - 1;
        }
/*
        for (char x: lista2){
            System.out.println(x);
        }
*/

        //Agrega los elementos de lista2 a lista3 pero convertidos en cadena

        String lista3[] = new String[longiPala];

        for (int i = 0; i < longiPala; i++){
            lista3[i] = Character.toString(lista2[i]);
        }

        /*
        for (String x: lista3){
            System.out.println(x);
        }*/

        //Agrega cada elemento de lista3 a una cadenabuffer

        StringBuffer cadena = new StringBuffer();

        for (int i = 0; i < longiPala; i++){
            cadena = cadena.append(lista3[i]);
        }

        //Convierte cadenabuffer en cadena

        String invertida = cadena.toString();

        System.out.println(invertida);

    }

}
