package ejerciciosmisiontic.Cadenas;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();

        char lista[] = palabra.toCharArray();

        boolean bandera = true;

        for (int x: lista){
            if (!((x >= 65 && x <=90) || (x >= 97 && x <= 122))){
                //System.out.println("FEO");
                bandera = false;
            }

        }
        //System.out.println(bandera);
        if (bandera == true){
            System.out.println("Todos los símbolos son letras");
        }else {
            System.out.println("No son letras todos los símbolos");
        }
    }
}
