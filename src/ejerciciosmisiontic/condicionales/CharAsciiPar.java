package ejerciciosmisiontic.condicionales;
import java.util.Scanner;
public class CharAsciiPar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");

        //Permite guardar el primer elemento de una cadena en una variable de tipo caracter
        char letra = sc.next().charAt(0);

        //Permite convertir el caracter a código ASCII

        int codigo = (int) letra;



        if (codigo%2 == 0){
            System.out.println("El código ASCII es par");
        }else {
            System.out.println("El código ASCII no es par");
        }

         }
}
