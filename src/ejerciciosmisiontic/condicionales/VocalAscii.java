package ejerciciosmisiontic.condicionales;
import java.util.Scanner;
public class VocalAscii {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        boolean bandera = false;

        //Permite cambiar el estado de la bandera en caso de que el numero corresponda al código de la vocal minúscula

        if (numero == 97 || numero == 101 || numero == 105 || numero == 111 || numero == 117){
            bandera = true;
        }

        //Permite imprimir el mensaje dependiendo del estado de la bandera

        if (bandera == true){
            System.out.println("El número pertenece a una vocal minúscula");
        }else {
            System.out.println("No pertenece a una vocal minúscula");
        }

    }
}
