package ejerciciosmisiontic.Cadenas;

import java.util.Scanner;

public class Palindrome {

    //Funcion para invertir cadena

    public static String invert (String palabra){

        int longiPala = palabra.length();

        char lista[] = palabra.toCharArray();

        char lista2[] = new char[longiPala];

        int num = longiPala-1;

        for (int i = 0; i < longiPala; i++){
            lista2[i] = lista[num];
            num = num - 1;
        }
/*
        for (char x: lista2){
            System.out.println(x);
        }
*/

        String lista3[] = new String[longiPala];

        for (int i = 0; i < longiPala; i++){
            lista3[i] = Character.toString(lista2[i]);
        }

        /*
        for (String x: lista3){
            System.out.println(x);
        }*/

        StringBuffer cadena = new StringBuffer();

        for (int i = 0; i < longiPala; i++){
            cadena = cadena.append(lista3[i]);
        }

        String invertida = cadena.toString();

        //System.out.println(invertida);

        return invertida;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String pal = sc.next();

        //Se invierte la cadena

        String retorno = invert(pal);

        //Dependiendo de si la cadena invertida es igual a la original o no, imprimirá un mensaje

        if (pal.equals(retorno)){
            System.out.println("Es Palíndrome");
        }else {
            System.out.println("No es palíndrome");
        }

    }
}
