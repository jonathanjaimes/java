/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmisiontic;
import java.util.Scanner;
/**
 *
 * @author Setrakian_Armitage
 */
public class Quinto {

    /**
     * @param args the command line arguments
     */
    
    public static double carne(int gallinas, int gallos, int pollos){
        double cantidadCarneGallinas = 6 * gallinas;
        double cantidadCarneGallos = 7 * gallos;
        double cantidadCarnePollos = 1 * pollos;
        
        double carneTotal = cantidadCarneGallinas + cantidadCarneGallos + cantidadCarnePollos;
        return carneTotal;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de gallinas: ");
        int gallinas = sc.nextInt();
        System.out.println("Ingrese la cantidad de gallos: ");
        int gallos = sc.nextInt();
        System.out.println("Ingrese la cantidad de pollos: ");
        int pollos = sc.nextInt();
        
        double resultado = carne(gallinas, gallos, pollos);
        System.out.println("La cantidad de carne de aves es " + resultado);
    }
    
}
