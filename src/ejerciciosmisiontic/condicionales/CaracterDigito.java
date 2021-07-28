package ejerciciosmisiontic.condicionales;
import java.util.Scanner;

public class CaracterDigito {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");

        //Permite guardar el primer elemento de una cadena

        char letra = sc.next().charAt(0);

        //Permite convertir el elemento en código ASCII

        int codigo = (int) letra;

        //Permite imprimir mensaje dependiendo si el código es un código de dígito

        if (codigo >= 48 && codigo <= 57){
            System.out.println("El caracter ingresado es un dígito");
        }else {
            System.out.println("No es un dígito");
        }


    }
}
