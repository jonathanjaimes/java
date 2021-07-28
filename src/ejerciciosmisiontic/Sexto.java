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
public class Sexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de panes: ");
        int p = sc.nextInt();
        System.out.println("Ingrese la cantidad de bolsas de leche: ");
        int m = sc.nextInt();
        System.out.println("Ingrese la cantidad de huevos: ");
        int h = sc.nextInt();
        System.out.println("Ingrese el billete a pagar: ");
        int billete = sc.nextInt();
        
        double totalCostoPanes = p * 300;
        double totalCostoLeche = m * 3300;
        double totalCostoHuevos = h * 350;
        
        double totalCompra = totalCostoPanes + totalCostoLeche + totalCostoHuevos;
        
        double cambio = 0;
        
        if (totalCompra <= billete){
             cambio = billete - totalCompra;
        }
        
        System.out.println("El cambio a recibir es: "+ cambio);
        
    }
    
}
