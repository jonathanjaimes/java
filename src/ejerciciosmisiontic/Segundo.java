/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmisiontic;

/**
 *
 * @author Setrakian_Armitage
 */
import java.util.Scanner;

public class Segundo {

    /**
     * @param args the command line arguments
     */
    
    public static double volumen (double radioE, double radioC, double altura){
        double volumenEsfera = (4/3) * Math.PI * Math.pow(radioE, 2);
        double volumenCono = (Math.PI*radioC*altura)/3;
        double volumenTotal = volumenEsfera + volumenCono;
        return volumenTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la esfera: ");
        double radioEsfera = sc.nextDouble();
        System.out.println("Ingrese el radio del cono: ");
        double radioCono = sc.nextDouble();
        System.out.println("Ingrese la altura del cono: ");
        double altura = sc.nextDouble();
        
        double resultado = volumen(radioEsfera,radioCono, altura);
        
        System.out.println("El volumen total es " + resultado);
    }
    
}
