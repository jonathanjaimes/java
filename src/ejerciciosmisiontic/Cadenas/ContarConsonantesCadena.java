package ejerciciosmisiontic.Cadenas;

import java.util.Scanner;

public class ContarConsonantesCadena {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();

        //Permite convertir una cadena a un arreglo de caracteres

        char lista[] = palabra.toCharArray();
        int suma = 0;

        //Permite contar las consonantes del arreglo

        for (int x: lista){

            if ((x >= 66 && x <=68) || (x >= 70 && x <= 72) || (x >= 74 && x <= 78) || (x >= 80 && x <= 84) || (x >= 86 && x <= 90) || (x >= 98 && x <= 100) || (x >= 102 && x <= 104) || (x >= 106 && x <= 110) || (x >= 112 && x <= 116) || (x >= 118 && x <= 122)){
                suma = suma + 1;


            }
            //System.out.println(x);
        }

        System.out.println(suma);
        //System.out.println(lista.length);
    }
}
