package ejerciciosmisiontic.condicionales;
import java.util.Scanner;
public class DistanciaPuntoCentroCirculo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Permite ingresar las coordenadas del centro del círculo

        System.out.println("Ingrese la coordenada x del centro del círculo: ");
        double centroX = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del centro del círculo: ");
        double centroY = sc.nextDouble();

        //Permite ingresar el radio del círculo

        System.out.println("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        //Permite ingresar las coordenadas del punto

        System.out.println("Ingrese la coordenada x del punto: ");
        double puntoX = sc.nextDouble();
        System.out.println("Ingrese la coordenada y del punto: ");
        double puntoY = sc.nextDouble();

        //Permite hallar la distancia del punto al centro del círculo

        double distanciaPuntoCentro = Math.pow(Math.pow((puntoX-centroX), 2) + Math.pow((puntoY - centroY), 2), 0.5);

        //Permite imprimir mensaje dependiendo de si el punto está o no en la circunferencia

        if (distanciaPuntoCentro <= radio){
            System.out.println("El punto está dentro del círculo");
        }else {
            System.out.println("No está en el círculo");
        }

    }
}
