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
public class Septimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el monto prestado: ");
        double prestamo = sc.nextDouble();
        
        double interes = 0.03;
        
        double resultado = prestamo * Math.pow((1 + interes), 2);
        
        System.out.println("Monto a pagar: " + resultado);
        
    }
    
}
