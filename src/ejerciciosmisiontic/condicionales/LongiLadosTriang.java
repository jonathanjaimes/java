package ejerciciosmisiontic.condicionales;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class LongiLadosTriang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> lista = new ArrayList<Double>();

        int n = 3;

        double num;

        //Permite ingresar las tres longitudes de un triángulo

        for (int i = 0; i < n; i++){
            System.out.println("Ingrese el número "+ (i+1));
            num = sc.nextDouble();
            lista.add((double) num);
        }

        //Permite ordenar la lista de menor a mayor

        Collections.sort(lista);

        for (Double h: lista){
            System.out.println(h);
        }

        //Permite obtener la suma de los lados más pequeños

        double suma = lista.get(0) + lista.get(1);

        //Permite imprimir un mensaje dependiendo si la longitud suma es mayor o menor que la longitud del lado más largo

        if (suma > lista.get(2)){
            System.out.println("El triangulo se puede construir");
        }else {
            System.out.println("No se puede construir");
        }

    }
}
