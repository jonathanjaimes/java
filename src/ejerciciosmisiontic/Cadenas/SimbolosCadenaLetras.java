package ejerciciosmisiontic.Cadenas;

import java.util.Scanner;

public class SimbolosCadenaLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();

        //Permite convertir una cadena a un array de caracteres

        char lista[] = palabra.toCharArray();



        boolean bandera = true;

        //Permite modificar el estado de la bandera en caso de que en el array encuentre un elemento que no sea letra

        for (int x: lista){
            if (!((x >= 65 && x <=90) || (x >= 97 && x <= 122))){
                //System.out.println("FEO");
                bandera = false;
            }

        }

        //Permite imprimir mensaje dependiendo del estado de la bandera

        //System.out.println(bandera);
        if (bandera == true){
            System.out.println("Todos los símbolos son letras");
        }else {
            System.out.println("No son letras todos los símbolos");
        }
    }
}
