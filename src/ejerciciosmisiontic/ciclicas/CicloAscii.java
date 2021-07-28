package ejerciciosmisiontic.ciclicas;
import java.util.Scanner;
public class CicloAscii {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor entero: ");
        int valor = sc.nextInt();

        //Permite continuar en el ciclo mientras los valores no representen ascii letra mayúscula

        while (valor <97 || valor > 122){
            System.out.println("Ingrese un valor entero: ");
            valor = sc.nextInt();
        }
        System.out.println("El valor ingresado representa una letra minúscula");
    }
}
