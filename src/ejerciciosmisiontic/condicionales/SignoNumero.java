package ejerciciosmisiontic.condicionales;
import java.util.Scanner;
public class SignoNumero {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero < 0){
            System.out.println("El número " + numero + " es negativo");
        }else if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        }else if (numero == 0){
            System.out.println("El número " + numero + " es neutro");
        }
    }
}
